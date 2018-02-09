package com.lv297java.tasks;

import com.lv297java.AbstractTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * With this class you can print all the simple divisors of the number
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2017-06-02
 */

public class AndriyTask325 extends AbstractTest {

    /**
     * this is the number we want to divide
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
     * checks whether the entered number and whether input is not empty
     */
    private boolean isInputCorrect(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    /**
     * this method reads the number that we want to divide
     */
    private void readNumber() {

        String inputValue = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter any Number to find all simple divisors");
            inputValue = br.readLine();

            while (!isInputCorrect(inputValue)) {
                System.out.println("Please, enter a digit value of N\nTry again");
                inputValue = br.readLine();
            }

            number = Integer.parseInt(inputValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method print all numbers divisors
     */
    private void printAllNumbersDivisors() {

        System.out.printf("This is all simple divisors of the number %s : ", number);

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print("\n" + i);
                number = number / i;
            }
        }

        if (number < 1) {
            System.out.println(number);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(BufferedReader reader) {
        readNumber();
        printAllNumbersDivisors();
    }

}