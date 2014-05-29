/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of Player Class
 * @author Lucas, Diego Leite.
 */
public class PlayerTest {
    Player p = Player.getInstance();
    Tiro tPlayer;

    @Before
    public void setUp() {
        p = Player.getInstance();
    }
    
    /**
     * Test of atira method, of class Player.
     */
    @Test
    public void atiraTest() {
        tPlayer = p.atira();
        assertEquals(tPlayer.getX(), p.getX());
    }
    
    /**
     * Test if Player is reached by a Alien
     */
    @Test
    public void foiAtingidoTest(){
        //TODO
    }
    
    /**
     * Test of the life of the Player.
     */
    @Test
    public void vidaTest(){
        assertTrue(p.getVidas()==3);
    }

    /**
     * Test of movement of the Player.
     */
    @Test
    public void moverTest() {
        int x = p.getX();
        int y = p.getY();
        
        assertTrue(x == p.getX());
        p.mover(1);
        assertFalse(x == p.getX());
        assertEquals(x + 10, p.getX());
        assertEquals(y, p.getY());
        
        p.mover(0);
        assertFalse(x + 10 == p.getX());
        assertEquals(x, p.getX());
        assertEquals(y, p.getY());
    }

    /**
     * Test of the out movement of Player
     */
    @Test
    public void moverForaTest() {
        for (int i = 0; i < 100; i++) {
            p.mover(0);
        }
        
        int x = p.getX();
        int y = p.getY();
        
        p.mover(0);
        assertFalse(x - 10 == p.getX());
        assertEquals(x, p.getX());
        assertEquals(y, p.getY());
    }
}
