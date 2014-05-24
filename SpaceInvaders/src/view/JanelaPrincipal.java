/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import javax.swing.JFrame;

/**
 *
 * @author Vinícius Assis
 */
public class JanelaPrincipal extends javax.swing.JFrame {

  
    /**
     * Indica qual parte da historinha sera exibida no momento
     */
    private int contaHistorinha;
    private Fase fase;
    private Thread moverInimigos;
      /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal(Fase f) {
        initComponents();
        this.fase = f;
        this.painelJogo.add(fase, BorderLayout.CENTER);
        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed");
            }

        });
        f.setFocusable(true);
    }
    /**
     * Metodo responsavel por mostrar o painel desejado no momento. 
     * No parametro nome, deve ser especificado qual painel sera exibido
     * No parametro qualPainel, deve ser especificado qual dos paineis principais deseja-se trabalhar
     * @param nome
     * @param qualPainel 
     */
    private void mostraTelas(String nome, String qualPainel){
        CardLayout card;
        if(qualPainel.equals("inferior")){
            card = (CardLayout)this.painelInferior.getLayout();
            card.show(this.painelInferior, nome);
        }
        else if(qualPainel.equals("superior")){
            card = (CardLayout)this.painelSuperior.getLayout();
            card.show(this.painelSuperior, nome);
        }
        else if(qualPainel.equals("historinha")){
            card = (CardLayout)this.painelHistorinha.getLayout();
            card.show(this.painelHistorinha, nome);
        }
        this.fase.setFocusable(true);
    }
    /**
     * Responsavel por mudar os paineis na hora de mostrar a historia
     */
    private void mudaHistorinha(){
        switch(this.contaHistorinha){
                case 0:
                    this.mostraTelas("cena1", "historinha");
                    this.labelIndicaCena.setText("Planeta Thousand Sunny");
                    break;
                case 1:
                    this.mostraTelas("cena2", "historinha");
                    this.labelIndicaCena.setText("Temperatura: 200 °C");
                    break;
                case 2:
                    this.mostraTelas("cena3", "historinha");
                    this.labelIndicaCena.setText("#PartiuTerra");
                    break;
                case 3:
                    this.mostraTelas("cena4", "historinha");
                    this.labelIndicaCena.setText("SOCOOORRO!!!");
                    break;
                case 4:
                    this.mostraTelas("cena5", "historinha");
                    this.labelIndicaCena.setText("Ataquem os Aliens");
                    break;
            }
        this.fase.setFocusable(true);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInferior = new javax.swing.JPanel();
        painelInferiorMenuP = new javax.swing.JPanel();
        botaoPlay = new javax.swing.JButton();
        botaoScore = new javax.swing.JButton();
        botaoHelp = new javax.swing.JButton();
        botaoAbout = new javax.swing.JToggleButton();
        labelMenuP = new javax.swing.JLabel();
        painelInferiorHistorinha = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelIndicaCena = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoEsquerda = new javax.swing.JButton();
        botaoDireita = new javax.swing.JButton();
        botaoSkip = new javax.swing.JButton();
        painelSuperior = new javax.swing.JPanel();
        painelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        painelHistorinha = new javax.swing.JPanel();
        cena1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cena2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cena3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cena4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cena5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        painelJogo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("space INVADERS");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 690));
        setResizable(false);

        painelInferior.setLayout(new java.awt.CardLayout());

        painelInferiorMenuP.setBackground(new java.awt.Color(0, 0, 0));
        painelInferiorMenuP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "D.L.O.L Entertainment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, null, new java.awt.Color(255, 255, 255)));

        botaoPlay.setBackground(new java.awt.Color(250, 250, 250));
        botaoPlay.setText("PLAY");
        botaoPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPlayActionPerformed(evt);
            }
        });
        painelInferiorMenuP.add(botaoPlay);

        botaoScore.setBackground(new java.awt.Color(250, 250, 250));
        botaoScore.setText("HIGH SCORE");
        painelInferiorMenuP.add(botaoScore);

        botaoHelp.setBackground(new java.awt.Color(250, 250, 250));
        botaoHelp.setText("HELP");
        botaoHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHelpActionPerformed(evt);
            }
        });
        painelInferiorMenuP.add(botaoHelp);

        botaoAbout.setBackground(new java.awt.Color(250, 250, 250));
        botaoAbout.setText("ABOUT");
        botaoAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAboutActionPerformed(evt);
            }
        });
        painelInferiorMenuP.add(botaoAbout);

        labelMenuP.setForeground(new java.awt.Color(255, 255, 255));
        painelInferiorMenuP.add(labelMenuP);

        painelInferior.add(painelInferiorMenuP, "painel1");

        painelInferiorHistorinha.setBackground(new java.awt.Color(0, 0, 0));
        painelInferiorHistorinha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "D.L.O.L Entertainment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, null, new java.awt.Color(255, 255, 255)));
        painelInferiorHistorinha.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        labelIndicaCena.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelIndicaCena.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelIndicaCena);

        painelInferiorHistorinha.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        botaoEsquerda.setBackground(new java.awt.Color(250, 250, 250));
        botaoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/esquerda.jpg"))); // NOI18N
        botaoEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEsquerdaActionPerformed(evt);
            }
        });
        jPanel2.add(botaoEsquerda);

        botaoDireita.setBackground(new java.awt.Color(250, 250, 250));
        botaoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/direita.jpg"))); // NOI18N
        botaoDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDireitaActionPerformed(evt);
            }
        });
        jPanel2.add(botaoDireita);

        botaoSkip.setBackground(new java.awt.Color(250, 250, 250));
        botaoSkip.setText("SKIP");
        botaoSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSkipActionPerformed(evt);
            }
        });
        jPanel2.add(botaoSkip);

        painelInferiorHistorinha.add(jPanel2, java.awt.BorderLayout.LINE_END);

        painelInferior.add(painelInferiorHistorinha, "painel2");

        getContentPane().add(painelInferior, java.awt.BorderLayout.PAGE_END);

        painelSuperior.setLayout(new java.awt.CardLayout());

        painelLogo.setLayout(new java.awt.BorderLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/LOGO.png"))); // NOI18N
        painelLogo.add(labelLogo, java.awt.BorderLayout.PAGE_END);

        painelSuperior.add(painelLogo, "painel1");

        painelHistorinha.setLayout(new java.awt.CardLayout());

        cena1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 2));
        cena1.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/cenas/cena1.png"))); // NOI18N
        cena1.add(jLabel1, java.awt.BorderLayout.CENTER);

        painelHistorinha.add(cena1, "cena1");

        cena2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 2));
        cena2.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/cenas/cena2.png"))); // NOI18N
        cena2.add(jLabel2, java.awt.BorderLayout.CENTER);

        painelHistorinha.add(cena2, "cena2");

        cena3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 2));
        cena3.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/cenas/cena3.png"))); // NOI18N
        cena3.add(jLabel3, java.awt.BorderLayout.CENTER);

        painelHistorinha.add(cena3, "cena3");

        cena4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 2));
        cena4.setLayout(new java.awt.BorderLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/cenas/cena4.png"))); // NOI18N
        cena4.add(jLabel4, java.awt.BorderLayout.CENTER);

        painelHistorinha.add(cena4, "cena4");

        cena5.setBackground(new java.awt.Color(250, 250, 250));
        cena5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cena5.setLayout(new java.awt.BorderLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface1/multimidia/imagens/cenas/cena5.png"))); // NOI18N
        cena5.add(jLabel5, java.awt.BorderLayout.CENTER);

        painelHistorinha.add(cena5, "cena5");

        painelSuperior.add(painelHistorinha, "painel2");

        painelJogo.setLayout(new java.awt.BorderLayout());
        painelSuperior.add(painelJogo, "painel3");

        getContentPane().add(painelSuperior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAboutActionPerformed
        if(this.botaoAbout.isSelected())
            this.labelMenuP.setText("Developed for us -> DiegoBoy, Menininho, Uchiha e Stealth");
        else
            this.labelMenuP.setText("");
    }//GEN-LAST:event_botaoAboutActionPerformed

    private void botaoHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoHelpActionPerformed

    private void botaoSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSkipActionPerformed

        this.mostraTelas("painel3", "superior");
        
        this.moverInimigos = new Thread(this.fase.new MoveInimigos());
        this.moverInimigos.start();
    }//GEN-LAST:event_botaoSkipActionPerformed

    private void botaoPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPlayActionPerformed
        this.mostraTelas("painel2", "inferior");
        this.mostraTelas("painel2", "superior");
        this.botaoEsquerda.setEnabled(false);
        this.contaHistorinha = 0;
        this.labelIndicaCena.setText("Planeta Thousand Sunny");
    }//GEN-LAST:event_botaoPlayActionPerformed

    private void botaoEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEsquerdaActionPerformed
        this.contaHistorinha-=1;
        this.botaoDireita.setEnabled(true);
        if(this.contaHistorinha == 0){
            this.botaoEsquerda.setEnabled(false);
        }
        this.mudaHistorinha();
        this.botaoSkip.setText("SKIP");
    }//GEN-LAST:event_botaoEsquerdaActionPerformed

    private void botaoDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDireitaActionPerformed
        this.contaHistorinha+=1;
        this.botaoEsquerda.setEnabled(true);
         if(this.contaHistorinha == 4){
            this.botaoDireita.setEnabled(false);
            this.botaoSkip.setText("PLAY");
        }
         
         this.mudaHistorinha();
    }//GEN-LAST:event_botaoDireitaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Fase f = new Fase();
                JanelaPrincipal ini = new JanelaPrincipal(f);
                ini.setVisible(true);
                ini.setTitle("space Invaders");
                ini.setLocationRelativeTo(null);
                ini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ini.setSize(800, 690);
                f.setFocusable(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoAbout;
    private javax.swing.JButton botaoDireita;
    private javax.swing.JButton botaoEsquerda;
    private javax.swing.JButton botaoHelp;
    private javax.swing.JButton botaoPlay;
    private javax.swing.JButton botaoScore;
    private javax.swing.JButton botaoSkip;
    private javax.swing.JPanel cena1;
    private javax.swing.JPanel cena2;
    private javax.swing.JPanel cena3;
    private javax.swing.JPanel cena4;
    private javax.swing.JPanel cena5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIndicaCena;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMenuP;
    private javax.swing.JPanel painelHistorinha;
    private javax.swing.JPanel painelInferior;
    private javax.swing.JPanel painelInferiorHistorinha;
    private javax.swing.JPanel painelInferiorMenuP;
    private javax.swing.JPanel painelJogo;
    private javax.swing.JPanel painelLogo;
    private javax.swing.JPanel painelSuperior;
    // End of variables declaration//GEN-END:variables
}
