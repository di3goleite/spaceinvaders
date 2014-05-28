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
import javax.swing.JPanel;
import model.Alien;
import model.Tiro;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;

/**
 *
 * @author Vinícius Assis
 */
public class FasePequena extends JPanel implements IGameLoop, KeyListener {

    private BufferedImage backBuffer;
    private ImageIcon fundo;
    // private ImageIcon naveAmiga = new ImageIcon("src/interface1/multimidia/imagens/personagens/naveAmiga.png");
    // private int posicaoNAmigaX, posicaoNAmigaY = 520;
    // private int posicaoNInimigaX = 10, posicaoNInimigaY = 10;
    private Controller controller;
    private Timer temporizador;
    private int framesPorSegundo = 10;

    /**
     *
     * @param c
     */
    public FasePequena(Controller c) {
        this.setFocusable(true);
        this.setBackground(Color.white);
        this.controller = c;
        //Criando o temporizador que controlara a atualizacao da tela
        temporizador = new Timer();
        temporizador.schedule(new Atualizadora(), 0, 1000 / this.framesPorSegundo);
        this.cargaInicial();
    }

    private void cargaInicial() {
        controller.criarJogo();
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
        g2.fillRect( controller.getPlayerX(), controller.getPlayerY(), 5, 5);
        for (Tiro elemento : controller.getTiros()) {
            g2.fillRect(elemento.getPositionX() + 5, elemento.getPositionY(), 1, 2);
        }
        for (int i=0; i<((NaveIminigaComposta) controller.getAliens()).getAliens().size(); i++) {
            INaveInimiga inimigo = ((NaveIminigaComposta) controller.getAliens()).getAliens().get(i);
            g2.fillOval(inimigo.getX(),inimigo.getY(), 5, 5);
          
        }
        g2.drawString("Score = "+controller.getScore(), 10, 10);
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A
                || e.getKeyCode() == KeyEvent.VK_LEFT) {
            controller.getPlayer().mover(0);
        } else if (e.getKeyCode() == KeyEvent.VK_D
                || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            controller.getPlayer().mover(1);
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

    class Atualizadora extends TimerTask {

        @Override
        public void run() {
            processInput();
            update();
            render();
        }

    }

}
