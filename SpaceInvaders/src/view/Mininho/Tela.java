/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Mininho;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Lucas
 */
public class Tela extends JPanel{
    
    int x=10,y=10;
    
    @Override
        protected void paintComponent(Graphics g) {
    
        g.drawRect(20, 20, x, y);
    
    }
    
}
