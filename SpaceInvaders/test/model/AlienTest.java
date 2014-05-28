/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.composite.INaveInimiga;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
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
        
        int x=a.getX();
        int y=a.getY();
        a.mover();
        assertFalse(x==a.getX());
        assertEquals(x+10, a.getX());
        assertEquals(y, a.getY());
        
        x=a.getX();
        y=a.getY();
       // a.mover(a.getPositionX(), a.getPositionY()+10);
        assertFalse(y==a.getY());
        assertEquals(x, a.getX());
        assertEquals(y+10, a.getY());
        
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
