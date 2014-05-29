/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.observer.*;

/**
 *
 * @author lucas
 */
public class Barreira implements TiroListener{
    int x, y;

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
    
        if (getX() <= (((Tiro) e.getSource()).getX()) && getX() >= (((Tiro) e.getSource()).getX() - 40)
                && getY() <= (((Tiro) e.getSource()).getY() + 10) && getY() >= (((Tiro) e.getSource()).getY() - 10)) {
            
            ((Tiro) e.getSource()).disparaBati();
        }
        
    }

    
}
