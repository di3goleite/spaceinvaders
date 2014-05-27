/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.flyweight;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public interface MyImagem{

    /**
     *
     * @param iconImage
     */
    public void setImage(ImageIcon iconImage);

    /**
     *
     * @return
     */
    public ImageIcon getImage();
}
