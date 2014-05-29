/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.composite;

import javax.swing.ImageIcon;
import model.Jogo;
import model.Tiro;
import model.observer.AlienListener;

/**
 *
 * @author lucas
 */
public interface INaveInimiga {
    
    /**
     *
     * @return
     */
    public int getX();

    /**
     *
     * @return
     */
    public int getY();

    /**
     *
     * @return 
     */
    public Tiro atira();

    /**
     *
     */
    public void mover();

    public void mover(int descer);

    public void mudarOrientacao();

    public void addAlienListener(AlienListener listener);

    
}
