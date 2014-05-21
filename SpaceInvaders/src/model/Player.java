/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;
import model.observer.AlienEvent;
import model.observer.AlienListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author Lucas
 */
public class Player extends Nave implements TiroListener, AlienListener{
    private int vidas;
    public static final int direita=1;
    public static final int esquerda=0;
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

    public void mover(int direcao) {
    if(direcao==direita){
    if(this.x+10!=640){
    this.x+=10;
    }
    }
    else if(this.x-10!=0){ this.x-=10; }
    }

    
    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public void atira() {
    Tiro tiro = new Tiro(this.getPositionX(),this.getPositionY(), 0);
    }    

    @Override
    public void myImage(Image iconImage) {
        // setar sua imagem;
        myIcon = iconImage;
    }
  
    
    @Override
    public void moveu(TiroEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveu(AlienEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atirou(AlienEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void foiAtingido(AlienEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
