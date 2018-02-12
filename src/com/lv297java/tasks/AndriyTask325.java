package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
    public int inputNumber;

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
    private boolean isInputTheNumberAndNotEmpty(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    /**
     * This method reads the number that we want to divide.
     */
    private void readTheNumber() {

        String inputValue = null;

        try {

            System.out.println("Enter any Number to find all simple divisors");
            inputValue = reader.readLine();

            while (!isInputTheNumberAndNotEmpty(inputValue)) {
                System.out.println("Please, enter a digit value of N\nTry again");
                inputValue = reader.readLine();
            }

            inputNumber = Integer.parseInt(inputValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the list of all simple divisors of input number
     */
    private List getAllNumbersDivisors() {

        List<Integer> numbersDevisions = new LinkedList<>();

        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                numbersDevisions.add(i);
            }
        }
        return numbersDevisions;
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

        readTheNumber();

        System.out.printf("This is all simple divisors of the number %s : ", inputNumber);
        System.out.println(getAllNumbersDivisors());

        doMore();
    }

}
