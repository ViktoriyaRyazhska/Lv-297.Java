package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class that extends abstract class AbstractTask and contains solution for task number 323.
 *
 * @author Yura Katola
 * @version 1.0
 */
public class TaskYura323 extends AbstractTask {

    /**
     * Initializes a newly created {@code TaskYura323} object.
     */
    public TaskYura323() {
        super("323(3)");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Naturally prime number n is given. Find all"
                + " naturally prime numbers "
                + " smaller than n and relative prime with n.");
        System.out.println("Enter the naturally number n: ");
        n = sc.nextInt();
        System.out.println("Primes: " + findNaturallyPrimes(n));
    }

    /**
     * Finds all naturally prime numbers smaller than <code>n</code> and relative prime with <code>n</code>.
     *
     * @param n an naturally integer number. For example [1,2,3,4,5...]
     * @return list of naturally prime integer numbers
     * @throws IllegalArgumentException when <code>n</code> will be not a naturally number: when it will be less then
     *                                  1.
     */
    public List<Integer> findNaturallyPrimes(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "Argument 'n' is not a naturally integer number. It less then 1.");
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (grandCentralDispatch(n, i) == 1) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * This method returns GCD(Grand Central Dispatch) value of parameters a and b.
     *
     * @param a - first number, divided.
     * @param b - second number, divider.
     * @return grand central dispatch value of two numbers.
     */
    private int grandCentralDispatch(final int a, final int b) {
        int divided = a;
        int divider = b;
        while (divider != 0) {
            int tmp = divided % b;
            divided = divider;
            divider = tmp;
        }
        return divider;
    }
}
