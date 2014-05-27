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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.Jogo;
import model.composite.INaveInimiga;
import model.interfaces.IBarreiras;
import model.interfaces.IPlayer;

/**
 *
 * @author Vinícius Assis
 */
public class FaseGrande extends JPanel implements IGameLoop {

    private BufferedImage backBuffer;
    private ImageIcon fundo;
   // private ImageIcon naveAmiga = new ImageIcon("src/interface1/multimidia/imagens/personagens/naveAmiga.png");
   // private int posicaoNAmigaX, posicaoNAmigaY = 520;
   // private int posicaoNInimigaX = 10, posicaoNInimigaY = 10;
    private Controller controller;
    private Timer temporizador;
    private int framesPorSegundo = 30;
    private INaveInimiga inimigos;
    private IPlayer player;
    private ArrayList<IBarreiras> barreiras;

    /**
     *
     * @param c
     */
    public FaseGrande(Controller c) {
        this.setBackground(Color.blue);
        this.setBackImage("src/interface1/multimidia/imagens/cenas/planoFundo.jpg");
        backBuffer = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        this.controller = c;
        //Criando o temporizador que controlara a atualizacao da tela
        temporizador = new Timer();
        temporizador.schedule(new Atualizadora(), 0, 1000/this.framesPorSegundo);
        this.cargaInicial();
    }

    /**
     *
     * @param URL
     */
    public void setBackImage(String URL) {
        this.fundo = new ImageIcon(URL);
    }

    private void cargaInicial(){
        controller.criarJogo();
        Jogo j = controller.getJogo();
        inimigos = j.getInimigos();
        player = j.getPlayer();
        barreiras = j.getBarreiras();
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
        //bbg2d.drawImage(naveAmiga.getImage(), this.posicaoNAmigaX, this.posicaoNAmigaY, this);
        g2.drawImage(backBuffer, 0, 0, this);//Desenha tudo o que foi alterado no painel
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
