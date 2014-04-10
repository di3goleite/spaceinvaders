/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Oto;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author marc
 */
public class GameBoy extends javax.swing.JFrame {

    private Component history;
    private Component beforeGame;
    private Component inGame;
    
    private CardLayout layout;

    /**
     * Creates new form GameBoy
     */
    public GameBoy() {
        initComponents();
        this.setTitle("Space INVADERS - KAIZOKU ONI, ORE WA NARU");
        this.setResizable(false);
        layout = new CardLayout();
        panelCamada1_GameBoy.setLayout(layout);
        //
        this.beforeGame = new BeforeGame(this);
        panelCamada1_GameBoy.add(beforeGame, "fi");
        //
        this.history = new History(this);
        panelCamada1_GameBoy.add(history, "tw");
        //
        this.inGame = new InGame(20, 20, 400, 300);
        panelCamada1_GameBoy.add(inGame, "th");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCamada1_GameBoy = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelCamada1_GameBoyLayout = new javax.swing.GroupLayout(panelCamada1_GameBoy);
        panelCamada1_GameBoy.setLayout(panelCamada1_GameBoyLayout);
        panelCamada1_GameBoyLayout.setHorizontalGroup(
            panelCamada1_GameBoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelCamada1_GameBoyLayout.setVerticalGroup(
            panelCamada1_GameBoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCamada1_GameBoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCamada1_GameBoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                GameBoy GB = new GameBoy();
                GB.setVisible(true);
                GB.setLocationRelativeTo(null);

                GB.Screen();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelCamada1_GameBoy;
    // End of variables declaration//GEN-END:variables

   public JPanel get() {
       return panelCamada1_GameBoy;
   }
    
    void Screen() {
    
        layout.show(panelCamada1_GameBoy, "fi");
    }

    void startHistory() {
        
        layout.show(panelCamada1_GameBoy, "tw");
    }

    void startGame() {
        
        layout.show(panelCamada1_GameBoy, "th");      
    }
}
