/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Oto;

import java.awt.BorderLayout;
import java.awt.Graphics;

/**
 *
 * @author marc
 */
public class InGame extends javax.swing.JPanel {
    
    
     private int x, y;
    private int side, height;

    @Override
    protected void paintComponent(Graphics g) {

        g.drawRect(side, height, x, y);
    }

    public void setXY(int x, int y) {

        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
            
    /**
     * Creates new form InGame
     */
    public InGame(int side, int height, int x, int y) {
        initComponents();
        
        this.side = side;
        this.height = height;

        this.x = x;
        this.y = y;
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCamada1_InGame = new javax.swing.JPanel();

        PanelCamada1_InGame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelCamada1_InGameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelCamada1_InGameLayout = new javax.swing.GroupLayout(PanelCamada1_InGame);
        PanelCamada1_InGame.setLayout(PanelCamada1_InGameLayout);
        PanelCamada1_InGameLayout.setHorizontalGroup(
            PanelCamada1_InGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelCamada1_InGameLayout.setVerticalGroup(
            PanelCamada1_InGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCamada1_InGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCamada1_InGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PanelCamada1_InGameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelCamada1_InGameKeyPressed
        
        int x = this.getX(), 
            y = this.getY();
        if(evt.getKeyCode() == 37) { //Esquerda
            x -= 10;                
        } else if(evt.getKeyCode() == 39) {
            x += 10;
        }    
        this.sideSide(x, y);
    }//GEN-LAST:event_PanelCamada1_InGameKeyPressed

    public void sideSide(int x, int y) {
      
        this.setXY(x, y);
        this.repaint();
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCamada1_InGame;
    // End of variables declaration//GEN-END:variables

}
