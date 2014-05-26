/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TimerTask;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author lucas
 */
public class Tiro implements TiroListener {

    private Collection<TiroListener> tiroListeners = new ArrayList<TiroListener>();
    int x, y;
    int orientacao;

    Tiro(int positionX, int positionY, int orientacao) {
        this.orientacao = orientacao;
        move(orientacao);
        this.x = positionX;
        this.y = positionY;
    }

    int getPositionX() {
        return x;
    }

    private void move(final int orientacao) {
        TimerTask runer = new TimerTask() {

            @Override
            public void run() {
                disparaMoveu();
                if (orientacao == 0) {
                    y = y - 10;
                } else {
                    y = y + 10;
                }
            }
        };
    }

    private void disparaMoveu() {
        TiroEvent evento = new TiroEvent(this);
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
        if (orientacao != ((Tiro) e.getSource()).orientacao) {
            if (x == ((Tiro) e.getSource()).x) {
                //this.acertei();
            }
        }
    }

}
