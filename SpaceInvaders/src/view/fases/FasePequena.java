/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Vinícius Assis
 */
public class FasePequena extends JPanel {

    private BufferedImage backBuffer;
    private ImageIcon fundo;
    private ImageIcon naveAmiga = new ImageIcon("src/interface1/multimidia/imagens/personagens/naveAmiga.png");
  //  private Inimigos inimigos[][];
    private int FPS = 3;
    private int posicaoNAmigaX, posicaoNAmigaY = 520;
    private int posicaoNInimigaX = 10, posicaoNInimigaY = 10;

    public FasePequena() {
        this.setBackImage("src/interface1/multimidia/imagens/cenas/planoFundo.jpg");
        backBuffer = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed");
            }

        });
        this.setFocusable(true);
    }

  
    public void criaInimigos(int posicaoX, int posicaoY) {
     //   this.inimigos = new Inimigos[5][16];
        int x, y = posicaoY;
     for(int i = 0; i < 5; i++){
            x = posicaoX;
            y += 25;
            for(int j = 0; j < 16; j++){
                if(i == 0 || i == 1){
             //       inimigos[i][j] = new Inimigos("src/interface1/multimidia/"
              //              + "imagens/personagens/inimigo1-1.jpg", x, y);
                }
                else if (i == 2 || i == 3){
           //         inimigos[i][j] = new Inimigos("src/interface1/multimidia/"
                      //      + "imagens/personagens/inimigo2-1.jpg", x, y);
                }
                else{
             //       inimigos[i][j] = new Inimigos("src/interface1/multimidia/"
              //              + "imagens/personagens/inimigo3-1.jpg", x, y);
                }
                x+=40;
            }
        }   
    }
    
    
    public void setBackImage(String URL) {
        this.fundo = new ImageIcon(URL);
    }
    public void atualizar() {
       
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        super.paintComponent(g2);
        Graphics bbg = backBuffer.getGraphics();

         //Parte onde o fundo eh desenhado
        //Fundo com dimensoes de 800x600
        bbg.drawImage(fundo.getImage(), 0, 0, this);

        //Parte onde os elementos da tela sao modificado atraves de outra variavel
        //Caso isso nao seja feito toda a tela sera modificada a cada vez
        Graphics2D bbg2d = (Graphics2D) backBuffer.getGraphics();
        bbg2d.drawImage(naveAmiga.getImage(),this.posicaoNAmigaX,this.posicaoNAmigaY,this);
        
        this.criaInimigos(this.posicaoNInimigaX, this.posicaoNInimigaY);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 16; j++){
           //     bbg2d.drawImage(inimigos[i][j].getImage(),
           //             this.inimigos[i][j].getPosicaoX(),
            //            this.inimigos[i][j].getPosicaoY(),this);   
            }
        }
        
        //================================================================================== 
        g2.drawImage(backBuffer, 0, 0, this);//Desenha tudo o que foi alterado no painel
    }

   
	/**
	 * Classe que e usada como Thread para fazer modificacoes mas posicoes dos
	 * inimigos na tela
	 * 
	 * @author Lucas Vinicius
	 *
	 * @see PainelCentral
	 */
	class MoveInimigos implements Runnable {
            private int fpsInimigos = 1;
            private boolean indo = true;
		public MoveInimigos() {
		}

		@Override
		public void run() {
                    posicaoNInimigaX = 15;
                    while(true){
                        if(posicaoNInimigaX > 10 && posicaoNInimigaX < 150){
                            if(indo){
                                posicaoNInimigaX+=10;
                            }
                            else if(!indo){
                                posicaoNInimigaX-=10;
                            }
                        }
                        else{
                            posicaoNInimigaY+=20;
                            if(indo){
                                indo = false;
                                posicaoNInimigaX = 145;
                            }
                            else{
                                indo = true;
                                posicaoNInimigaX = 15;
                            }
                        }
                        try {
                            Thread.sleep(1000/2);
                        } catch (InterruptedException ex) {
                            System.out.println("Thread MoveInimigo falhou");
                        }
                        
                       repaint();
                    }
		
		}

	}
   

}
