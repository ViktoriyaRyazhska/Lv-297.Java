package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implement task 560.
 * @version 1.0
 * @author Oksana Mekh
 */
public class TaskOksana560 extends AbstractTest {

    /**
     * Initializes a newly created {@link TaskOksana560} object.
     * It represents a Task 560.
     */
    public TaskOksana560() {
        super("560");
    }

    /**
     * Finds divisors of the number.
     * @param number the number, divisors of what must to be found
     * @return divisors of the number
     */
    private static List<Integer> findDivisors(final int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        TaskOksana182 t = new TaskOksana182();
        //t.execute();
        return divisors;
    }

    /**
     * Checks numbers are friendly.
     * @param a first number
     * @param b second number
     * @return true if numbers are friendly and false - otherwise
     */
    private static boolean numbersAreFriendly(final int a, final int b) {
        int sumADivisors = 0;
        int sumBDivisors = 0;

        for (Integer divisor : findDivisors(a)) {
            sumADivisors += divisor;
        }
        for (Integer divisor : findDivisors(b)) {
            sumBDivisors += divisor;
        }

        if (a == sumBDivisors && b == sumADivisors) {
            return true;
        }

        return false;
    }

    /**
     * {@inheritDoc}
     * <p>Two natural numbers are called friendly,
     * if each of them is equal to the sum of all divisors of another,
     * except for the same number.
     * Find all pairs of friendly numbers lying in the range of 200 to 300.</p>
     * <p>Current task does not expect the input.</p>
     */
    @Override
    public void execute() {
        final int leftLimit = 200;
        final int rightLimit = 300;
        System.out.println("Result: ");
        for (int i = leftLimit; i <= rightLimit; i++) {
            for (int j = i; j <= rightLimit; j++) {
                if (numbersAreFriendly(i, j)) {
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println("Task executed.");
    }

}
