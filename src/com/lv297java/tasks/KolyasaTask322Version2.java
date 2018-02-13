package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;

import static com.lv297java.inputreader.BufferReader.reader;

/**
 * This class realize method execute from AbstractTest.
 * <p>It responsible for processing users input and
 * calculating result for task 322.
 *
 * @author
 * @version 1.0   11.02.2018
 */
public class KolyasaTask322Version2 extends AbstractTask {
    /**
     * Initializes a newly created {@code AbstractTest} object so that it represents
     * certain math test.
     */
    public KolyasaTask322Version2() {
        super("322");
    }

    /**
     *
     * @param from lower limit of the interval (including)
     * @param to upper limit of the interval (not including)
     * @return an array of two values, the first of which expresses the number and the second number of divisors
     */
    private int[] findNumber(int from, int to) {
        int result = 0;
        int resultNumber = 1;

        for (int i = from; i < to; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum > result) {
                result = sum;
                resultNumber = i;
            }
        }
        return new int[]{resultNumber, result};
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
     * Processing users input and call service methods.
     * @throws IOException can throw {@link IOException}
     */
    private void service() throws IOException {
        try {
            System.out.println("The program finds a natural number "
                    + "with a maximum sum of dividers from a given interval of natural integers");
            System.out.println("Enter the lower limit of the interval: ");
            int  from = validator(reader.readLine());
            System.out.println("Enter the upper limit of the interval: ");
            int to = validator(reader.readLine());
            int[] resArray = findNumber(from, to);
            System.out.println("The number with a maximum "
                    + "sum of dividers: " + resArray[0]
                    + " The sum of dividers: " + resArray[1]);
        } catch (NumberFormatException e) {
            System.out.println("You input not a natural number");
            service();
        }

    }

    /**
     * Realized method from {@link AbstractTask}.
     * <p>Call service method {@link KolyasaTask322#service()}
     * to process users input and return result.
     */
    @Override
    public void execute() {
        try {
            service();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
