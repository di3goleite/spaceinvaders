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
public class CampoDeBatalhaTest {
    
    public CampoDeBatalhaTest() {
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
     * Test of criarCampo method, of class CampoDeBatalha.
     */
    @Test
    public void testCriarCampo() {
        System.out.println("criarCampo");
        int altura = 500;
        int largura = 500;
        CampoDeBatalha instance = new CampoDeBatalha();
        instance.criarCampo(altura, largura);
        assertNotNull(instance.aliens);
        assertEquals(instance.aliens.size(), 55);
        assertEquals(instance.paredeX0, 0);
        assertEquals(instance.paredeY0, 0);
        
        assertEquals(instance.paredeX, 500);
        assertEquals(instance.paredeY, 500);
    }

    /**
     * Test of move method, of class CampoDeBatalha.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        CampoDeBatalha instance = new CampoDeBatalha();
        instance.criarCampo(500,500);
        int x=instance.aliens.get(0).getPositionX();
        instance.move();
        assertFalse(x==instance.aliens.get(0).getPositionX());
        assertEquals(x+10, instance.aliens.get(0).getPositionX());
    }

    /**
     * Test of atira method, of class CampoDeBatalha.
     */
    @Test
    public void testAtira() {
        System.out.println("atira");
        CampoDeBatalha instance = new CampoDeBatalha();
        instance.atira();
    }
    
}
