package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * This class implement task 107.
 *
 * @author Nazariy Demyanovskyi
 * @version 1.0
 */
public class TaskNazariy107 extends AbstractTest {

    /**
     * This number defined in task.
     */
    public static final int FOUR = 4;

    /**
     * Initializes a newly created {@code TaskNazariy107} object.
     * It represents an Task 107.
     */
    public TaskNazariy107() {
        super("N-107");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        Integer m = readMFromInput();
        if (m == null) {
            return;
        }

        for (int k = 1; ; k++) {
            if (Math.pow(FOUR, k) >= m) {
                System.out.println("k = " + (k - 1));
                break;
            }
        }
    }

    /**
     * Reads one integer value from standart input.
     *
     * @return integer value from standart input
     */
    private static Integer readMFromInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter m: ");
            if (!scanner.hasNextInt()) {
                if (scanner.hasNext("(?i)\\s*exit\\s*")) {
                    return null;
                } else {
                    System.out.println("Line is not a number. Try again or input 'exit' to exit.");
                    scanner.next();
                    continue;
                }
            }
            int m = scanner.nextInt();
            if (m <= 1) {
                System.out.println("Number must be greater then 1. Try again or input 'exit' to exit.");
                continue;
            }
            return m;
        }
    }
}
