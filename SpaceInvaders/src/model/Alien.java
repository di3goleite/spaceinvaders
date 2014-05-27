/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.ImageIcon;
import model.composite.INaveInimiga;
import model.flyweight.MyImagem;
import model.observer.PlayerEvent;
import model.observer.PlayerListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 * Classe de navens alieniginas comum.
 *
 * @author Lucas
 */
public class Alien implements PlayerListener, TiroListener, INaveInimiga {

    private Collection<TiroListener> tiroListeners = new ArrayList<TiroListener>();

    /**
     *
     */
    protected int x;

    /**
     *
     */
    protected int y;

    /**
     *
     */
    protected MyImagem myIcon;
    private int orientacao = 0;

    /**
     *
     * @param x
     * @param y
     */
    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     *
     * @return
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     *
     */
    @Override
    public void mover() {
        if (orientacao == 0) {
            this.x--;
        }
    }

    /**
     *
     */
    public Tiro atira() {
        return new Tiro(this.getX(), this.getY(), 0);

    }

    /**
     *
     * @param iconImage
     */
    public void setImage(ImageIcon iconImage) {
        // setar sua imagem;
        myIcon.setImage(iconImage);
    }

    /**
     *
     * @param pe
     */
    @Override
    public void moveu(PlayerEvent pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param pe
     */
    @Override
    public void atirou(PlayerEvent pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param pe
     */
    @Override
    public void foiAtingido(PlayerEvent pe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param e
     */
    @Override
    public void moveu(TiroEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public ImageIcon getImageIcon() {
    return myIcon.getImage();
    }


}
