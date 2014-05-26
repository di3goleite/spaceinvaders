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
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author bililili
 */
public class Tiro implements TiroListener {

    private Collection<TiroListener> tiroListeners = new ArrayList<TiroListener>();
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
        timer.schedule(new Move(), 0);
    }

    public int getOrientacao() {
        return orientacao;
    }

    public int getPositionX() {
        return x;
    }
    
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

    void addTiroListerner(TiroListener tl) {
        tiroListeners.add(tl);
    }

    void removeTiroListerner(TiroListener tl) {
        tiroListeners.remove(tl);
    }

    @Override
    public void moveu(TiroEvent e) {
        if (getPositionX() == ((Tiro) e.getSource()).getPositionX() && 
            getPositionY() == ((Tiro) e.getSource()).getPositionY()) {
            
            
        }
    }

}
