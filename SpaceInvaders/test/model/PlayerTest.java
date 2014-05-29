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
 *
 * @author Lucas
 */
public class PlayerTest {

    Player p = Player.getInstance();

    @Before
    public void setUp() {
        p = Player.getInstance();
    }

    @Test
    public void moverTest() {

        int x = p.getX();
        int y = p.getY();
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
     *
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

   

    /**
     * Test of mover method, of class Player.
     */
    @Test
    public void testMover() {
        Player instance = Player.getInstance();
        instance.mover(0);
    }

    /**
     * Test of atira method, of class Player.
     */
    @Test
    public void testAtira() {
        Player instance = Player.getInstance();
        Tiro expResult = null;
        instance.atira();
        assertEquals(expResult, 1);
    }

}
