/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.ImageIcon;

/**
 *
 * @author kratos
 */
public class Inimigos extends ImageIcon {
    /*
    Posicao do inimigo no eixo x
    */
    private int posicaoX;
    /*
    Posicao do inimigo no eixo y
    */
    private int posicaoY;
    /**
     * Permite saber se esse inimigo pode receber tiros
     */
    private boolean estaNaFrente;
    
    private boolean levouTiro;
    
    public Inimigos(String URL, int posicaoX, int posicaoY){
        super(URL);
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
    
    public int getPosicaoX(){
        return this.posicaoX;
    }
    public int getPosicaoY(){
        return this.posicaoY;
    }
    public void setPosicaoX(int x){
        this.posicaoX = x;
    }
    public void setPosicaoY(int y){
        this.posicaoX = y;
    }
}
