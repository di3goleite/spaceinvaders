/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.flyweight;

import java.awt.Image;

/**
 *
 * @author lucas
 */
public class ImagemBarreira implements MyImagem{
Image iconImage;
    
    @Override
    public void myImage(Image iconImage) {
        this.iconImage=iconImage;
    }    
}
