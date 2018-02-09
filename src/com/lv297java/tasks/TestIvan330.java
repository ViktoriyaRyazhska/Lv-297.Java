package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.Scanner;

/**
 * Class for task 330.
 * finds the perfect numbers less than the current number
 *
 * @author Ivan Bernevek
 * @version 1.0 8 Feb 2018
 */
public class TestIvan330 extends AbstractTest {
    /**
     * Initializes a newly created {@link TestIvan330} object.
     * It represents a Task 330.
     */
    public TestIvan330() {
        super("TestIvan330");
    }

    @Override
    public void execute() {
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        if (var > 0) {
            for (int i = 1; i < var; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum = sum + j;
                    }
                }
                if (i == sum) {
                    System.out.println("the number " + i + " is perfect");
                }
            }
        } else {
            System.out.println("the number is not natural");
        }
        System.out.println("*******************************************");
    }
}
