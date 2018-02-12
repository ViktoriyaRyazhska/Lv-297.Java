package com.lv297java.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivan on 12.02.18.
 */
public class VadymTask178gTest {
    VadymTask178g vadymTask178g;
    @org.junit.Before
    public void setUp() throws Exception {
        vadymTask178g = new VadymTask178g();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        vadymTask178g = null;
    }

    @org.junit.Test
    public void testCalculationValid() throws Exception {
        int[] inputArray = {10, 2, 1, 6, 14};
        int expected = 3;
        int actual = vadymTask178g.calculation(inputArray);
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testCalculationInValid() throws Exception {
        int[] inputArray = {-10, -2, -1, -6, -14};
        int expected = 0;
        int actual = vadymTask178g.calculation(inputArray);
        assertEquals(expected,actual);
    }
}