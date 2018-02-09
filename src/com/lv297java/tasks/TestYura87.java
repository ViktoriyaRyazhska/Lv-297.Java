package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.util.Scanner;
/**
 * Class that extends abstract class AbstractTest and
 * contains solution for
 * task number 87.
 *
 * @version 1.0
 * @author Yura Katola
 */
public class TestYura87 extends AbstractTest {
    /**
     * Initializes a newly created {@code TestYura87} object.
     */
    public TestYura87() {
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
        lastDigitsSum = findLastDigits(n, m);
        System.out.println("Last digits sum of number n = "
        + lastDigitsSum);
        }
    /**
     * @param n - number which summary  of last digits we want
     * to find.
     * @param m - number that represents amount of last digits we want to sum.
     * @return int value - summary m last digits of number n.
     */
    private int findLastDigits(final int n, final int m) {
        int sum = 0;
        int number = n;
        int lastDigitAmount = m;
        final int divider = 10;
        while (m > 0) {
            sum += number % divider;
            number = number / divider;
            lastDigitAmount--;
        }
        return sum;
    }
}