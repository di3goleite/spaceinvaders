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
public interface IAlien {

    public int getPositionX();
    public int getPositionY();
    public void mover(int i, int positionY);
    public Projection atira();
}
