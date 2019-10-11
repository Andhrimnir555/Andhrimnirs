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
public class TrapezoidLogicTest {

    public TrapezoidLogicTest() {
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
     * Test of randTrapezoid method, of class TrapezoidLogic.
     */
    @Test
    public void testRandTrapezoid() {
        System.out.println("randTrapezoid");
        int expResult = 360;
        Quadrangle result = TrapezoidLogic.randTrapezoid();
        assertEquals(expResult, result.getCorners()[0] + result.getCorners()[1]
                + result.getCorners()[2] + result.getCorners()[3], 0.1);
        assertEquals(expResult / 2, result.getCorners()[0] + result.getCorners()[1], 0.1);
    }
}
