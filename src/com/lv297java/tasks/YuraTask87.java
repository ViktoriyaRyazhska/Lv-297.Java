package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.Scanner;

/**
 * Class that extends abstract class AbstractTask and contains solution for task number 87.
 *
 * @author Yura Katola
 * @version 1.0
 */
public class YuraTask87 extends AbstractTask {

    /**
     * Initializes a newly created {@code TaskYura87} object.
     */
    public YuraTask87() {
        super("87(2)");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        int n;
        int m;
        int lastDigitsSum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Naturally numbers n, m is given. "
                + "Find m last digits sum of number n.");
        System.out.println("Enter the naturally number n: ");
        n = sc.nextInt();
        System.out.println("Enter the naturally number m: ");
        m = sc.nextInt();
        lastDigitsSum = findSumLastDigits(n, m);
        System.out.println("Last digits sum of number n = "
                + lastDigitsSum);
    }

    /**
     * @param n - number which summary of last digits we want to find.
     * @param m - number that represents amount of last digits we want to sum.
     * @return int value - summary m last digits of number n.
     */
    public int findSumLastDigits(final int n, final int m) {
        int sum = 0;
        int number = n;
        int lastDigitAmount = m;
        final int divider = 10;
        while (lastDigitAmount > 0) {
            sum += number % divider;
            number = number / divider;
            lastDigitAmount--;
        }
        return sum;
    }
}