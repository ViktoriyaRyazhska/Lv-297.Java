package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;
import java.util.Arrays;

import static com.lv297java.inputreader.BufferReader.reader;

/**
 * With this class you can calculate the sum from the last digits of the number.
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2017-06-02
 */

public class AndriyTask87 extends AbstractTask {

    /**
     * From the digits of this variable we calculate the sum.
     */
    public String inputNumber;

    /**
     * This variable determines how much we want to take the digits from the end of number to get the sum from them.
     */
    public String numberOfLastDigits;

    /**
     * Initializes a newly created {@code AndriyTask87} object.
     * It represents an Task 87.
     */
    public AndriyTask87() {
        super("87");
    }

    /**
     * This method checks whether the entered number and whether input is not empty.
     *
     * @param value it's the input we wont to check
     * @return tru or false depending on check results
     */
    private boolean isInputTheNumberAndNotEmpty(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    /**
     * This method checks whether the numberOfLastDigits is no more than the length of the inputNumber.
     *
     * @return tru or false depending on check results
     */
    private boolean isNumberOfLastDigitsCorrect() {
        return Integer.parseInt(numberOfLastDigits) <= inputNumber.length();
    }

    /**
     * This method reads a inputNumber and numberOfLastDigits.
     */
    private void readData() {

        try {
            System.out.println("Please, enter some number");
            inputNumber = reader.readLine();

            while (!isInputTheNumberAndNotEmpty(inputNumber)) {
                System.out.println("Value invalid. Try again");
                inputNumber = reader.readLine();     // if input is non-digital or empty try again
            }

            System.out.println("How many digits from the end of number you want to calculate the sum\n Enter the number");
            numberOfLastDigits = reader.readLine();

            while (!isInputTheNumberAndNotEmpty(numberOfLastDigits)) {
                System.out.println("Please, enter a digit value\n Try again");
                numberOfLastDigits = reader.readLine();   // if input is non-digital or empty try again
            }

            while (!isNumberOfLastDigitsCorrect()) {
                System.out.println("Invalid value\nTry again");
                numberOfLastDigits = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the sum from the last digits of the number.
     */
    public int getTheSumOfLastElements() {

        // it's the array where we put each digits from inputNumber to calculate the sum.
        String[] numbersArray = inputNumber.split("");

        // converting all characters from String array to Integer array and calculate the sum from the digits of the last arrays cell
        return Arrays.stream(numbersArray).mapToInt(Integer::parseInt).skip(numbersArray.length - Integer.parseInt(numberOfLastDigits)).sum();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        readData();
        System.out.println(getTheSumOfLastElements());
    }


}
