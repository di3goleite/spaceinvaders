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
public class Player {
    
    private int vidas;
    private int x, y;

    public Player(int vidas, int x, int y) {
        this.vidas = vidas;
        this.x = x;
        this.y = y;
    }

    public Player(int x, int y) {
    this.x=x;
    this.y=y;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPositionX() {
    return x;
    }

    public int getPositionY() {
    return y;
    }

    public void mover(int x, int y) {
    this.x=x;
    this.y=y;
    }

    Projection atira() {
    return new Projection(this.getPositionX(),this.getPositionY());
    }
    
    
}
