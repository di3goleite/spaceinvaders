/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.observer.TiroEvent;
import model.observer.TiroListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class TiroTest {
    
    public TiroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPositionX method, of class Tiro.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Tiro instance = null;
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTiroListerner method, of class Tiro.
     */
    @Test
    public void testAddTiroListerner() {
        System.out.println("addTiroListerner");
        TiroListener tl = null;
        Tiro instance = null;
        instance.addTiroListerner(tl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTiroListerner method, of class Tiro.
     */
    @Test
    public void testRemoveTiroListerner() {
        System.out.println("removeTiroListerner");
        TiroListener tl = null;
        Tiro instance = null;
        instance.removeTiroListerner(tl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of moveu method, of class Tiro.
     */
    @Test
    public void testMoveu() {
        System.out.println("moveu");
        TiroEvent e = null;
        Tiro instance = null;
        instance.moveu(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
