/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;

/**
 *
 * @author Lucas
 */
public abstract class Nave {
    
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
     * @param i
     * @param positionY
     */
    public abstract void mover(int x, int y);
    
    /**
     * 
     */
    public abstract void mover();
    
    /**
     *
     */
    public abstract void atira();
    
    
}
