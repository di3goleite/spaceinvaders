/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.observer;

/**
 *
 * @author netmedia3
 */
public interface JogoListener {
    
    public void fimDeFase(JogoEvent je);
    public void gameOver(JogoEvent je);
}
