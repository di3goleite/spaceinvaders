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
 *
 * @author Lucas
 */
public class AlienTest {
    
    INaveInimiga a=new Alien(10,10);
    Player p=Player.getInstance();
    Tiro P;
    
    /**
     *
     */
    public AlienTest() {
    
    }
      
    /**
     *
     */
    @Before
    public void setUp() {
        a=new Alien(0,0);
    }

    /**
     * Drive test of Alien
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
     *
     */
    @Test
    public void foiAtingidoTeste(){
    assertEquals(p.getX(),a.getX());
    p.atira();
    assertEquals(p.getX(),P.getX());
    assertEquals(P.getX(),a.getX());
    assertNull(a);
    }
    
    @Test
    public void atirarTeste(){
    
        a.atira();
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
    }

    /**
     * Test of atira method, of class Alien.
     */
    @Test
    public void testAtira() {
        Alien instance = null;
        Tiro expResult = null;
    }

}
