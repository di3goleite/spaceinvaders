/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author lucas
 */
public class Jogo {
    CampoDeBatalha cb;

    /**
     *
     * @param altura
     * @param largura
     */
    public Jogo(int altura, int largura){
    cb=new CampoDeBatalha();
    cb.criarCampo(altura, largura);
    }

    /**
     *
     */
    public void run(){
    cb.move();
    cb.atira();
    }
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
    
    Jogo j=new Jogo(800,600);
    j.cb.criarCampo(800, 600);
    j.run();
    }
}
