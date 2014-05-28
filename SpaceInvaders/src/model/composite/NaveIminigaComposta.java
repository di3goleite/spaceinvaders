/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.composite;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import model.Alien;
import model.Tiro;
import model.observer.AlienEvent;
import model.observer.AlienListener;

/**
 *
 * @author lucas
 */
public class NaveIminigaComposta implements INaveInimiga, AlienListener {

    ArrayList<INaveInimiga> aliens = new ArrayList<>();
    int caixaX0, caixaX, caixaY0, caixaY, paredeX, paredeY;
    Timer timer;
    int orientacao = 1;

    /**
     *
     */
    @Override
    public void mover() {

        timer = new Timer();
        timer.schedule(new NaveIminigaComposta.Move(), 0, 1000/2);

    }

    @Override
    public void mover(int descer) {
    }

    public void setParedeX(int largura) {
        this.paredeX = largura;
    }

    public void setParedeY(int altura) {
        this.paredeY = altura;
    }

    @Override
    public void mudarOrientacao() {
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
    this.removeNaveInimiga((Alien)ae.getSource());
    if(aliens.isEmpty()){
        System.out.println("acabou");
    }
    }

    @Override
    public void addAlienListener(AlienListener listener) {
      for (INaveInimiga alien : aliens) {
      alien.addAlienListener(listener);
      }
    }

    private class Move extends TimerTask {

        @Override
        public void run() {
            System.out.println(caixaX);
            System.out.println(paredeX);
            System.out.println(caixaX0);
            if ((caixaX >= paredeX-50 && orientacao==1)
                    || (caixaX0 <= 10 && orientacao==0)) {
                for (INaveInimiga alien : aliens) {
                    alien.mover(1);
                    alien.mudarOrientacao();
                }
                orientacao=(orientacao==1)? 0:1;
                caixaY += 10;
                caixaY0 += 10;
                System.out.println("ifif");
            } 
                for (INaveInimiga alien : aliens) {
                    alien.mover();
                }
                
            if (orientacao == 1) {
                caixaX += 10;
                caixaX0 += 10;
            } else {
                caixaX -= 10;
                caixaX0 -= 10;
            }
        }
    }

    public ArrayList<INaveInimiga> getAliens() {
        return aliens;
    }

    /**
     *
     * @param in
     */
    public void addNaveInimiga(INaveInimiga in) {
        ((Alien)in).addAlienListener(this);
        if (aliens.isEmpty()) {
            caixaX = in.getX();
            caixaX0 = in.getX();
            caixaY = in.getY();
            caixaY0 = in.getY();
        } else {
            if (in.getX() > caixaX) {
                caixaX = in.getX();
            }

            else if (in.getX() < caixaX0) {
                caixaX0 = in.getX();
            }

            if (in.getY() > caixaY) {
                caixaY = in.getY();
            }

            else if (in.getY() < caixaY0) {
                caixaY0 = in.getY();
            }
        }
        aliens.add(in);
    }

    /**
     *
     * @param in
     */
    public void removeNaveInimiga(INaveInimiga in) {

        aliens.remove(in);
        caixaX = 0;
        caixaY = 0;
        caixaX0 = 1000;
        caixaY0 = 1000;
        for (INaveInimiga alien : aliens) {
            if (alien.getX() > caixaX) {
                caixaX = alien.getX();
            }
            if (alien.getX() < caixaX0) {
                caixaX0 = alien.getX();
            }
            if (alien.getY() > caixaY) {
                caixaY = alien.getY();
            }
            if (alien.getY() < caixaY0) {
                caixaY0 = alien.getY();
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return 
     */
    @Override
    public Tiro atira() {
        if(aliens.isEmpty()){
        return null;
        }
        return aliens.get((int) (Math.random() * aliens.size())).atira();
        
    }

}
