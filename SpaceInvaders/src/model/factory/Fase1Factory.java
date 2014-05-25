/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.factory;

import java.util.ArrayList;
import model.Alien;
import model.Barreira;
import model.IPlayer;
import model.Player;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;

/**
 *
 * @author lucas
 */
public class Fase1Factory implements IFaseFactory{

    @Override
    public IPlayer criaPalyer() {
    return Player.getInstance();
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
    ArrayList<Barreira> barreiras=new ArrayList<>();
    barreiras.add(new Barreira());
    barreiras.add(new Barreira());
    barreiras.add(new Barreira());
    barreiras.add(new Barreira());
    return barreiras; 
    }
    
}
