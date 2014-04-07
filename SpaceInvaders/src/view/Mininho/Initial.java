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
 * @author Dracul
 */
public class Initial extends JFrame{
   
        static Tela t=new Tela();
    Initial() {
    this.setTitle("SPACE INVADERS");  //titulo da tela
        this.setSize(800, 640);  //tamanho da tela
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //metodo como a aplicação é fechada
        setResizable(false);
        this.setContentPane(t);
    }
    public static void main(String[] args) {
        new Initial().setVisible(true);
        t.repaint();
   }
}
