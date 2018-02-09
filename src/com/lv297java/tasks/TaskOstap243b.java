package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This class realize method execute from AbstractTest.
 * <p>
 * <p> It responsible for processing users input and
 * calculating result for task 243b.
 *
 * @author Kravtsiv Ostap
 * @version 1.0.3   09.02.2018
 */

public class TaskOstap243b extends AbstractTest {

    /**
     * Constructor without parameters used to initializing of field {@link AbstractTest#testID}
     */
    public TaskOstap243b() {
        super("243b");
    }

    @Override
    public void execute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Given a natural number n. Can it be represented in the form of the sum of two squares of positive integers. If you can specify a pair of such numbers, where n = x^2 + y^2. Show all possible pairs");

        System.out.println("Type (exit task) to end attempt");
        while (true) {
            System.out.println("Input n:");
            try {
                String input = reader.readLine();
                if (input.equals("exit task")) {
                    break;
                }
                try {
                    int parsedInput = Integer.valueOf(input);
                    if (parsedInput <= 0) {
                        throw new NumberFormatException();
                    }
                    printResults(findSquares(parsedInput));
                } catch (NumberFormatException e) {
                    System.out.println("You input not a natural number! Try again.");
                }
            } catch (IOException e) {
                //NOT
            }
        }
    }

    /**
     * @param input accepts natural number.
     * @return possible combinations of the sum of squares of a given number
     */
    private List<Integer[]> findSquares(int input) {
        List<Integer[]> list = new ArrayList<>();
        input = Math.abs(input);
        for (int x = 1; x <= Math.floor(Math.sqrt(input)); x++) {
            for (int y = 1; y <= Math.floor(Math.sqrt(input)); y++) {
                if (input == (x * x + y * y)) {
                    list.add(new Integer[]{x, y});
                }
            }
        }
        return list;
    }

    /**
     * @param list accepts return of {@link TaskOstap243b#findSquares(int)} format and print it into console
     */
    private void printResults(List<Integer[]> list) {
        if (list.size() == 0) {
            System.out.println("There are no such pairs of numbers");
        } else {
            for (Integer[] result : list) {
                System.out.println("x = " + result[0] + " y = " + result[1]);
            }
        }
    }

}
