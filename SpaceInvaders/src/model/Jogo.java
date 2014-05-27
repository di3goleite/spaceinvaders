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
import model.factory.IFaseFactory;

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

    public void montaFase(IFaseFactory iff) {
        p = iff.criaPlayer();
        inimigos = iff.criaInimigos();
        barreiras = iff.criaBarreiras();
    }

    public IPlayer getPlayer() {
        return p;
    }

    public INaveInimiga getInimigos() {
        return inimigos;
    }

    public ArrayList<IBarreiras> getBarreiras() {
        return barreiras;
    }

    public int getParedeX() {
        return paredeX;
    }

    public int getParedeY() {
        return paredeY;
    }

    public int getParedeX0() {
        return paredeX0;
    }

    public int getParedeY0() {
        return paredeY0;
    }

}
