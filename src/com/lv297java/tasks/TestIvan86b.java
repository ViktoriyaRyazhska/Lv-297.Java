package com.lv297java.tasks;

import com.lv297java.AbstractTest;
import java.util.Scanner;

/**
 * Class for task 86b.
 * determines the sum of digits in the number
 *
 * @author Ivan Bernevek
 * @version 1.0 8 Feb 2018
 */
public class TestIvan86b extends AbstractTest {
    /**
     * Initializes a newly created {@link TestIvan86b} object.
     * It represents a Task 86b.
     */
    public TestIvan86b() {
        super("TestIvan86b");
    }

    @Override
    public void execute() {
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        final int step = 10;
        int sum = 0;
        int beginnerVariable = scanner.nextInt();
        int variable = beginnerVariable;
        if (variable > 0) {
            while (variable > 0) {
                sum += variable % step;
                variable /= step;
            }
            System.out.println("the sum of digits number's " + beginnerVariable + " are " + sum);
        } else {
            System.out.println("the number is not natural");
        }
        System.out.println("*******************************************");
    }
}
