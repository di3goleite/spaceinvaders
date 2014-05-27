/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.composite;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import model.Tiro;

/**
 *
 * @author lucas
 */
public class NaveIminigaComposta implements INaveInimiga {

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
        timer.schedule(new NaveIminigaComposta.Move(), 0, 1000 / 10);

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

    private class Move extends TimerTask {

        @Override
        public void run() {
            if ((caixaX >= paredeX)
                    || (caixaX0 <= 10)) {
                for (INaveInimiga alien : aliens) {
                    alien.mover(1);
                    alien.mudarOrientacao();
                }
                orientacao=(orientacao==1)? 0:1;
                caixaY += 10;
                caixaY0 += 10;
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
        if (aliens.isEmpty()) {
            caixaX = in.getX();
            caixaX0 = in.getX();
            caixaY = in.getY();
            caixaY0 = in.getY();
        } else {
            if (in.getX() > caixaX) {
                caixaX = in.getX();
            }

            if (in.getX() < caixaX0) {
                caixaX0 = in.getX();
            }

            if (in.getY() > caixaY) {
                caixaY = in.getY();
            }

            if (in.getY() < caixaY0) {
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
        for (int i = 0; i < aliens.size(); i++) {
            if (aliens.get(i).getX() > caixaX) {
                caixaX = in.getX();
            }

            if (aliens.get(i).getX() < caixaX0) {
                caixaX0 = in.getX();
            }

            if (aliens.get(i).getY() > caixaY) {
                caixaY = aliens.get(i).getY();
            }

            if (aliens.get(i).getY() < caixaY0) {
                caixaY0 = aliens.get(i).getY();
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
     */
    @Override
    public Tiro atira() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
