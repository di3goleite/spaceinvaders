/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class ControllerTest {
    Controller c=new Controller();
    /**
     *
     */
    public ControllerTest() {
     
    }
    /**
     *
     */
    @Before()
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void criarJogoTest(){
        c.criarJogo();
        assertNotNull(c.getJogo());
        assertNotNull(c.getPlayer());
        assertNotNull(c.getAliens());
        assertNotNull(c.getBarreira());
        
        assertEquals(3, c.getPlayer().getVidas());
    }
    
    
    /**
     *Teste de movimentação do player
     */
    @Test
    public void moverPlayertest() {
        int x=c.getPlayer().getPositionX();
        int y=c.getPlayer().getPositionY();
        c.mover();  //movimenta o player
        assertEquals(x+10, c.getPlayer().getPositionX());
        assertEquals(y, c.getPlayer().getPositionY());
        assertFalse(x==c.getPlayer().getPositionX()); //verifica se ocorreram as mudanças esperadas
        assertEquals(x+10, c.getPlayer().getPositionX()); //
        assertEquals(y, c.getPlayer().getPositionY());
    }
    
    @Test
    public void atirarPlayertest(){
    c.atirarPlayer();
    
    }
    
}
