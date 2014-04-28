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
public class Player implements INave{
    
    private int vidas;
    private int x, y;

    /**
     *
     * @param vidas
     * @param x
     * @param y
     */
    public Player(int vidas, int x, int y) {
        this.vidas = vidas;
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param x
     * @param y
     */
    public Player(int x, int y) {
    this.x=x;
    this.y=y;
    }

    /**
     *
     * @return
     */
    public int getVidas() {
        return vidas;
    }

    /**
     *
     * @param vidas
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return
     */
    public int getPositionX() {
    return x;
    }

    /**
     *
     * @return
     */
    public int getPositionY() {
    return y;
    }

    /**
     *
     * @param x
     * @param y
     */
    public void mover() {
    this.x=x;
    this.y=y;
    }

    @Override
    public void atira() {
    new Projection(this.getPositionX(),this.getPositionY());
    }
    
    
}
