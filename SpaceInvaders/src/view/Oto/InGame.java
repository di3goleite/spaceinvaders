/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Oto;

import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

/**
 *
 * @author marc
 */
public class InGame extends javax.swing.JPanel {
    
    private int x, y;
    private int side, height;
    
    /**
     * Creates new form InGame
     */
    public InGame(int side, int height, int x, int y) {
        initComponents();
        
        this.side = side;
        this.height = height;

        this.x = x;
        this.y = y;
        
        this.repaint();
        
       // PanelCamada1_InGame.repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {

        g.drawRect(side, height, x, y);
        g.fillRect(side, height, x, y);
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        if(evt.getKeyCode() == 65) { // Esquerda (A) 
            x-= 10;
        } else if(evt.getKeyCode() == 68) { // (D)
            x+= 10;
        }
        sideSide(x, y);
            
    }//GEN-LAST:event_formKeyPressed

    public void sideSide(int x, int y) {
      
        this.setXY(x, y);
        this.repaint();
        
       // PanelCamada1_InGame.repaint();
    }
     
    public void setXY(int x, int y) {

        this.x = x;
        this.y = y;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

      public static void main(String[] args) {
          
        JFrame oi = new JFrame("killllakiu");
        oi.setVisible(true);
        InGame kill = new InGame(20, 20, 400, 300);
        kill.setVisible(true);
        oi.setSize(800, 640);  //tamanho da tela
        oi.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //metodo como a aplicação é fechada
        oi.setResizable(false);
        oi.setContentPane(kill);
        kill.repaint();

          Scanner li = new Scanner(System.in);
         while(li.hasNext()) {
             System.out.println("Akie: "+li.nextLine());
         }
    }
}
