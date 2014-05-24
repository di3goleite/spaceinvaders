/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import model.observer.TiroListener;

/**
 *
 * @author Lucas
 */
public abstract class Nave {
    
    private Collection <TiroListener> tiroListeners = new ArrayList<TiroListener>();
    
    protected int x;
    protected int y;
    protected Image myIcon;
    
    /**
     * 
     * @param iconImage 
     */
    public abstract void myImage(Image iconImage);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMyIcon(Image myIcon) {
        this.myIcon = myIcon;
    }
    
    /**
     *
     * @return
     */
    public int getPositionX(){
    return x;
    }

    /**
     *
     * @return
     */
    public int getPositionY(){
    return y;
    }

    
    /**
     *
     */
    public abstract void atira();
    
    void addTiroListerner(TiroListener tl){
    tiroListeners.add(tl);
    }
    void removeTiroListerner(TiroListener tl){
    tiroListeners.remove(tl);
    }

}
