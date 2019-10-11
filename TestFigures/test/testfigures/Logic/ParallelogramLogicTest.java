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
import testfigures.Entity.Quadrangle;

/**
 *
 * @author Boris
 */
public class ParallelogramLogicTest {

    public ParallelogramLogicTest() {
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
     * Test of randParallelogram method, of class ParallelogramLogic.
     */
    @Test
    public void testRandParallelogram() {
        System.out.println("randParallelogram");
        boolean expResult = true;
        Quadrangle result = ParallelogramLogic.randParallelogram();
         int expResulti1 = 360;
        assertEquals(result.getSides()[0] == result.getSides()[2], expResult);
        assertEquals(result.getSides()[1] == result.getSides()[3], expResult);
        assertEquals(result.getCorners()[0] == result.getCorners()[2], expResult);
        assertEquals(result.getCorners()[1] == result.getCorners()[3], expResult);
        assertEquals(result.getDiagonales()[1] - result.getDiagonales()[0] != 0, expResult);   
                assertEquals(expResulti1, result.getCorners()[0] + result.getCorners()[1]
                + result.getCorners()[2] + result.getCorners()[3], 0.1);
    }
}
