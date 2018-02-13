package com.lv297java.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KolyasaTask88bTest {
    private Class<KolyasaTask88bVersion2> testClass = KolyasaTask88bVersion2.class;
    private KolyasaTask88bVersion2 testInstance = new KolyasaTask88bVersion2();

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
    public void reverserTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = testClass.getDeclaredMethod("reverser", int.class);
        method.setAccessible(true);
        Assert.assertEquals("4321", method.invoke(testInstance, 1234));
        Assert.assertNotEquals("4321", method.invoke(testInstance, 4321));
    }

}
