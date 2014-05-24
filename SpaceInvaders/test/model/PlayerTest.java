/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;
import model.observer.AlienEvent;
import model.observer.TiroEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class PlayerTest {

    Player p=new Player(0,0,0);
    
    @Before
    public void setUp() {
    p=new Player(0,0,0);
    }
    
    @Test
    public void moverTest(){
     
        int x=p.getPositionX();
        int y=p.getPositionY();
        p.mover(1);
        assertFalse(x==p.getPositionX());
        assertEquals(x+10, p.getPositionX());
        assertEquals(y, p.getPositionY());
        p.mover(0);
        assertFalse(x+10==p.getPositionX());
        assertEquals(x, p.getPositionX());
        assertEquals(y, p.getPositionY());
    }
    
    /**
     *
     */ 
    @Test
    public void moverForaTest(){
     
        int x=p.getPositionX();
        int y=p.getPositionY();
        p.mover(0);
        assertFalse(x-10==p.getPositionX());
        assertEquals(x, p.getPositionX());
        assertEquals(y, p.getPositionY());
    
    }
    
    /**
     *
     */
    @Test
    public void atiraTest(){
        Alien a=new Alien(0, 20);
        p.atira();
        p.addTiroListerner(a);
        p.atirou(new AlienEvent(p));
        assertNull(a);
        
    }
    
    /**
     * Test of mover method, of class Player.
     */
    @Test
    public void testMover() {
        int x = 0;
        int y = 0;
        Player instance = null;
     //   instance.mover(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atira method, of class Player.
     */
    @Test
    public void testAtira() {
        Player instance = null;
        Tiro expResult = null;
        instance.atira();
        assertEquals(expResult, 1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atirou method, of class Player.
     */
    @Test
    public void testAtirou() {
        AlienEvent ae = null;
        Player instance = null;
        instance.atirou(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foiAtingido method, of class Player.
     */
    @Test
    public void testFoiAtingido() {
        AlienEvent ae = null;
        Player instance = null;
        instance.foiAtingido(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
