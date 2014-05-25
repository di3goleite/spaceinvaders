/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.factory;

import java.util.ArrayList;
import java.util.Iterator;
import model.Alien;
import model.IPlayer;
import model.Player;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;

/**
 *
 * @author lucas
 */
public class Fase1Factory implements IFaseFactory{

    NaveIminigaComposta inimigos = new NaveIminigaComposta(); // o conjunto de inimigos não pode ser
                                                              //criado toda vez que for inserido um novo inimigo
    
    @Override
    public IPlayer criaPalyer() {
        IPlayer p = new Player(3, 0, 0);
        return p;
    }

    @Override
    public INaveInimiga criaInimigos() {
        
        int x = 10, y = 10; 
        Alien a;
        for(int i = 0; i < 5; i++){ // disposição dos inimigos (ajeitar ainda)
            
            for(int j = 0; j < 16; j++){
                a = new Alien(x, y);
                inimigos.addNaveInimiga(a);
                x += 40;
            }
            y += 25;
        }   
            
        return inimigos;
    }

    @Override
    public ArrayList criaBarreiras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
