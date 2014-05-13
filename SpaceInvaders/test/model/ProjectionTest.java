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
public class ProjectionTest {
    
    /**
     *
     */
    public ProjectionTest() {
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
    public void colisionTest(){
    Player p=new Player(0,0);
    Alien a=new Alien(0,0);
    assertEquals(p.getPositionX(),a.getPositionX());
    p.atira();
    assertNull(a);
    
    int x = p.getVidas();
    
    a=new Alien(0,0);
    a.atira();
    assertNotNull(p);
    assertFalse(p.getVidas()==x);
    assertEquals(x, p.getVidas()-1);
    a.atira();
    a.atira();
    assertEquals(0, p.getVidas());
    }

    /**
     * Test of getPositionX method, of class Tiro.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        ProjecTironce = null;
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Projection.
Tiro  @Test
    public void testMove() {
        System.out.println("move");
        int orientação = 0;
        Projection instancTiro        instance.move(orientação);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
