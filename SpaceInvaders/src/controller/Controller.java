/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Player;

/**
 *
 * @author Dracul
 */
public class Controller {

    Player p;
    Controller(int x,int y){
    p=new Player(3,x,y);
    }
    
    public void atirarPlayer(){
    p.atira();
    }
    
    public void moverPlayer(int direcao){
    p.mover(direcao);
    }
    
}
