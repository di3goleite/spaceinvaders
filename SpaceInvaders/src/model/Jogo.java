/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.factory.IFaseFactory;
import model.interfaces.IBarreiras;
import model.interfaces.IPlayer;
import model.observer.AlienEvent;
import model.observer.AlienListener;
import model.observer.TiroListener;

/**
 *
 * @author lucas
 */
public class Jogo implements AlienListener{

    IPlayer p;
    INaveInimiga inimigos;
    ArrayList<IBarreiras> barreiras;
    ArrayList<Tiro> tiros = new ArrayList<>();
    Timer timer;
    int score=0, highScore=0;

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
        inimigos.addAlienListener(this);
        barreiras = iff.criaBarreiras();
        inimigos.mover();
        timer = new Timer();
        timer.schedule(new AlienAtira(), 0, 1000/2);
    }

    @Override
    public void moveu(AlienEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atirou(AlienEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void foiAtingido(AlienEvent ae) {
    score+=10;  
    }

    public int getScore() {
    return score; 
    }
    
    private class AlienAtira extends TimerTask {

        @Override
        public void run() {
            tiros.add(inimigos.atira());
        }
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

        ArrayList a = ((NaveIminigaComposta) inimigos).getAliens();
        for (int i = 0; i < a.size(); i++) {

            pipoco.addTiroListerner(((TiroListener) a.get(i)));
        }
    }

    public ArrayList<Tiro> getTiros() {
        return tiros;
    }

}
