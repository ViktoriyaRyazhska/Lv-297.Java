package com.lv297java.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KolyasaTask322Test {
    private Class<KolyasaTask322Version2> testClass = KolyasaTask322Version2.class;
    private KolyasaTask322Version2 testInstance = new KolyasaTask322Version2();

    @Test
    public void validatorTestForPositives() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("validator", String.class);
        method.setAccessible(true);
        int random = (int) (Math.random()*2147483647 + 1);
        System.out.println(random);
        Assert.assertEquals(random, method.invoke(testInstance, String.valueOf(random)));
    }

    @Test(expected = NumberFormatException.class)
    public void validatorTestForZeroAndNegatives() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("validator", String.class);
        method.setAccessible(true);
        int random = (int) (Math.random()*-2147483648);
        try {
            method.invoke(testInstance, String.valueOf(random));
        } catch (InvocationTargetException e) {
            if(e.getCause() instanceof NumberFormatException) {
                throw new NumberFormatException();
            }
        }
    }

    @Test(expected = NumberFormatException.class)
    public void validatorTestForNull() throws NoSuchMethodException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("validator", String.class);
        method.setAccessible(true);
        String a = null;
        try {
            method.invoke(testInstance, a);
        } catch (InvocationTargetException e) {
            if(e.getCause() instanceof NumberFormatException) {
                throw new NumberFormatException();
            }
        }
    }

    @Test(expected = NumberFormatException.class)
    public void validatorTestForNotNumbers() throws NoSuchMethodException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("validator", String.class);
        method.setAccessible(true);
        try {
            method.invoke(testInstance, "12s3");
        } catch (InvocationTargetException e) {
            if(e.getCause() instanceof NumberFormatException) {
                throw new NumberFormatException();
            }
        }
    }

    @Test
    public void findNumberTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("findNumber", int.class, int.class);
        method.setAccessible(true);
        Assert.assertArrayEquals(new int[]{9240, 34560}, (int[]) method.invoke(testInstance, 1, 10000));
        Assert.assertArrayEquals(new int[]{9240, 34560}, (int[]) method.invoke(testInstance, 1, 9241));
    }


}
