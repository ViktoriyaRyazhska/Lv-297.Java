package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.IOException;

import static com.lv297java.inputreader.BufferReader.reader;

/**
 * This class realize method execute from AbstractTest.
 * <p>It responsible for processing users input and
 * calculating result for task 107.
 *
 * @author Kravtsiv Ostap
 * @version 1.0.4   10.02.2018
 */

public class TaskOstap107 extends AbstractTest {
    /** Constructor without parameters used to initializing of field {@link AbstractTest#testID}.*/
    public TaskOstap107() {
        super("107");
    }

    /**
     * Realized method from {@link AbstractTest}.
     *
     * <p>Process users input and call service methods to count result.
     * Uses {@link TaskOstap107#findMaxK(int)} to count result.
     */
    @Override
    public void execute() {
        System.out.println("Given an integer m > 1. Get the most out of the whole k, at which 4^k < m.");
        System.out.println("Type (exit task) to end attempt");
        while (true) {
            System.out.println("Input m: ");
            try {
                String input = reader.readLine();
                if (input.equals("exit task")) {
                    break;
                }
                try {
                    System.out.println("Max k = " + findMaxK(validation(input)));
                } catch (NumberFormatException e) {
                    System.out.println("You input not a natural number! Try again.");
                }
            } catch (IOException e) {
                //NOP
            }
        }
    }

    /**
     * Checks the entered data for validity.
     * @param input string data for verification
     * @return int value of input
     * @throws NumberFormatException can throw {@link NumberFormatException}
     */
    private int validation(String input) throws NumberFormatException {
        int parsedInput = Integer.valueOf(input);
        if (parsedInput <= 1) {
            throw new NumberFormatException();
        }
        return parsedInput;
    }


    /**
     * Count the most out of the whole k, at which 4^k < m.
     *
     * @param input must be a natural number.
     * @return int value of k
     */
    private int findMaxK(int input) {
        final double coef = 0.5;
        return (int) (coef * (Math.log10(input) / Math.log10(2)));
    }
}
