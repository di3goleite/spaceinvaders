/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests of Tiro Class.
 * @author lucas, Diego Leite.
 */
public class TiroTest {
    
    Tiro t;
    Alien a = new Alien(320, 600);
    Player p = Player.getInstance();

    /**
     * Test of getPositionX method, of class Tiro.
     */
    @Test
    public void testTiroPositionX() {
        t = a.atira();
        assertEquals(t.getX(), a.getX());
        
        t = p.atira();
        assertEquals(t.getX(), p.getX());
    }
}
