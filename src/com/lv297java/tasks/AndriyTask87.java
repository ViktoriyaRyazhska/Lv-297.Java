package com.lv297java.tasks;

import com.lv297java.AbstractTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * With this class you can calculate the sum from the last digits of the number.
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2017-06-02
 */

public class AndriyTask87 extends AbstractTest {

    /**
     * from the digits of this variable we calculate the sum
     */
    private String inputNumber;

    /**
     * this variable determines how much we want to take the digits from the end of number to get the sum from them
     */
    private String numberOfLastDigits;

    /**
     * Initializes a newly created {@code AndriyTask87} object.
     * It represents an Task 87.
     */
    public AndriyTask87() {
        super("87");
    }

    private String getNumberOfLastDigits() {
        return numberOfLastDigits;
    }

    /**
     * this method checks whether the entered number and whether input is not empty
     */
    private boolean isInputCorrect(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    /**
     * this method checks whether the numberOfLastDigits is no more than the length of the inputNumber
     */
    private boolean isValueCorrect(String value) {
        return Integer.parseInt(getNumberOfLastDigits()) <= inputNumber.length();
    }

    /**
     * this method reads a inputNumber and numberOfLastDigits
     */
    private void readData() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Please, enter some number");
            inputNumber = br.readLine();

            while (!isInputCorrect(inputNumber)) {
                System.out.println("Value invalid. Try again");
                inputNumber = br.readLine();     // if input is non-digital or empty try again
            }

            System.out.println("How many digits from the end of number you want to calculate the sum\n Enter the number");
            numberOfLastDigits = br.readLine();

            while (!isInputCorrect(numberOfLastDigits)) {
                System.out.println("Please, enter a digit value\n Try again");
                numberOfLastDigits = br.readLine();   // if input is non-digital or empty try again
            }

            while (!isValueCorrect(numberOfLastDigits)) {
                System.out.println("Invalid value\nTry again");
                numberOfLastDigits = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method return the sum from the last digits of the number ,
     *
     * @param numbersArray[] it's the array where we put each digits from inputNumber to calculate the sum
     */
    private int getTheSumOfLastElements() {

        String numbersArray[] = inputNumber.split("");

        // converting all characters from String array to Integer array and calculate the sum from the digits of the last arrays cell
        return Arrays.stream(numbersArray).mapToInt(Integer::parseInt).skip(numbersArray.length - Integer.parseInt(getNumberOfLastDigits())).sum();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(BufferedReader reader) {
        readData();
        System.out.println(getTheSumOfLastElements());
    }


}