package view;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Game extends JFrame {

	BufferedImage backBuffer;	
	int FPS = 30;
	int janelaW = 500;
	int janelaH = 500;
	
	ImageIcon abelha = new ImageIcon("src/tutor6/bee.png");
	ImageIcon fundo = new ImageIcon("src/tutor6/planoFundo.jpg");
	
	public void atualizar() {

	}

	public void desenharGraficos() {
		Graphics g = getGraphics();	//ISSO JÁ ESTAVA AQUI
		Graphics bbg = backBuffer.getGraphics();//ISSO TAMBÉM JÁ ESTAVA AQUI...
		//AQUI VAMOS MANDAR DESENHAR ALGUNS IMAGENS NA TELA
		bbg.drawImage(fundo.getImage(),0,0,this);//QUI DESENHAMOS O FUNDO
		//AS DIMENSÕES ORIGINAIS DO FUNDO SÃO: 500X500 QUE É O TAMANHO DA NOSSA TELA!
		
		//DESENHANDO A ABELHA NAS COORDENADAS X=200 e Y=200
		bbg.drawImage(abelha.getImage(),200,200,this); //aqui fica com as dimensões originais!
		//AQUI DEFINI A LARGURA E ALTURA DA IMAGEM
		bbg.drawImage(abelha.getImage(),100,100,40,40,this); //aqui não fica com as dimensões originais!
		
		//AQUI VAMOS ROTACIONAR A IMAGEM EM 45º
		//PARA ISSO VAMOS USAR OUTRA VARIAVEL DO TIPO Graphics2D
		//SE NÃO usarmos outra variável tudo que tá no buffer será rotacionado também!
		Graphics2D bbg2d = (Graphics2D) backBuffer.getGraphics();//AQIU É NOSSA OUTRA VÁRIAVEL!
		//para rotacionar primeiro define o eixo (isso desloca a imagem, então depois temos que desfazer)
		//vou por o exito no meio, então é só dividir a altura e largura da imagem por 2
		bbg2d.translate((abelha.getIconWidth()/2)+300, (abelha.getIconHeight()/2)+300); //tem que desfazer isso depois que a imagem será deslocada!
		bbg2d.rotate(45*(Math.PI/180)); //vamos calcular 45º
		bbg2d.translate(-((abelha.getIconWidth()/2)+300), -((abelha.getIconHeight()/2)+300));// agora desfaz o négocio do exito!!!
		//veja que eu passei os mesmos valores só que negativos, ovserve o sinal de "-" menos
		bbg2d.drawImage(abelha.getImage(),300,300,this); //desenha a imagem
		
		
		//==================================================================================	
		g.drawImage(backBuffer, 0, 0, this);//OBS: ISSO DEVE FICAR SEMPRE NO FINAL!
	}

	public void inicializar() {
		setTitle("Titulo do Jogo!");
		setSize(janelaW, janelaH);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);
	}

	public void run() {
		inicializar();
		while (true) {
			atualizar();
			desenharGraficos();
				try {
					Thread.sleep(1000/FPS);
				} catch (Exception e) {
					System.out.println("Thread interrompida!");
				}
		}
	}
	public static void main(String[] args) {
		Game game = new Game();
                game.setFocusable(true);
                game.addKeyListener(new KeyAdapter() {


                    @Override
                    public void keyPressed(KeyEvent e) {
                        System.out.println("Pressionei.");
                    }

                });
		game.run();
	}
}