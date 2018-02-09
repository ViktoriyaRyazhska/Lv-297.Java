package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.Scanner;
/**
 * Class that extends abstract class AbstractTest and
 * contains solution for
 * task number 559.
 *
 * @version 1.0
 * @author Yura Katola
 */
public class TestYura559 extends AbstractTest {
    /**
     * Initializes a newly created {@code TestYura559} object.
     */
    public TestYura559() {
        super("559");
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Naturally number n is given. Find all"
                + " Mersen numbers smaller than n.");
        System.out.println("Enter the naturally number n: ");
        int n = sc.nextInt();
        int temp = 1;
        int mersenNum;
        do {
            temp *= 2;
            mersenNum = temp - 1;
            if (mersenNum < n) {
                System.out.println(mersenNum + " ");
            }
        } while (mersenNum < n);
    }
}
