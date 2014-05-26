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
        Tiro instance = null;
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
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
