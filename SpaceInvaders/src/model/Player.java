/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.ImageIcon;
import model.flyweight.ImagemPlayer;
import model.interfaces.IPlayer;
import model.observer.AlienEvent;
import model.observer.AlienListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author Lucas
 */
public class Player implements TiroListener, IPlayer, AlienListener {

    private int vidas;

    /**
     *
     */
    public static final int direita = 1;

    /**
     *
     */
    public static final int esquerda = 0;

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
    protected ImagemPlayer myIcon = new ImagemPlayer();
    private static Player INSTANCE;
    private Collection<TiroListener> tiroListeners = new ArrayList<>();

    /**
     *
     * @param vidas
     * @param x
     * @param y
     */
    private Player(int vidas, int x, int y) {
        this.vidas = vidas;
        this.setX(x);
        this.setY(y);
    }

    /**
     *
     * @return
     */
    public static Player getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Player(3, 320, 300);
        }
        return Player.INSTANCE;
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

    /**
     *
     * @param direcao
     */
    @Override
    public void mover(int direcao) {
        if (direcao == direita) {
            if (this.getX() + 10 != 600) {
                this.setX(this.getX() + 10);
            }
        } else {
            if (this.x - 10 != 0) {
                this.x -= 10;
            }
        }
    }

    /**
     *
     */
    @Override
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
     * @param e
     */
    @Override
    public void moveu(TiroEvent e) {
        if (getX() <= ( ((Tiro) e.getSource()).getX() +10) && getX() >= ( ((Tiro) e.getSource()).getX() -10) && 
            getY() <= ( ((Tiro) e.getSource()).getY() +10) && getY() >= ( ((Tiro) e.getSource()).getY() -10)) 
        
            disparaPlayerLevouTiro();
            ((Tiro) e.getSource()).disparaBati();
    }

    /**
     *
     * @param ae
     */
    @Override
    public void foiAtingido(AlienEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void addTiroListerner(Alien a) {
        tiroListeners.add(a);
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
     * @return
     */
    @Override
    public ImageIcon getImagem() {
        return myIcon.getImage();
    }

   

}
