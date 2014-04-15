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
    Projection P=p.atira();
    assertEquals(p.getPositionX(),P.getPositionX());
    assertEquals(P.getPositionX(),a.getPositionX());
    assertNull(a);
    
    int x = p.getVidas();
    
    a=new Alien(0,0);
    P=a.atira();
    assertEquals(a.getPositionX(),P.getPositionX());
    assertEquals(P.getPositionX(),p.getPositionX());
    assertNotNull(p);
    assertFalse(p.getVidas()==x);
    assertEquals(x, p.getVidas()-1);
    P=a.atira();
    assertEquals(a.getPositionX(),P.getPositionX());
    assertEquals(P.getPositionX(),p.getPositionX());
    P=a.atira();
    assertEquals(a.getPositionX(),P.getPositionX());
    assertEquals(P.getPositionX(),p.getPositionX());
    assertEquals(0, p.getVidas());
    }
}
