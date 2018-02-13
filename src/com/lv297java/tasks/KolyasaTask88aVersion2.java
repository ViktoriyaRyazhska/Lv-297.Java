package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;

import static com.lv297java.inputreader.BufferReader.reader;

/**
 * This class realize method execute from AbstractTest.
 * <p>It responsible for processing users input and
 * calculating result for task 88a.
 *
 * @author
 * @version 1.0   11.02.2018
 */
public class KolyasaTask88aVersion2 extends AbstractTask {
    /**
     * Initializes a newly created {@code AbstractTest} object so that it represents
     * certain math test.
     */
    public KolyasaTask88aVersion2() {
        super("88a");
    }

    /**
     * Processing users input and call service methods.
     * @throws IOException can throw {@link IOException}
     */
    private void read() throws IOException {
        try {
            int square;
            System.out.println("Enter the number m, the program will put it in the square m^2");
            square = (int) Math.pow(validator(reader.readLine()), 2);
            System.out.println("Enter the number n, the program determines whether "
                    + "the number is included in the square of the previous number m^2:");
            String n = reader.readLine();
            System.out.println(doesInclude(validator(n), square)
                    ? "Yes " + square + " contain " + n
                    : "No " + square + " doesn`t contain " + n);
        } catch (NumberFormatException e) {
            System.out.println("You input not a natural number");
            read();
        }

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
     * The method that determines does m^2 contain n.
     * @param input the number of matches we are looking for
     * @param checkNumber number that may contain input
     * @return result of the check
     */
    private boolean doesInclude(int input, int checkNumber) {
        return String.valueOf(checkNumber).contains(String.valueOf(input));
    }

    /**
     * Realized method from {@link AbstractTask}.
     * <p>Call service method {@link KolyasaTask88a#read()}
     * to process users input and return result.
     */
    @Override
    public void execute() {
        try {
            read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
