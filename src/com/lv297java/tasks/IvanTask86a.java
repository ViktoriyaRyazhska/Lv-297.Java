package com.lv297java.tasks;

import com.lv297java.AbstractTask;
import com.lv297java.inputreader.BufferReader;

import java.io.IOException;


/**
 * Class for task 86a.
 * determines the beginnerNumber of digits in the beginnerNumber
 *
 * @author Ivan Bernevek
 * @version 1.0 8 Feb 2018
 */
public class IvanTask86a extends AbstractTask {

    /**
     * Entered number.
     */
    private int beginnerNumber = 0;

    /**
     * Initializes a newly created {@link IvanTask86a} object.
     * It represents a Task 86a.
     */
    public IvanTask86a() {
        super("IvanTask86a");
    }


    /**
     * {@inheritDoc}
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
                    numberDigits = countDigitsCounter(beginnerNumber);
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
     * Method counts the number of digits.
     * @param number entered natural number.
     * @return number digits in number.
     */
    public int countDigitsCounter(int number) {
        final int step = 10;
        int numberDigits = 0;
        while (number > 0) {
            numberDigits++;
            number /= step;
        }
        return numberDigits;
    }

    /**
     * Method prints result message.
     * @param result count digits in number.
     */
    private void printResult(final int result) {
        System.out.println("*******************************************");
        System.out.println("in the number " + beginnerNumber + " are " + result + " digits");
        System.out.println("*******************************************");
    }
}
