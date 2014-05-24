/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import model.observer.PlayerEvent;
import model.observer.PlayerListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 * Classe de navens alieniginas comum.
 * @author Lucas
 */
public class Alien extends Nave implements PlayerListener,TiroListener{
    
    private Collection <TiroListener> telefoneListeners = new ArrayList<TiroListener>();

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
    
   
    public void mover() {
    
    }

    /**
     *
     */
    @Override
    public void atira() {
    Tiro p =new Tiro(this.getPositionX(), this.getPositionY(),0);
    
    }

    @Override
    public void myImage(Image iconImage) {
        // setar sua imagem;
        myIcon = iconImage;
    }

    @Override
    public void moveu(PlayerEvent pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atirou(PlayerEvent pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void foiAtingido(PlayerEvent pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveu(TiroEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
