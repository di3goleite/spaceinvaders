
package model.factory;

import java.util.ArrayList;
import model.Alien;
import model.Barreira;
import model.interfaces.IPlayer;
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
    
    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
    @Override
    public IPlayer criaPlayer() {
    return Player.getInstance();
    }

    /**
     *
     * @return
     */
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