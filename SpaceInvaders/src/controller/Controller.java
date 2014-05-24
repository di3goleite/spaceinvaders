/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.IPlayer;
import model.Jogo;
import model.Player;

/**
 *
 * @author Dracul
 */
public class Controller {
    
    Jogo j;
    
    Controller(int x,int y){
    j=new Jogo(x, y);
    }

   public Controller() {
    }
    
    public void atirarPlayer(){
    j.getPlayer().atira();
    }
    
    public void moverPlayer(int direcao){
    j.getPlayer().mover(direcao);
    }

    void criarJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Jogo getJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getAliens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public IPlayer getPlayer() {
        return j.getPlayer();
    }

    Object getBarreira() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
