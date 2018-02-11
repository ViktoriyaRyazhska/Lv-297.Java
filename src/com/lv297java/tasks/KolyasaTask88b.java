package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.IOException;

import static com.lv297java.inputreader.BufferReader.reader;


/**
 * This class realize method execute from AbstractTest.
 * <p>It responsible for processing users input and
 * calculating result for task 88b.
 *
 * @author
 * @version 1.0   11.02.2018
 */
public class KolyasaTask88b extends AbstractTest {
    /**
     * Initializes a newly created {@code AbstractTest} object so that it represents
     * certain math test.
     */
    KolyasaTask88b() {
        super("88b");
    }

    /**
     * Processing users input and call service methods.
     * @throws IOException can throw {@link IOException}
     */
    private void  printLineReverse() throws IOException {
        try {
            System.out.println("Enter any number, program find reverse this number:");
            String result = reverser(validator(reader.readLine()));
            System.out.println("Reversed number: ");
            System.out.print(result);

        } catch (NumberFormatException e) {
            System.out.println("You input not a natural number");
            printLineReverse();
        }
    }

    /**
     * Reverse entered number.
     * @param input number for reverse
     * @return reversed number
     */
    private String reverser(int input) {
        return new StringBuilder().append(input).reverse().toString();
    }

    /**
     * Checks the entered data for validity.
     * @param input string data for verification
     * @return int value of input
     * @throws NumberFormatException can throw {@link NumberFormatException}
     */
    private int validator(String input) throws NumberFormatException {
        int parsedInput = Integer.valueOf(input);
        if (parsedInput <= 0) {
            throw new NumberFormatException();
        }
        return parsedInput;
    }

    /**
     * Realized method from {@link AbstractTest}.
     * <p>Call service method {@link KolyasaTask88b#printLineReverse()}
     * to process users input and return result.
     */
    @Override
    public void execute() {
        try {
            printLineReverse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
