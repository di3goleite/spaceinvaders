/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Barreira;
import model.Jogo;
import model.Tiro;
import model.composite.INaveInimiga;
import model.factory.Fase1Factory;
import model.factory.IFaseFactory;
import model.interfaces.IBarreiras;
import model.interfaces.IPlayer;

/**
 *
 * @author Dracul
 */
public class Controller {

    private Jogo j;
    private IFaseFactory qualFase;

    /**
     *
     * @param largura
     * @param altura
     */
    public Controller(int largura, int altura) {
        j = new Jogo(largura, altura);
    }

    public ConcurrentLinkedQueue<Tiro> getTiros() {
        return j.getTiros();
    }

    /**
     *
     */
    public void atirarPlayer() {
        j.atiraPlayer();
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
        j.montaFase(new Fase1Factory(j.getParedeX(), j.getParedeY()));
    }

    /**
     *
     * @param fase
     */
    public void mudarFase(int fase) {
        if (fase == 1) {
            j.montaFase(new Fase1Factory(j.getParedeX(), j.getParedeY()));
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
            qualFase = new Fase1Factory(j.getParedeX(), j.getParedeY());
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
    public ArrayList<Barreira> getBarreira() {
        return j.getBarreiras();
    }
    
    public int getLargura(){
    return this.j.getParedeX();
    }
    
    public int getAltura(){
    return this.j.getParedeY();
    }
    
    public int getPlayerX(){
    return this.j.getPlayer().getX();
    }
    
    public int getPlayerY(){
    return this.j.getPlayer().getY();
    }

    public Image getImagemPlayer() {
     return j.getPlayer().getImagem().getImage();
    }

    public int getScore() {
    return j.getScore();
    }
    

}
