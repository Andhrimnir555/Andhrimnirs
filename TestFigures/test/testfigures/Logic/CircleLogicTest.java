/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfigures.Logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testfigures.Entity.Circle;

/**
 *
 * @author Boris
 */
public class CircleLogicTest {
    
    public CircleLogicTest() {
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
     * Test of rand—ircle method, of class CircleLogic.
     */
    @Test
    public void testRand—ircle() {
        System.out.println("rand—ircle");
        double expResult = Math.PI;
        Circle c = CircleLogic.randCircle();
        double result = c.getArea() / Math.pow(c.getRadius(), 2);
        assertEquals(expResult, result, 0.0);
    }
    
}
