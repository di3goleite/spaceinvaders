/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;
import model.flyweight.ImagemPlayer;
import model.observer.AlienEvent;
import model.observer.AlienListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author Lucas
 */
public class Player implements TiroListener, IPlayer, AlienListener{
    private int vidas;
    public static final int direita=1;
    public static final int esquerda=0;
    protected int x;
    protected int y;
    protected ImagemPlayer myIcon;
    /**
     *
     * @param vidas
     * @param x
     * @param y
     */
    public Player(int vidas, int x, int y) {
        this.vidas = vidas;
        this.setX(x);
        this.setY(y);
    }

    /**
     *
     * @return
     */
    @Override
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

    public void mover(int direcao) {
    if(direcao==direita){
    if(this.getPositionX()+10!=640){
    this.setX(this.getPositionX()+10);
    }
    }
    else if(this.x-10!=0){ this.x-=10; }
    }

    
    
   
    @Override
    public void atira() {
    Tiro tiro = new Tiro(this.getPositionX(),this.getPositionY(), 0);
    }    

    public void myImage(Image iconImage) {
        // setar sua imagem;
        myIcon.myImage(iconImage);
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

    private void setX(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setY(int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPositionX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPositionY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addTiroListerner(Alien a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
