/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.interfaces.IBarreiras;
import model.interfaces.IPlayer;
import model.Jogo;
import model.composite.INaveInimiga;
import model.factory.Fase1Factory;
import model.factory.IFaseFactory;

/**
 *
 * @author Dracul
 */
public class Controller {

    private Jogo j;
    private IPlayer p;
    private IFaseFactory qualFase;

    /**
     *
     * @param largura
     * @param altura
     */
    public Controller(int largura, int altura) {
        j = new Jogo(largura, altura);
    }

    /**
     *
     */
    public void atirarPlayer() {
        j.getPlayer().atira();
    }

    /**
     *
     * @param direcao
     */
    public void moverPlayer(int direcao) {
        j.getPlayer().mover(direcao);
    }

    /**
     *
     */
    public void criarJogo() {
        j.montaFase(new Fase1Factory());
    }

    /**
     *
     * @param fase
     */
    public void mudarFase(int fase) {
        if (fase == 1) {
            j.montaFase(new Fase1Factory());
        }
    }

    /**
     *
     * @return
     */
    public Jogo getJogo() {
        return j;
    }

    void criarJogo(int x, int y) {
        j = new Jogo(x, y);
    }

    void criarFase(int i) {
        if (i == 1) {
            qualFase = new Fase1Factory();
            j.montaFase(qualFase);
        } else if (i == 2) {
            
        }
    }

    /**
     *
     * @return
     */
    public INaveInimiga getAliens() {
        return j.getInimigos();
    }

    /**
     *
     * @return
     */
    public IPlayer getPlayer() {
        return j.getPlayer();
    }

    /**
     *
     * @return
     */
    public ArrayList<IBarreiras> getBarreira() {
        return j.getBarreiras();
    }

    

}
