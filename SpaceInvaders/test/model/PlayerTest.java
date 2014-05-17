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
public class PlayerTest {

    Player p=new Player(0,0,0);

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    /**
     *
     */
    @Test
    public void moverTest(){
     
        int x=p.getPositionX();
        int y=p.getPositionY();
      //  p.mover(p.getPositionX()+10, p.getPositionY());
        assertFalse(x==p.getPositionX());
        assertEquals(x+10, p.getPositionX());
        assertEquals(y, p.getPositionY());
    }
    
    /**
     *
     */ 
    @Test
    public void moverForaTest(){
     
        int x=p.getPositionX();
        int y=p.getPositionY();
//        p.mover(p.getPositionX()-10, p.getPositionY()); //lançar exceção
    }
    
    /**
     *
     */
    @Test
    public void atiraTest(){
        
        p.atira();
    }

    /**
     * Test of getVidas method, of class Player.
     */
    @Test
    public void testGetVidas() {
        System.out.println("getVidas");
        Player instance = null;
        int expResult = 0;
        int result = instance.getVidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVidas method, of class Player.
     */
    @Test
    public void testSetVidas() {
        System.out.println("setVidas");
        int vidas = 0;
        Player instance = null;
        instance.setVidas(vidas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Player.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Player instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Player.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Player instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Player.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Player instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Player.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Player instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositionX method, of class Player.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositionY method, of class Player.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPositionY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mover method, of class Player.
     */
    @Test
    public void testMover() {
        System.out.println("mover");
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
        System.out.println("atira");
        Player instance = null;
        Tiro expResult = null;
        instance.atira();
        assertEquals(expResult, 1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
