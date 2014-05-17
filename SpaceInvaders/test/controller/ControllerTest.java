/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Player;
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
public class ControllerTest {
    
    Player p=new Player(0,0,0);

    /**
     *
     */
    public ControllerTest() {
     
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
    
    
    @Test
    public void criarJogoTest(){
    
    }
    
    
    /**
     *Teste de movimentação do player
     */
    @Test
    public void moverPlayertest() {
        int x=p.getPositionX();  
        int y=p.getPositionY();
        p.mover();  //movimenta o player 
        assertFalse(x==p.getPositionX()); //verifica se ocorreram as mudanças esperadas
        assertEquals(x+10, p.getPositionX()); //
        assertEquals(y, p.getPositionY());
    }
    
    
    
}
