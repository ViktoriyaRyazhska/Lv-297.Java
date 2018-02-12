package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class implement task 324.
 *
 * @author Nazariy Demyanovskyi
 * @version 1.0
 */
public class TaskNazariy324 extends AbstractTask {

    /**
     * Initializes a newly created {@code TaskNazariy324} object.
     * It represents an Task 324.
     */
    public TaskNazariy324() {
        super("324");
    }

    /**
     * Finds the all divisors of the number <code>p</code>, which are mutually simple with <code>q</code>.
     * @param p any integer number
     * @param q any integer number
     * @return list of all divisors of the number <code>p</code>, which are mutually simple with <code>q</code>
     */
    public static List<Integer> findDivisorsMutuallySimpleWith(final int p, final int q) {
        List<Integer> divisors = new ArrayList<>();
        int sqrtQ = (int) Math.sqrt(q) + 1;
        for (int i = 1; i < sqrtQ; i++) {
            if (q % i == 0) {
                if (greatestCommonDivisor(i, p) == 1) {
                    divisors.add(i);
                }
                if (i * i != q) {
                    int additionalDivisor = q / i;
                    if (greatestCommonDivisor(additionalDivisor, p) == 1) {
                        divisors.add(additionalDivisor);
                    }
                }
            }
        }
        return divisors;
    }

    /**
     * Calculate greatest common divisor of x and y.
     * @param x left value
     * @param y right value
     * @return greatest common divisor
     */
    @SuppressWarnings("SuspiciousNameCombination")
    private static int greatestCommonDivisor(final int x, final int y) {
        if (y != 0) {
            return greatestCommonDivisor(y, x % y);
        } else {
            return x;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        Integer p = readNumberFromInput("p");
        if (p == null) {
            return;
        }
        Integer q = readNumberFromInput("q");
        if (q == null) {
            return;
        }
        System.out.println("Divisors: " + findDivisorsMutuallySimpleWith(p, q));
    }

    /**
     * Reads one integer value from standart input.
     * @param name name of read number
     * @return integer value from standart input
     */
    private static Integer readNumberFromInput(final String name) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter " + name + ": ");
            if (!scanner.hasNextInt()) {
                if (scanner.hasNext("(?i)\\s*exit\\s*")) {
                    return null;
                } else {
                    System.out.println("Incorrect number. "
                            + "Try again or input 'exit' to exit.");
                    scanner.next();
                    continue;
                }
            }
            return scanner.nextInt();
        }
    }
}
