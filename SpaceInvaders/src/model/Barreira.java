/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.concurrent.ConcurrentLinkedQueue;
import model.observer.*;

/**
 *
 * @author lucas
 */
public class Barreira implements TiroListener, AlienListener{
    int x, y;
    ConcurrentLinkedQueue<BarreiraListener> listeners=new ConcurrentLinkedQueue<>();

    public Barreira(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void moveu(TiroEvent e) {
    
        if (getX() <= (((Tiro) e.getSource()).getX()) && getX() >= (((Tiro) e.getSource()).getX() - 5)
                && getY() <= (((Tiro) e.getSource()).getY() + 5) && getY() >= (((Tiro) e.getSource()).getY() - 5)) {
            disparaFoiAtingida();
            ((Tiro) e.getSource()).disparaBati();
        }
        
    }

    private void disparaFoiAtingida() {
    for(BarreiraListener b : listeners){
    b.foiAtingida(new BarreiraEvent(this));
    }
    }
    
    public void addBarreiraListener(BarreiraListener bl){
    listeners.add(bl);
    }
    public void removeBarreiraListener(BarreiraListener bl){
    listeners.remove(bl);
    }

    @Override
    public void foiAtingido(AlienEvent ae) {}

    @Override
    public void moveu(AlienEvent e) {
      if (getY() <= ((Alien) e.getSource()).getY()) {
            disparaFoiAtingida();
        }
    }

    
}
