package com.lv297java.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test class for Oksana560Task.class.
 * Test methods: findDivisors().
 * Test methods: numbersAreFriendly().
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2018-12-02
 */
public class Oksana560TaskTest {

    private OksanaTask560 oksanaTask560;

    @Before
    public void initTest() {
        oksanaTask560 = new OksanaTask560();
    }

    @After
    public void tearDown() {
        oksanaTask560 = null;
    }

    @Test
    public void findDivisorsTest() {
        int input = 12;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6);
        assertEquals(expected, oksanaTask560.findDivisors(input));
    }

    @Test
    public void numbersAreFriendlyTest() {
        boolean expected = false;
        assertEquals(expected, oksanaTask560.numbersAreFriendly(0, 12));
    }


}
