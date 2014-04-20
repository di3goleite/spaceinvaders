/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Oficial;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Lucas Vinicius
 */
public class Tutorial extends JPanel implements ActionListener{
    
    Timer tempo = new Timer(5, this);
    int x = 0, velX = 2;
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawLine(1, 1, 500, 500);
    }
    
    public static void main(String [] args){
        Tutorial t = new Tutorial();
        JFrame janela = new JFrame();
        janela.setTitle("Teste");
        janela.setSize(500, 500);
        janela.add(t);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
