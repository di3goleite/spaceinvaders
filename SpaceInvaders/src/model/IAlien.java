/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author lucas
 */

public interface IAlien extends INave{
    
    /**
     *
     * @return
     */
    @Override
    public int getPositionX();

    /**
     *
     * @return
     */
    @Override
    public int getPositionY();

    /**
     *
     * @param i
     * @param positionY
     */
    @Override
    public void mover(int i, int positionY);

    /**
     *
     */
    @Override
    public void atira();
    
}
