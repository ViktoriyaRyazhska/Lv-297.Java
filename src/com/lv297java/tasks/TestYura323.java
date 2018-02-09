package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.util.Scanner;
/**
 * Class that extends abstract class AbstractTest and
 * contains solution for
 * task number 323.
 *
 * @version 1.0
 * @author Yura Katola
 */
public class TestYura323 extends AbstractTest {
    /**
     * Initializes a newly created {@code TestYura323} object.
     */
    public TestYura323() {
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
        for (int i = 2; i < n; i++) {
            if (grandCentralDispatch(n, i) == 1) {
                System.out.print(i + " ");
            }
        }
    }
    /**
     * This method returns GCD(Grand Central Dispatch) value
     * of parameters a and b.
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