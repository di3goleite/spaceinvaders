/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public interface IPlayer{

    public void atira();

    public void mover(int direcao);
    
    public int getVidas();

    public int getX();

    public int getY();
    
    public ImageIcon getImagem();
    
}
