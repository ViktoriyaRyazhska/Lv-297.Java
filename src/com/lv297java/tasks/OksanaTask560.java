package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implement task 560:
 * <p>Two natural numbers are called friendly,
 * if each of them is equal to the sum of all divisors of another,
 * except for the same number.
 * Find all pairs of friendly numbers lying in the range of 200 to 300.</p>
 *
 * @version 1.0
 * @author Oksana Mekh
 */
public class OksanaTask560 extends AbstractTask {
    /**
     * We must find friendly numbers between 200 and 300
     * by task condition(?).
     * This constant represent number 200.
     */
    public static final int LEFT_LIMIT = 200;

    /**
     * We must find friendly numbers between 200 and 300
     * by task condition(?).
     * This constant represent number 300.
     */
    public static final int RIGHT_LIMIT = 300;

    /**
     * Initializes a newly created {@link OksanaTask560} object.
     * Constructor without parameters exist for initialise field
     * {@link AbstractTask#testID} in parent {@code AbstractTest} Class
     * It represents a Task 560.
     */
    public OksanaTask560() {
        super("560");
    }

    /**
     * Finds divisors of the number.
     * @param number the number, divisors of what must to be found
     * @return divisors of the number as List
     */
    public static List<Integer> findDivisors(final int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /**
     * Checks numbers are friendly.
     * @param a first number
     * @param b second number
     * @return true if numbers are friendly and false - otherwise
     */
    public static boolean numbersAreFriendly(final int a, final int b) {
        int sumADivisors = 0;
        int sumBDivisors = 0;

        for (Integer divisor : findDivisors(a)) {
            sumADivisors += divisor;
        }
        for (Integer divisor : findDivisors(b)) {
            sumBDivisors += divisor;
        }

        return (a == sumBDivisors) && (b == sumADivisors);
    }

    /**
     * Finds pair of friendly numbers in specified period of numbers.
     *
     * @param leftLimit  low limit
     * @param rightLimit high limit
     * @return pairs of friendly numbers between limits
     */
    public static List<FriendlyPair> findFriendlyPairsBetweenLimits(
            int leftLimit, int rightLimit) {
        List<FriendlyPair> friendlyPairs = new ArrayList<>();
        for (int i = leftLimit; i <= rightLimit; i++) {
            for (int j = i; j <= rightLimit; j++) {
                if (numbersAreFriendly(i, j)) {
                    friendlyPairs.add(new FriendlyPair(i, j));
                }
            }
        }
        return friendlyPairs;
    }

    /**
     * {@inheritDoc}
     * <p>This method finds all pairs of friendly numbers
     * lying in the range of 200 to 300.</p>
     * <p>Current task does not expect the input.</p>
     */
    @Override
    public void execute() {
        System.out.println("Result: ");
        System.out.println(
                findFriendlyPairsBetweenLimits(LEFT_LIMIT, RIGHT_LIMIT));
        System.out.println("Task executed.");
    }

    /**
     * Represents container for two friendly numbers.
     */
    public static class FriendlyPair {
        /**
         * Left number in pair.
         */
        private final int leftNumber;

        /**
         * Right number in pair.
         */
        private final int rightNumber;

        /**
         * Constructs pair of two input numbers.
         *
         * @param leftNumber  left number in pair
         * @param rightNumber right number in pair
         */
        public FriendlyPair(int leftNumber, int rightNumber) {
            this.leftNumber = leftNumber;
            this.rightNumber = rightNumber;
        }

        /**
         * @return left number
         */
        public int getLeftNumber() {
            return leftNumber;
        }

        /**
         * @return right number
         */
        public int getRightNumber() {
            return rightNumber;
        }
    }
}
