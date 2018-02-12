package com.lv297java.tasks;

import static org.junit.Assert.*;

/**
 * Test class for VadymTask178d.class.
 * Test methods: calculation().
 *
 * @version 1.0
 * @since 2018-11-02
 * @author Ivan
 */
public class VadymTask178dTest {
    VadymTask178d vadymTask178d;
    @org.junit.Before
    public void setUp() throws Exception {
        vadymTask178d = new VadymTask178d();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        vadymTask178d = null;
    }

    @org.junit.Test
    public void testCalculationValid() throws Exception {
        int[] inputArray = {1, 2, 3, 4, 17, 5};
        int expected = 1;
        int actual = vadymTask178d.calculation(inputArray);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testCalculationInValid() throws Exception {
        int[] inputArray = {-1, -2, -3, -4, -17, -5};
        int expected = 0;
        int actual = vadymTask178d.calculation(inputArray);
        assertEquals(expected,actual);
    }

}