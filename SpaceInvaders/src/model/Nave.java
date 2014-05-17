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
    
    protected Collection <TiroListener> tiroListeners = new ArrayList<TiroListener>();
    
   /*protected*/ int x;
    int y;
    Image myIcon;
    
    /**
     * 
     * @param iconImage 
     */
    public abstract void myImage(Image iconImage);
    
    /**
     *
     * @return
     */
    public abstract int getPositionX();

    /**
     *
     * @return
     */
    public abstract int getPositionY();

    /**
     * 
     */
    public abstract void mover();
    
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
