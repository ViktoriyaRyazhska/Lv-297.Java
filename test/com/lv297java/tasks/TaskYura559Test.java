package com.lv297java.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TaskYura559Test {

    private final YuraTask559 task = new YuraTask559();

    @Test
    public void testFindMersenNumbersPositive() {
        Assert.assertEquals(Arrays.asList(1, 3, 7), task.findMersenNumbers(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMersenNumbersNegative() {
        task.findMersenNumbers(-1);
    }

}
