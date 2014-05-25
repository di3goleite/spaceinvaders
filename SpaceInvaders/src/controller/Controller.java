/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.ArrayList;
import model.IBarreiras;
import model.IPlayer;
import model.Jogo;
import model.composite.INaveInimiga;
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


    public void criarJogo() {
    j.montaFase(new Fase1Factory());
    }
    
    public void mudarFase(int fase){
    if(fase==1){
    j.montaFase(new Fase1Factory());
    }
    }
    
    public Jogo getJogo() {
        return j;
=======
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
>>>>>>> ff9dc6e0f713ef95828407fb1185eb3bf409534c
    }

    public INaveInimiga getAliens() {
    return j.getInimigos();
    }

    public IPlayer getPlayer() {
        return j.getPlayer();
    }

    public ArrayList<IBarreiras> getBarreira() {
    return j.getBarreiras();
    }

    public void mover(int direcao) {
    j.getPlayer().mover(direcao);
    }
    
}
