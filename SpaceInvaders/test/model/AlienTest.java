/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.interfaces.IAlien;
import java.awt.Image;
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
    
    IAlien a=new Alien(10,10);
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
        a.mover();
        assertFalse(x==a.getPositionX());
        assertEquals(x+10, a.getPositionX());
        assertEquals(y, a.getPositionY());
        
        x=a.getPositionX();
        y=a.getPositionY();
       // a.mover(a.getPositionX(), a.getPositionY()+10);
        assertFalse(y==a.getPositionY());
        assertEquals(x, a.getPositionX());
        assertEquals(y+10, a.getPositionY());
        
    }
    
    /**
     *
     */
    @Test
    public void foiAtingidoTeste(){
    assertEquals(p.getX(),a.getPositionX());
    p.atira();
    assertEquals(p.getX(),P.getPositionX());
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
        int expResult = 0;
        int result = a.getPositionX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPositionY method, of class Alien.
     */
    @Test
    public void testGetPositionY() {
        int expResult = 0;
        int result = a.getPositionY();
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

    /**
     * Test of myImage method, of class Alien.
     */
    @Test
    public void testMyImage() {
        Image iconImage = null;
        a.myImage(iconImage);
    }
}
