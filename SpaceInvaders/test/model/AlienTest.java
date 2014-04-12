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
    
    Alien a=new Alien(0,0);
    
    public AlienTest() {
    
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

    @Test
    public void mover(){
        
        int x=a.getPositionX();
        int y=a.getPositionY();
        a.mover(a.getPositionX()+10, a.getPositionY());
        assertFalse(x==a.getPositionX());
        assertEquals(x+10, a.getPositionX());
        assertEquals(y, a.getPositionY());
    }
    
}
