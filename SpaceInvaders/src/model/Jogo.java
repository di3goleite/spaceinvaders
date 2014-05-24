/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

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
    ArrayList <IBarreiras>barreiras;
    
    int paredeX0 =0;
    int paredeY0=0;
    int paredeX;
    int paredeY;

    /**
     *
     * @param altura
     * @param largura
     */
    public Jogo(int altura, int largura){
        paredeX=largura;
        paredeY=altura;
    }
    
    public void montaFase(IFaseFactory iff){
    p=iff.criaPalyer();
    inimigos=iff.criaInimigos();
    barreiras=iff.criaBarreiras();
    }

    public IPlayer getPlayer() {
    return p;
    }

}
