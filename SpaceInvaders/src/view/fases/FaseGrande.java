/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fases;

import controller.Controller;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Alien;
import model.Barreira;
import model.Tiro;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.observer.JogoEvent;

/**
 *
 * @author Vinícius Assis
 */
public class FaseGrande extends JPanel implements IGameLoop, KeyListener {

    private BufferedImage backBuffer;
    private ImageIcon fundo;
    private Controller controller;
    private Timer temporizador;
    private int framesPorSegundo = 30;
    private int fase = 1;

    /**
     *
     * @param c
     */
    public FaseGrande(Controller c) {
        this.setFocusable(true);
        this.setBackground(Color.blue);
        this.setBackImage("src/interface1/multimidia/imagens/cenas/planoFundo.jpg");
        backBuffer = new BufferedImage(c.getLargura(), c.getAltura(), BufferedImage.TYPE_INT_RGB);
        this.controller = c;
        //Criando o temporizador que controlara a atualizacao da tela
        temporizador = new Timer();
        temporizador.schedule(new Atualizadora(), 0, 1000 / this.framesPorSegundo);
        this.cargaInicial();
    }

    /**
     *
     * @param URL
     */
    public void setBackImage(String URL) {
        this.fundo = new ImageIcon(URL);
    }

    private void cargaInicial() {
        controller.criarJogo();
        controller.getJogo().addJogoListener(this);
        this.setFocusable(true);
    }
    //Metodos que sao necessarios para a implementacao do game loop

    /**
     *
     */
    @Override
    public void processInput() {

    }

    /**
     *
     */
    @Override
    public void update() {
    }

    /**
     *
     */
    @Override
    public void render() {
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        Graphics bbg = backBuffer.getGraphics();
        //Parte onde o fundo eh desenhado
        //Fundo com dimensoes de 800x600
        bbg.drawImage(fundo.getImage(), 0, 0, this);
        //Parte onde os elementos da tela sao modificado atraves de outra variavel
        //Caso isso nao seja feito toda a tela sera modificada a cada vez
        Graphics2D bbg2d = (Graphics2D) backBuffer.getGraphics();
        bbg2d.drawImage(controller.getImagemPlayer(), controller.getPlayerX(),
                controller.getPlayerY(), this);
        for (Tiro elemento : controller.getTiros()) {
            bbg2d.setColor(Color.red);
            bbg2d.fillRect(elemento.getX() + 5, elemento.getY(), 5, 10);
        }
        for (int i = 0; i < ((NaveIminigaComposta) controller.getAliens()).getAliens().size(); i++) {
            INaveInimiga inimigo = ((NaveIminigaComposta) controller.getAliens()).getAliens().get(i);
            bbg2d.drawImage(((Alien) inimigo).getImageIcon().getImage(), inimigo.getX(), inimigo.getY(), this);

        }

        bbg2d.drawString("Score = " + controller.getScore(), 10, 10);
        bbg2d.drawString("Vidas ", controller.getLargura() - 60, 10);
        for (int i = 0; i < controller.getPlayer().getVidas(); i++) {
            bbg2d.fillRect(controller.getLargura() - 50 + (10 * i), 15, 5, 5);
        }

        for (Barreira elemento : controller.getBarreira()) {
            bbg2d.fillRect(elemento.getX(), elemento.getY(), 5, 5);
        }

        g2.drawImage(backBuffer, 0, 0, this);//Desenha tudo o que foi alterado no painel
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A
                || e.getKeyCode() == KeyEvent.VK_LEFT) {
            controller.moverPlayer(0);
        } else if (e.getKeyCode() == KeyEvent.VK_D
                || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            controller.moverPlayer(1);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE
                || e.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.atirarPlayer();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE
                || e.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.atirarPlayer();
        }
    }

    public int getHighScore() {
        return controller.getScore();
    }

    @Override
    public void fimDeFase(JogoEvent je) {
        if (fase < 3) {
            fase++;
        }
        controller.mudarFase(fase);
    }

    @Override
    public void gameOver(JogoEvent je) {
        temporizador.cancel();
        int i = JOptionPane.showConfirmDialog(this, "FIM DE JOGO, Deseja reiniciar?");
        if (i == 0) {
            controller.criarJogo();
            temporizador = new Timer();
            temporizador.schedule(new Atualizadora(), 0, 1000 / this.framesPorSegundo);
        } else {
            System.exit(0);
        }

    }

    class Atualizadora extends TimerTask {

        @Override
        public void run() {
            processInput();
            update();
            render();
        }

    }

}
