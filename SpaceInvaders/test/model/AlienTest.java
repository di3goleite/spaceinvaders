/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

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
public class AlienTest {
    
    IAlien a=new Alien(0,0);
    Player p=new Player(0,0);
    Projection P;
    
    
    /**
     *
     */
    public AlienTest() {
    
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        a=new Alien(0,0);
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     *
     */
    @Test
    public void moverTest(){
        
        int x=a.getPositionX();
        int y=a.getPositionY();
        a.mover(a.getPositionX()+10, a.getPositionY());
        assertFalse(x==a.getPositionX());
        assertEquals(x+10, a.getPositionX());
        assertEquals(y, a.getPositionY());
        
        x=a.getPositionX();
        y=a.getPositionY();
        a.mover(a.getPositionX(), a.getPositionY()+10);
        assertFalse(y==a.getPositionY());
        assertEquals(x, a.getPositionX());
        assertEquals(y+10, a.getPositionY());
        
    }
    
    /**
     *
     */
    @Test
    public void foiAtingidoTeste(){
    p=new Player(0,0);
    assertEquals(p.getPositionX(),a.getPositionX());
    P=p.atira();
    assertEquals(p.getPositionX(),P.getPositionX());
    assertEquals(P.getPositionX(),a.getPositionX());
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
        System.out.println("getPositionX");
        Alien instance = null;
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositionY method, of class Alien.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Alien instance = null;
        int expResult = 0;
        int result = instance.getPositionY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mover method, of class Alien.
     */
    @Test
    public void testMover() {
        System.out.println("mover");
        int x = 0;
        int y = 0;
        Alien instance = null;
        instance.mover(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atira method, of class Alien.
     */
    @Test
    public void testAtira() {
        System.out.println("atira");
        Alien instance = null;
        Projection expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
