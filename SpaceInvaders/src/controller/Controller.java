/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.IPlayer;
import model.Jogo;
import model.Player;
import model.factory.Fase1Factory;
import model.factory.IFaseFactory;

/**
 *
 * @author Dracul
 */
public class Controller {
    
    Jogo j;
    IPlayer p;
    IFaseFactory qualFase;
    
   public Controller() {

   }
    
    public void atirarPlayer(){
        j.getPlayer().atira();
    }
    
    public void moverPlayer(int direcao){
        j.getPlayer().mover(direcao);
    }

    void criarJogo(int x, int y) {
        j=new Jogo(x, y);
    }

    void criarFase(int i) {
        if (i == 1) {
           qualFase = new Fase1Factory();
           j.montaFase(qualFase);
       } else if(i == 2) {
           
       }
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
