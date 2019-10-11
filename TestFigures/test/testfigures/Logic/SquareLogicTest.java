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
public class SquareLogicTest {

    public SquareLogicTest() {
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
     * Test of randSquare method, of class SquareLogic.
     */
    @Test
    public void testRandSquare() {
        System.out.println("randSquare");
        boolean expResult = true;
        Quadrangle result = SquareLogic.randSquare();
        assertEquals(result.getCorners().length == 4, expResult);
        assertEquals(result.getSides().length == 4, expResult);
        assertEquals(result.getSides()[(int) (Math.random() * 4)]
                == result.getSides()[(int) (Math.random() * 4)], expResult);
        assertEquals(result.getCorners()[(int) (Math.random() * 4)] == 90, expResult);
        assertEquals(Math.sqrt(result.getArea())
                == result.getSides()[(int) (Math.random() * 4)], expResult);
    }
}
