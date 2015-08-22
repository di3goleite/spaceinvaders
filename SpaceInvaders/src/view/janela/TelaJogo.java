/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.janela;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import view.fases.FaseGrande;

/**
 *
 * @author lucasvinicius
 */
public class TelaJogo extends javax.swing.JFrame{
    /**
     * Creates new form TelaGrande
     * @param fase
     */
    public TelaJogo(final JPanel fase) {
        initComponents();
        fase.setFocusable(true);
            fase.addKeyListener((FaseGrande)fase);
        
        this.painelContemFases.add(fase, BorderLayout.CENTER);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelContemFases = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelContemFases.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelContemFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelContemFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelContemFases;
    // End of variables declaration//GEN-END:variables
}
