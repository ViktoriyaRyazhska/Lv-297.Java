package com.lv297java.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for VadymTask555.class.
 * Test methods: pascalCalculation().
 *
 * @version 1.0
 * @since 2018-11-02
 * @author Ivan
 */
public class VadymTask555Test {
    VadymTask555 vadymTask555;
    @Before
    public void setUp() throws Exception {
        vadymTask555 = new VadymTask555();
    }

    @After
    public void tearDown() throws Exception {
        vadymTask555 = null;
    }

    @Test
    public void testPascalCalculationValid() throws Exception {

        int expected = 3;
        int actual = vadymTask555.pascalCalculation(3,2);
        assertEquals(expected,actual);
        expected = 1;
        actual = vadymTask555.pascalCalculation(3,3);
        assertEquals(expected,actual);

    }

    @Test(expected = StackOverflowError.class)
    public void testPascalCalculationInValid1() throws Exception {
        System.out.println(vadymTask555.pascalCalculation(3,5));
    }

    @Test(expected = StackOverflowError.class)
    public void testPascalCalculationInValid2() throws Exception {
        System.out.println(vadymTask555.pascalCalculation(-3,-1));
    }
}