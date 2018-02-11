package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;

import static com.lv297java.inputreader.BufferReader.reader;

/**
 * With this class you can print all the simple divisors of the number.
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2017-06-02
 */

public class AndriyTask325 extends AbstractTask {

    /**
     * This is the number we want to divide.
     */
    private int number;

    /**
     * Initializes a newly created {@code AndriyTask325} object.
     * It represents an Task 325.
     */
    public AndriyTask325() {
        super("325");
    }

    /**
     * Checks whether the entered number and whether input is not empty.
     *
     * @param value it's the input we wont to check
     * @return tru or false depending on check results
     */
    private boolean isInputCorrect(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    /**
     * This method reads the number that we want to divide.
     */
    private void readNumber() {

        String inputValue = null;

        try {

            System.out.println("Enter any Number to find all simple divisors");
            inputValue = reader.readLine();

            while (!isInputCorrect(inputValue)) {
                System.out.println("Please, enter a digit value of N\nTry again");
                inputValue = reader.readLine();
            }

            number = Integer.parseInt(inputValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method print all numbers divisors.
     */
    private void printAllNumbersDivisors() {

        System.out.printf("This is all simple divisors of the number %s : ", number);

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("\n %d", i);
            }
        }
    }

    /**
     * This method asks user to do operation again or break.
     */
    private void doMore() {

        System.out.println("\nDo you want to do operation again? y/n");
        String userChoice = null;

        try {

            userChoice = reader.readLine();

            switch (userChoice) {
                case "y":
                    execute();
                    break;
                case "n":
                    break;
                default:
                    doMore();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        readNumber();
        printAllNumbersDivisors();
        doMore();
    }

}
