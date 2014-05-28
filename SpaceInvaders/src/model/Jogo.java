/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.interfaces.IBarreiras;
import model.interfaces.IPlayer;
import java.util.ArrayList;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.factory.IFaseFactory;
import model.observer.TiroListener;

/**
 *
 * @author lucas
 */
public class Jogo {

    IPlayer p;
    INaveInimiga inimigos;
    ArrayList<IBarreiras> barreiras;

    int paredeX0 = 0;
    int paredeY0 = 0;
    int paredeX;
    int paredeY;

    /**
     *
     * @param altura
     * @param largura
     */
    public Jogo(int largura, int altura) {
        paredeX = largura;
        paredeY = altura;
    }

    /**
     *
     * @param iff
     */
    public void montaFase(IFaseFactory iff) {
        p = iff.criaPlayer();
        inimigos = iff.criaInimigos();
        barreiras = iff.criaBarreiras();
        inimigos.mover();
    }

    /**
     *
     * @return
     */
    public IPlayer getPlayer() {
        return p;
    }

    /**
     *
     * @return
     */
    public INaveInimiga getInimigos() {
        return inimigos;
    }

    /**
     *
     * @return
     */
    public ArrayList<IBarreiras> getBarreiras() {
        return barreiras;
    }

    /**
     *
     * @return
     */
    public int getParedeX() {
        return paredeX;
    }

    /**
     *
     * @return
     */
    public int getParedeY() {
        return paredeY;
    }

    /**
     *
     * @return
     */
    public int getParedeX0() {
        return paredeX0;
    }

    /**
     *
     * @return
     */
    public int getParedeY0() {
        return paredeY0;
    }

    public void alliensOuvemTiro(Tiro pipoco) {
        
        ArrayList a = ((NaveIminigaComposta)inimigos).getAliens();
        for(int i=0; i< a.size(); i++) {
            
            pipoco.addTiroListerner( ((TiroListener)a.get(i)) );
        }
    }

}
