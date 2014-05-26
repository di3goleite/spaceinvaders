/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.interfaces;

import java.awt.Image;

/**
 *
 * @author lucas
 */
public interface IAlien {

    public int getPositionX();

    public int getPositionY();

    public void atira();

 
    public void myImage(Image iconImage);
    
   public void mover();
    
}
