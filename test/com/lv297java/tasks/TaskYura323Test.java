package com.lv297java.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TaskYura323Test {

    private final YuraTask323 task = new YuraTask323();

    @Test
    public void testGrandCentralDispatchFromPositiveAndPositive() {
        Assert.assertEquals(5, task.grandCentralDispatch(25, 15));
    }

    @Test
    public void testGrandCentralDispatchFromPositiveAndNegative() {
        Assert.assertEquals(-5, task.grandCentralDispatch(-25, 15));
    }

    @Test
    public void testGrandCentralDispatchFromNegativeAndPositive() {
        Assert.assertEquals(5, task.grandCentralDispatch(-25, 15));
    }

    @Test
    public void testGrandCentralDispatchFromNegativeAndNegative() {
        Assert.assertEquals(-5, task.grandCentralDispatch(-25, -15));
    }

    @Test
    public void testFindNaturallyPrimes() {
        Assert.assertEquals(Arrays.asList(8, 7, 5, 4, 2, 1), task.findNaturallyPrimes(9));
    }

}
