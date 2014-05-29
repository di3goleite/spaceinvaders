/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.observer.BatiEvent;
import model.observer.BatiListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author bililili
 */
public class Tiro implements TiroListener {

    private ConcurrentLinkedQueue<TiroListener> tiroListeners = new ConcurrentLinkedQueue<>();
    private ConcurrentLinkedQueue <BatiListener> batiListener= new ConcurrentLinkedQueue<>();
    int x, y;
    int orientacao;
    Timer timer;
    TiroEvent evento;

    Tiro(int positionX, int positionY, int orientacao) {
        
        this.orientacao = orientacao;
        this.x = positionX;
        this.y = positionY;
        
        evento = new TiroEvent(this);
        timer = new Timer();
        timer.schedule(new Move(), 0, 1000/20);
       
    }

    /**
     *
     * @return
     */
    public int getOrientacao() {
        return orientacao;
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }
    
    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }


    public void disparaBati() {
    for (BatiListener t : batiListener) {
            t.bati(new BatiEvent(this));
        }
    
            timer.cancel();
    }

    public void addBatiListerner(Jogo tl) {
    batiListener.add(tl);
    }

    private class Move extends TimerTask {

        @Override
        public void run() {
            disparaMoveu();
            if (getOrientacao() == 0) {
                y = y - 10;
            } else {
                y = y + 10;
            }
        }
    }

    private void disparaMoveu() {
        
        for (TiroListener t : tiroListeners) {
            t.moveu(evento);
        }

    }

    public void addTiroListerner(TiroListener tl) {
        tiroListeners.add(tl);
    }

    public void removeTiroListerner(TiroListener tl) {
        tiroListeners.remove(tl);
    }

    /**
     *
     * @param e
     */
    @Override
    public void moveu(TiroEvent e) {
        if (getX() <= ( ((Tiro) e.getSource()).getX() +5) && getX() >= ( ((Tiro) e.getSource()).getX()-5) && 
            getY() <= ( ((Tiro) e.getSource()).getY() +10) && getY() >= (((Tiro) e.getSource()).getY())-10) {
            
            disparaBati();
            ((Tiro)e.getSource()).disparaBati();
        }
    }

}
