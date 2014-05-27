/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.Tiro;

/**
 *
 * @author lucas
 */
public interface IPlayer{

    /**
     *
     * @return 
     */
    public Tiro atira();

    /**
     *
     * @param direcao
     */
    public void mover(int direcao);
    
    /**
     *
     * @return
     */
    public int getVidas();

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
    public ImageIcon getImagem();
    
}
