/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.observer.TiroEvent;
import model.observer.TiroListener;
import org.junit.Test;
import static org.junit.Assert.*;

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

    /**
     * Test of addTiroListerner method, of class Tiro.
     */
    @Test
    public void testAddTiroListerner() {
        TiroListener tl = null;
        Tiro instance = null;
        instance.addTiroListerner(tl);
    }

    /**
     * Test of removeTiroListerner method, of class Tiro.
     */
    @Test
    public void testRemoveTiroListerner() {
        TiroListener tl = null;
        Tiro instance = null;
        instance.removeTiroListerner(tl);
    }

    /**
     * Test of moveu method, of class Tiro.
     */
    @Test
    public void testMoveu() {
        TiroEvent e = null;
        Tiro instance = null;
        instance.moveu(e);
    }

}
