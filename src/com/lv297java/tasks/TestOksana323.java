package com.lv297java.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class implement task 323.
 * @version 1.0
 * @author Oksana Mekh
 */
public class TestOksana323 extends AbstractTest {

    /**
     * Initializes a newly created {@link TestOksana323} object.
     * It represents a Task 323.
     */
    public TestOksana323() {
        super("323");
    }

    /**
     * {@inheritDoc}
     * <p>Current task is to find all natural numbers
     * that are less than n and are mutually simple with it.</p>
     * <p>It expects the input of one number.</p>
     */
    @Override
    public void execute() {
        int n = readNumber();
        List<Integer> resultNumbers = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (greatestCommonDivisor(i, n) == 1) {
                resultNumbers.add(i);
            }
        }

        System.out.println("Result: " + resultNumbers);
        System.out.println("Task executed.");
    }

    /**
     * Read natural number from console input.
     * @return natural number
     */
    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n < 1) {
                    System.out.println("Number can not be less then 1.");
                } else {
                    return n;
                }
            } else {
                System.out.println("Input text is not a number.");
            }
        }
    }

    /**
     * Finds GCD of two numbers.
     * @param a first number
     * @param b second number
     * @return GCD of two numbers
     */
    private static int greatestCommonDivisor(final int a, final int b) {
        if (b == 0) {
            return a;
        }
        int remainder = a % b;
        return greatestCommonDivisor(b, remainder);
    }
}
