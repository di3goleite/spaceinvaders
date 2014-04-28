/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Lucas
 */
public interface INave {
    
    
    /**
     *
     * @return
     */
    public int getPositionX();

    /**
     *
     * @return
     */
    public int getPositionY();

    /**
     *
     * @param i
     * @param positionY
     */
    public void mover();

    /**
     *
     */
    public void atira();
    
    
}
