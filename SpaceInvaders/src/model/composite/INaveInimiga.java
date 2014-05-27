/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.composite;

import javax.swing.ImageIcon;
import model.Tiro;

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
     */
    public Tiro atira();

    /**
     *
     */
    public void mover();

    public void mover(int descer);

    public void mudarOrientacao();
    
}
