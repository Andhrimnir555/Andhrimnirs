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
import testfigures.Entity.Figure;
import testfigures.Enums.Colors;

/**
 *
 * @author Boris
 */
public class RandomValuesTest {

    public RandomValuesTest() {
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
     * Test of randLineOrCorner method, of class RandomValues.
     */
    @Test
    public void testRandLineOrCorner() {
        System.out.println("randLineOrCorner");
        double min = 0.1;
        double max = 3;
        double expResult = 1.5;
        double result = RandomValues.randLineOrCorner(min, max);
        for (int i = 0; i < 10000; i++) {
            result += RandomValues.randLineOrCorner(min, max);
        }
        result /= 10000;
        assertEquals(expResult, result, 0.1);
    }
}