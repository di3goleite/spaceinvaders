/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.flyweight;

import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class ImagemAlien3 implements MyImagem{
ImageIcon iconImage=new ImageIcon("src/interface1/multimidia/imagens/personagens/inimigo2-1.fw.png");

    /**
     *
     * @param iconImage
     */
    @Override
    public void setImage(ImageIcon iconImage) {
    this.iconImage=iconImage;
    }

    /**
     *
     * @return
     */
    @Override
    public ImageIcon getImage() {
    return iconImage;
    }
      
    
      
}
