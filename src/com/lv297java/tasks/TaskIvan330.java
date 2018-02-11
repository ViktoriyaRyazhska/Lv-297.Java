package com.lv297java.tasks;

import com.lv297java.AbstractTest;
import com.lv297java.inputreader.BufferReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for task 330.
 * finds the perfect numbers less than the current number
 *
 * @author Ivan Bernevek
 * @version 1.0 8 Feb 2018
 */
public class TaskIvan330 extends AbstractTest {

    /**
     * Entered number.
     */
    private int beginnerNumber = 0;

    /**
     * Initializes a newly created {@link TaskIvan330} object.
     * It represents a Task 330.
     */
    public TaskIvan330() {
        super("TaskIvan330");
    }

    @Override
    public void execute() {
        List result;
        System.out.println("Enter your number");
        try {
            String enteredLine = BufferReader.reader.readLine();
            try {
                beginnerNumber = Integer.parseInt(enteredLine);
                if (isNatural(beginnerNumber)) {
                    result = findPerfectNumbers(beginnerNumber);
                    printResult(result);
                } else {
                    System.out.println("The number is not natural");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered line is not number");
            }
        } catch (IOException ee) {
            System.out.println("Input error");
        }
    }


    /**
     * Is the entered number natural?
     *
     * @param number entered number.
     * @return true or false.
     */
    private boolean isNatural(int number) {
        return number > 0;
    }

    /**
     * Method finds the perfect numbers.
     *
     * @param number entered natural number.
     * @return number digits in number.
     */
    private List findPerfectNumbers(int number) {
        List<Integer> perfectNumbers = new ArrayList<>();


        for (int i = 1; i < number; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (i == sum) {
                perfectNumbers.add(i);
            }
        }


        return perfectNumbers;
    }

    /**
     * Method prints result message.
     *
     * @param result all perfect numbers less ****.
     */
    private void printResult(List result) {
        System.out.println("*******************************************");
        for (Object o : result) {
            System.out.println("the number " + (Integer) o + " is perfect");
        }
        System.out.println("*******************************************");
    }
}
