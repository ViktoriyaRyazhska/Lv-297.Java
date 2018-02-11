package com.lv297java.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KolyasaTask88aTest {

    private Class<KolyasaTask88a> testClass = KolyasaTask88a.class;
    private KolyasaTask88a testInstance = new KolyasaTask88a();

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
    public void doesIncludeTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("doesInclude", int.class, int.class);
        method.setAccessible(true);
        Assert.assertTrue((boolean) method.invoke(testInstance, 3, 103));
        Assert.assertFalse((boolean) method.invoke(testInstance, 3, 100));
    }
}
