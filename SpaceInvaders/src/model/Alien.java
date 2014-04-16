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
public class Alien implements IAlien{
    private int x,y;

    public Alien (int x, int y) {
    this.x=x;
    this.y=y;
    }

    @Override
    public int getPositionX() {
    return x;
    }

    @Override
    public int getPositionY() {
    return y;
    }

    @Override
    public void mover(int x, int y) {
    this.x=x;
    this.y=y;
    }

    @Override
    public Projection atira() {
    return new Projection(this.getPositionX(), this.getPositionY());
    }
}
