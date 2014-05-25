/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class CampoDeBatalha {
    ArrayList <IAlien> aliens=new ArrayList<>();
    int paredeX0 =0;
    int paredeY0=0;
    int paredeX;
    int paredeY;
    
    
    //dividir a tela em setores

    /**
     *
     * @param altura
     * @param largura
     */
    public void criarCampo(int altura, int largura){
    
    this.paredeX=largura;
    this.paredeY=altura;
    
    int x=((altura/5)*2)/5; //(Vertical) divide a tela em 5 setores. Usa 2 pra colocar os inimigos. Divide os inimigos em 5 filas.
    
    int y=((largura/3)*2)/11;//(Horizontal) divide a tela em 3 setores. Usa 2 pra colocar os inimigos. Dividi os inimigos em 11 filas.
    
    /**/
    for(int i=1; i<6; i++){
        for(int j=1; j<12;j++){
        aliens.add(new Alien(i*x,j*y));
            /**///System.out.println("i="+i*x + "j="+j*y);
        }
        } 
    /**/
    }

    void move() {
        for (IAlien a : aliens) {
        a.mover(a.getPositionX()+10, a.getPositionY());
        }
        
    }

    void atira() {
    for (IAlien a : aliens) {
        a.atira();
        }
    }
}
