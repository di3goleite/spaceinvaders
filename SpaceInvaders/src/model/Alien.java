/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Classe de navens alieniginas comum.
 * @author Lucas
 */
public class Alien implements IAlien{
    private int x,y;

    /**
     *
     * @param x
     * @param y
     */
    public Alien (int x, int y) {
    this.x=x;
    this.y=y;
    }

    /**
     *
     * @return
     */
    @Override
    public int getPositionX() {
    return x;
    }

    /**
     *
     * @return
     */
    @Override
    public int getPositionY() {
    return y;
    }

    /**
     *
     * @param x
     * @param y
     */
    @Override
    public void mover(int x, int y) {
    this.x=x;
    this.y=y;
    }

    /**
     *
     */
    @Override
    public void atira() {
    Projection p =new Projection(this.getPositionX(), this.getPositionY());
    p.move(0);
    }
}
