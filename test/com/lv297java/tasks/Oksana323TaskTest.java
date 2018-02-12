package com.lv297java.tasks;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Oksana323Task.class.
 * Test methods: findAllResultNumbers().
 * Test methods: greatestCommonDivisor().
 * Test methods: readNumber().
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2018-12-02
 */
@RunWith(Parameterized.class)
public class Oksana323TaskTest {

    private OksanaTask323 oksanaTask323;

    private int input;
    private List<Integer> expected;

    public Oksana323TaskTest(int input, List<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void initTest() {
        oksanaTask323 = new OksanaTask323();
    }

    @After
    public void tearDown() {
        oksanaTask323 = null;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {6, Arrays.asList(1, 5)},
                {23, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)},
                {1, Arrays.asList()}
        });
    }

    @org.junit.Test
    public void findAllResultNumbersTest() {
        List<Integer> actual = oksanaTask323.findAllResultNumbers(input);
        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void greatestCommonDivisorTest() {
        int expected = 4;
        assertEquals(expected, oksanaTask323.greatestCommonDivisor(12, 8));
    }

    @org.junit.Test
    public void readNumberTest() {
        String input = "3";
        int expected = 3;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(expected, oksanaTask323.readNumber());
    }


}



