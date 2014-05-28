/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TimerTask;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author bililili
 */
public class Tiro implements TiroListener {

    private ConcurrentLinkedQueue<TiroListener> tiroListeners = new ConcurrentLinkedQueue<TiroListener>();
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
        timer.schedule(new Move(), 0, 1000/30);
       
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
    public int getPositionX() {
        return x;
    }
    
    /**
     *
     * @return
     */
    public int getPositionY() {
        return y;
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
        if (getPositionX() == ((Tiro) e.getSource()).getPositionX() && 
            getPositionY() == ((Tiro) e.getSource()).getPositionY()) {
            
            
        }
    }

}
