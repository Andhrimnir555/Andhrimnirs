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
import testfigures.Entity.Triangle;

/**
 *
 * @author Boris
 */
public class TriangleLogicTest {

    public TriangleLogicTest() {
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
     * Test of randTriangle method, of class TriangleLogic.
     */
    @Test
    public void testRandTriangle() {
        System.out.println("randTriangle");
        boolean expResult = true;
        Triangle result = TriangleLogic.randTriangle();
        assertEquals(expResult, result.getCorners().length == 3);
        assertEquals(expResult, result.getCorners()[0] + result.getCorners()[1]
                + result.getCorners()[2] == 180);
        assertEquals(expResult, result.getSides()[0] < result.getSides()[1]
                + result.getSides()[2]);
        assertEquals(expResult, result.getSides()[0] > result.getSides()[1]
                - result.getSides()[2]);
    }
}
