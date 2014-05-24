/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.factory;

import java.util.ArrayList;
import model.Alien;
import model.IPlayer;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;

/**
 *
 * @author lucas
 */
public class Fase1Factory implements IFaseFactory{

    @Override
    public IPlayer criaPalyer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INaveInimiga criaInimigos() {
    NaveIminigaComposta inimigos = new NaveIminigaComposta();
    Alien a=new Alien(10, 10);
    inimigos.addNaveInimiga(a);
    return inimigos;
    }

    @Override
    public ArrayList criaBarreiras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
