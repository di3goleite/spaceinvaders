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
public class JogoTest {
    
    public JogoTest() {
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
     * Test of run method, of class Jogo.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Jogo instance = new Jogo(800,600);
        assertEquals(0, instance.cb.paredeX0);
        assertEquals(0, instance.cb.paredeY0);
        assertEquals(600, instance.cb.paredeX);
        assertEquals(800, instance.cb.paredeY);
        instance.run();
        assertNotNull(instance.cb.aliens);
        assertEquals(instance.cb.aliens.size(), 55);
    } 
}