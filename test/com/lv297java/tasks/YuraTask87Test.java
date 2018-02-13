package com.lv297java.tasks;

import org.junit.Assert;
import org.junit.Test;

public class YuraTask87Test {

    private final YuraTask87 task = new YuraTask87();

    @Test(timeout = 1000)
    public void testFindLastDigitsFromZero() {
        Assert.assertEquals(0, task.findSumLastDigits(0, 1));
    }

    @Test(timeout = 1000)
    public void testFindLastDigitsFromPositive() {
        Assert.assertEquals(3 + 5 + 7, task.findSumLastDigits(1357, 3));
    }

    @Test(timeout = 1000)
    public void testFindLastDigitsFromNegative() {
        Assert.assertEquals(7 + 5 + 3 + 1, task.findSumLastDigits(-97531, 4));
    }
}
