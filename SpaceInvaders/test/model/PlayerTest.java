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
import org.junit.experimental.categories.Categories;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Lucas
 */
public class PlayerTest {

    Player p=new Player(0,0);

    /**
     *
     */
    public PlayerTest() {
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
    public void moverTest(){
     
        int x=p.getPositionX();
        int y=p.getPositionY();
        p.mover(p.getPositionX()+10, p.getPositionY());
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
        p.mover(p.getPositionX()-10, p.getPositionY()); //lançar exceção
    }
    
    /**
     *
     */
    @Test
    public void atiraTest(){
        
        p.atira();
    }
    
}
