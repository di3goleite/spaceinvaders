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
public class IAlienTest {
    
    public IAlienTest() {
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
     * Test of getPositionX method, of class IAlien.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        IAlien instance = new IAlienImpl();
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositionY method, of class IAlien.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        IAlien instance = new IAlienImpl();
        int expResult = 0;
        int result = instance.getPositionY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mover method, of class IAlien.
     */
    @Test
    public void testMover() {
        System.out.println("mover");
        int i = 0;
        int positionY = 0;
        IAlien instance = new IAlienImpl();
        instance.mover(i, positionY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atira method, of class IAlien.
     */
    @Test
    public void testAtira() {
        System.out.println("atira");
        IAlien instance = new IAlienImpl();
        instance.atira();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IAlienImpl implements IAlien {

        public int getPositionX() {
            return 0;
        }

        public int getPositionY() {
            return 0;
        }

        public void mover(int i, int positionY) {
        }

        public void atira() {
        }
    }
    
}
