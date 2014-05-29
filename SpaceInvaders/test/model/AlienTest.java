/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.composite.INaveInimiga;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests of Alien Class
 * @author Lucas, Diego Leite.
 */
public class AlienTest {
    
    INaveInimiga a=new Alien(10,10);
    Player p=Player.getInstance();
    Tiro tPlayer;
    Tiro tAlien;
    
    /**
     * Setup of test
     */
    @Before
    public void setUp() {
        a=new Alien(0,0);
    }

    /**
     * Drive test
     */
    @Test
    public void moverTest(){        
        int x=a.getX();
        int y=a.getY();
        
        a.mover();
        assertFalse(x==a.getX()); //x is 0 and a.getX is 10
        x = 10;
        assertEquals(x, a.getX());
        assertEquals(y, a.getY());
        
        a.mover(10);
        assertFalse(y==a.getY());
        assertEquals(y+10, a.getY());
        assertEquals(x, a.getX());
    }
    
    /**
     * Wast reached test
     */
    @Test
    public void alienFoiAtingidoTeste(){
        //Move alien to the same position of the player
        for(int i=0; i<32; i++){
            a.mover();
        }
        
        assertEquals(p.getX(),a.getX());
        tPlayer = p.atira();
        assertEquals(p.getX(),tPlayer.getX());
        assertEquals(tPlayer.getX(),a.getX());
        a = null; //Alien is dead
        assertNull(a);
    }
    
    /**
     * Test for shot of Alien
     */
    @Test
    public void alienAtirarTeste(){
        tAlien = a.atira();
        assertEquals(a.getX(), tAlien.getX());
    }

    /**
     * Test of getPositionX method, of class Alien.
     */
    @Test
    public void testGetPositionX() {
        int expResult = 0;
        int result = a.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPositionY method, of class Alien.
     */
    @Test
    public void testGetPositionY() {
        int expResult = 0;
        int result = a.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of mover method, of class Alien.
     */
    @Test
    public void testMover() {
        a.mover();
        assertEquals(a.getX(), 10);
        
        for (int i = 0; i < 32; i++) {
            a.mover();
        }
        assertFalse(a.getX()==320);
        assertTrue(a.getX()==330);
    }
}
