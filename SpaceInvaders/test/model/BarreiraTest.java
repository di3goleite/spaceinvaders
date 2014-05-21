/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

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
 * @author lucas
 */
public class BarreiraTest {
    
    public BarreiraTest() {
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
     * Test of playerdisparou method, of class Barreira.
     */
    @Test
    public void testPlayerdisparou() {
        System.out.println("playerdisparou");
        TiroEvent e = null;
        Barreira instance = new Barreira();
//        instance.playerdisparou(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alienDisparou method, of class Barreira.
     */
    @Test
    public void testAlienDisparou() {
        System.out.println("alienDisparou");
        TiroEvent e = null;
        Barreira instance = new Barreira();
//        instance.alienDisparou(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveu method, of class Barreira.
     */
    @Test
    public void testMoveu_TiroEvent() {
        System.out.println("moveu");
        TiroEvent e = null;
        Barreira instance = new Barreira();
        instance.moveu(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveu method, of class Barreira.
     */
    @Test
    public void testMoveu_AlienEvent() {
        System.out.println("moveu");
        AlienEvent ae = null;
        Barreira instance = new Barreira();
        instance.moveu(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atirou method, of class Barreira.
     */
    @Test
    public void testAtirou() {
        System.out.println("atirou");
        AlienEvent ae = null;
        Barreira instance = new Barreira();
        instance.atirou(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of foiAtingido method, of class Barreira.
     */
    @Test
    public void testFoiAtingido() {
        System.out.println("foiAtingido");
        AlienEvent ae = null;
        Barreira instance = new Barreira();
        instance.foiAtingido(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
