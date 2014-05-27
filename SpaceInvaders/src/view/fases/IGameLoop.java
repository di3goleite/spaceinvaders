/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.fases;

import java.awt.event.KeyEvent;

/**
 *
 * @author lucasvinicius
 */
public interface IGameLoop {

    /**
     *
     */
    void processInput();

    /**
     *
     */
    void update();

    /**
     *
     */
    void render();
}
