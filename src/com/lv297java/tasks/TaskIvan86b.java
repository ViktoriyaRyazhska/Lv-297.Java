package com.lv297java.tasks;

import com.lv297java.AbstractTest;
import com.lv297java.inputreader.BufferReader;

import java.io.IOException;

/**
 * Class for task 86b.
 * determines the sum of digits in the number
 *
 * @author Ivan Bernevek
 * @version 1.0 8 Feb 2018
 */
public class TaskIvan86b extends AbstractTest {

    /**
     * Entered number.
     */
    private int beginnerNumber = 0;

    /**
     * Initializes a newly created {@link TaskIvan86b} object.
     * It represents a Task 86b.
     */
    public TaskIvan86b() {
        super("TaskIvan86b");
    }



    /**
     * {@inheritDoc}
     *
     * @throws IOException
     */
    @Override
    public void execute() {
        int numberDigits = 0;
        System.out.println("Enter your number");
        try {
            String enteredLine = BufferReader.reader.readLine();
            try {
                beginnerNumber = Integer.parseInt(enteredLine);
                if (isNatural(beginnerNumber)) {
                    numberDigits = addDigitsInNumber(beginnerNumber);
                    printResult(numberDigits);
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
     * Method calculate the sum of digits.
     * @param number entered natural number.
     * @return number digits in number.
     */
    public int addDigitsInNumber(int number) {
        final int step = 10;
        int sumDigits = 0;
        while (number > 0) {
            sumDigits += number % step;
            number /= step;
        }
        return sumDigits;
    }
    /**
     * Method prints result message.
     * @param result sum digits in number.
     */
    private void printResult(int result) {
        System.out.println("*******************************************");
        System.out.println("the sum of digits number's " + beginnerNumber + " are " + result);
        System.out.println("*******************************************");
    }
}
