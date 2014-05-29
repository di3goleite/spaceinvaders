/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.interfaces.IPlayer;
import model.Jogo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class ControllerTest {

    Controller c = new Controller(800, 640);

    /**
     *
     */
    @Before()
    public void setUp() {
        c.criarJogo();
    }

    @Test
    public void criarJogoTest() {
        c.criarJogo();
        assertNotNull(c.getJogo());

        assertEquals(c.getJogo().getParedeX(), 800);
        assertEquals(c.getJogo().getParedeY(), 640);

        assertEquals(c.getJogo().getParedeX0(), 0);
        assertEquals(c.getJogo().getParedeY0(), 0);

        assertNotNull(c.getPlayer());
        assertNotNull(c.getAliens());
        assertNotNull(c.getBarreira());

        assertEquals(250, c.getJogo().getBarreiras().size());
        assertEquals(3, c.getPlayer().getVidas());

        assertFalse(c.getJogo().getBarreiras().isEmpty());

    }

    /**
     * Teste de movimentação do player
     */
    @Test
    public void moverPlayertest() {
        int x = c.getPlayer().getX();
        int y = c.getPlayer().getY();
        c.moverPlayer(1);  //movimenta o player
        assertEquals(x + 10, c.getPlayer().getX());
        assertEquals(y, c.getPlayer().getY());
        assertFalse(x == c.getPlayer().getX()); //verifica se ocorreram as mudanças esperadas
        assertEquals(x + 10, c.getPlayer().getX()); //
        assertEquals(y, c.getPlayer().getY());
    }

    @Test
    public void atirarPlayertest() {
        c.atirarPlayer();

    }

    /**
     * Test of atirarPlayer method, of class Controller.
     */
    @Test
    public void testAtirarPlayer() {
        c.atirarPlayer();
    }

    /**
     * Test of moverPlayer method, of class Controller.
     */
    @Test
    public void testMoverPlayer() {
        int direcao = 0;
        c.criarJogo();
        c.moverPlayer(direcao);
    }

    /**
     * Test of criarJogo method, of class Controller.
     */
    @Test
    public void testCriarJogo() {
        c.criarJogo();
    }

    /**
     * Test of mudarFase method, of class Controller.
     */
    @Test
    public void testMudarFase() {
        int fase = 0;
        c.mudarFase(fase);
    }

    /**
     * Test of getJogo method, of class Controller.
     */
    @Test
    public void testGetJogo() {
        Jogo result = c.getJogo();
        assertNotNull(result);
    }

    /**
     * Test of getAliens method, of class Controller.
     */
    @Test
    public void testGetAliens() {
        Object result = c.getAliens();
        assertNotNull(result);
    }

    /**
     * Test of getPlayer method, of class Controller.
     */
    @Test
    public void testGetPlayer() {
        IPlayer result = c.getPlayer();
        assertNotNull(result);
    }

    /**
     * Test of getBarreira method, of class Controller.
     */
    @Test
    public void testGetBarreira() {
        ConcurrentLinkedQueue result = c.getBarreira();
        assertNotNull(result);
        assertEquals(250, result.size());
    }


}
