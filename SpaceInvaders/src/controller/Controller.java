/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Jogo;
import model.Player;

/**
 *
 * @author Dracul
 */
public class Controller {

    Player p=new Player(3, 700, 320);
    Controller(int x,int y){
    p=new Player(3,x,y);
    }

   public Controller() {
    }
    
    public void atirarPlayer(){
    p.atira();
    }
    
    public void moverPlayer(int direcao){
    p.mover(direcao);
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

    public Player getPlayer() {
        return p;
    }

    Object getBarreira() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
