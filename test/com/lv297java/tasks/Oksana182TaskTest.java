package com.lv297java.tasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Oksana182Task.class.
 * Test methods: findResultCount().
 * Test methods: findResultSum().
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2018-12-02
 */
@RunWith(Parameterized.class)
public class Oksana182TaskTest {

    private OksanaTask182 oksanaTask182;

    private List inputForCount;
    private int expectedForCount;
    private List inputForSum;
    private int expectedForSum;

    public Oksana182TaskTest(List inputForCount, int expectedForCount, List inputForSum, int expectedForSum) {
        this.inputForCount = inputForCount;
        this.expectedForCount = expectedForCount;
        this.inputForSum = inputForSum;
        this.expectedForSum = expectedForSum;
    }

    @Before
    public void initTest() {
        oksanaTask182 = new OksanaTask182();
    }

    @After
    public void tearDown() {
        oksanaTask182 = null;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList(0, 0, 0, 0), 0, Arrays.asList(0, 0, 0, 0), 0},
                {Arrays.asList(23, 11, 655, 0), 1, Arrays.asList(23, 11, 655, 0), 655},
                {Arrays.asList(10, 10, 10, 10), 4, Arrays.asList(10, 10, 10, 10), 40},
                {Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), 0, Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), 0},
                {Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE), 0, Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), 0},
                {Arrays.asList(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1), 0, Arrays.asList(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1), 0},
                {Arrays.asList(Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1), 0, Arrays.asList(Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1), 0}
        });
    }

    @Test
    public void findResultCountTest() {
        assertEquals(expectedForCount, oksanaTask182.findResultCount(inputForCount));
    }

    @Test
    public void findResultSumTest() {
        assertEquals(expectedForSum, oksanaTask182.findResultSum(inputForSum));
    }


}
