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
import model.flyweight.ImagemAlien1;
import model.flyweight.MyImagem;
import model.observer.AlienEvent;
import model.observer.AlienListener;
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

    private Collection<AlienListener> alienListener = new ArrayList<>();
    

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
    protected MyImagem myIcon = new ImagemAlien1();
    private int orientacao = 1;

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
            this.x-=10;
        } else {
            this.x+=10;
        }
    }

    @Override
    public void mover(int descer) {
        y+=10;
    }

    /**
     *
     * @return 
     */
    @Override
    public Tiro atira() {
        return new Tiro(this.getX(), this.getY(), 1);

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
          if (getX() <= ( ((Tiro) e.getSource()).getPositionX() +10) && getX() >= ( ((Tiro) e.getSource()).getPositionX() -10) && 
            getY() <= ( ((Tiro) e.getSource()).getPositionY() +10) && getY() >= ( ((Tiro) e.getSource()).getPositionY() -10)) {
              disparaAlienMorreu();
        }
    }

    /**
     *
     * @return
     */
    public ImageIcon getImageIcon() {
        return myIcon.getImage();
    }

    @Override
    public void mudarOrientacao() {
     orientacao = (orientacao == 1)? 0: 1;

}

    private void disparaAlienMorreu() {
        for (AlienListener t : alienListener) {
            t.foiAtingido(new AlienEvent(this));
        }
      
    }
    
    public void addAlienListener(AlienListener e){
        alienListener.add(e);
    }
}
