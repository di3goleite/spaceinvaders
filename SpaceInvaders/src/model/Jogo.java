/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.factory.IFaseFactory;
import model.interfaces.IBarreiras;
import model.interfaces.IPlayer;
import model.observer.AlienEvent;
import model.observer.AlienListener;
import model.observer.BatiEvent;
import model.observer.BatiListener;
import model.observer.PlayerEvent;
import model.observer.PlayerListener;
import model.observer.TiroEvent;
import model.observer.TiroListener;

/**
 *
 * @author lucas
 */
public class Jogo implements AlienListener, PlayerListener, TiroListener, BatiListener {

    IPlayer p;
    INaveInimiga inimigos;
    ArrayList<IBarreiras> barreiras;
    ConcurrentLinkedQueue<Tiro> tiros = new ConcurrentLinkedQueue<>();
    Timer timer;
    int score = 0, highScore = 0;

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
        timer.schedule(new AlienAtira(), 0, 1000 / 2);
    }

    @Override
    public void foiAtingido(AlienEvent ae) {
        score += 10;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void foiAtingido(PlayerEvent pe) {
        Player.getInstance().setVidas(Player.getInstance().getVidas() - 1);
        if (Player.getInstance().getVidas() == 0) {
            disparaGameOver();
        }
    }

    @Override
    public void moveu(TiroEvent e) {
    }

    private void disparaGameOver() {

    }

    @Override
    public void bati(BatiEvent e) {
        this.tiros.remove((Tiro) e.getSource());
        System.out.println("sumiu");
    }

    public void atiraPlayer() {
    
        Tiro pipoco = getPlayer().atira();
        pipoco.addTiroListerner(this);
        alliensOuvemTiro(pipoco);
        
         for(Tiro tiro : tiros){
           pipoco.addTiroListerner(tiro);
           tiro.addTiroListerner(pipoco);
        }
         
        tiros.add(pipoco);
        
        pipoco.addBatiListerner(this); 
    }

    private class AlienAtira extends TimerTask {

        @Override
        public void run() {
            Tiro t = inimigos.atira();
            adicionarListener(t);
            tiros.add(t);
        }

    }

    private void adicionarListener(Tiro t) {
        t.addTiroListerner(this);
        t.addBatiListerner(this);
        for (Tiro tiro : tiros) {
            tiro.addTiroListerner(t);
            t.addTiroListerner(tiro);
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
        for (Object a1 : a) {
            pipoco.addTiroListerner((TiroListener) a1);
        }
    }

    public ConcurrentLinkedQueue<Tiro> getTiros() {
        return tiros;
    }

}
