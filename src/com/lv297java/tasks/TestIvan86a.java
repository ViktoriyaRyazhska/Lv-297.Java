package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.Scanner;

/**
 * Class for task 86a.
 * determines the number of digits in the number
 *
 * @author Ivan Bernevek
 * @version 1.0 8 Feb 2018
 */
public class TestIvan86a extends AbstractTest {
    /**
     * Initializes a newly created {@link TestIvan86a} object.
     * It represents a Task 86a.
     */
    public TestIvan86a() {
        super("TestIvan86a");
    }

    @Override
    public void execute() {
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        final int step = 10;
        int numberDigits = 0;
        int beginnerVariable = scanner.nextInt();
        int variable = beginnerVariable;
        if (variable > 0) {
            while (variable > 0) {
                numberDigits++;
                variable /= step;
            }
            System.out.println("in the number " + beginnerVariable + " are " + numberDigits + " numbers");
        } else {
            System.out.println("the number is not natural");
        }
        System.out.println("*******************************************");

    }
}
