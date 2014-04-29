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
public class INaveTest {
    
        Nave alien = new Alien(0,0);
        Nave player = new Alien(100,100);
        
    public INaveTest() {
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
        alien = new Alien(0,0);
        player = new Alien(100,100);
    }

    /**
     * Test of mover method, of class INave.
     */
    @Test
    public void testMover() {
        
        int y = 0;
        int x = 0;
        int w = 100;
        int z = 100;
        assertEquals(x, alien.getPositionX());
        assertEquals(y, alien.getPositionY());
        assertEquals(z, player.getPositionX());
        assertEquals(w, player.getPositionY());

        this.alien.mover();
        this.player.mover();
        
        assertFalse(x==alien.getPositionX());
        assertTrue(y==alien.getPositionY());
        assertFalse(z==player.getPositionX());
        assertTrue(w==player.getPositionY());
        
        y=0;
        x=10;
        z=110;
        
        assertEquals(x, alien.getPositionX());
        assertEquals(y, alien.getPositionY());
        assertEquals(z, player.getPositionX());
        assertEquals(w, player.getPositionY());
        
    }

    /**
     * Test of atira method, of class INave.
     */
    @Test
    public void testAtira() {
        for(int i=0; i<10;i++) alien.mover();
        assertEquals(alien.getPositionX(), player.getPositionX());
        
        assertEquals(3, ((Player)player).getVidas());
        alien.atira();
        assertNotNull(player);
        assertEquals(2, ((Player)player).getVidas());
        player.atira();
        assertNull(alien);
    }
    
}
