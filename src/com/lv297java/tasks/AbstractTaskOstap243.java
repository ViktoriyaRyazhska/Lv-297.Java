package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.lv297java.inputreader.BufferReader.reader;

/**
 * This class contain common functional of tasks 243a and 243b.
 * When using, you should call {@link AbstractTaskOstap243#service(String, Point)}
 * submit the arguments and get results in the console.
 *
 * @author Kravtsiv Ostap
 * @version 1.0 10.02.2018
 */

abstract class AbstractTaskOstap243 extends AbstractTask {

    /**
     * Base constructor that set field {@link AbstractTask#testID} in parents class.
     * @param testID id of curent task
     */
    AbstractTaskOstap243(String testID) {
        super(testID);
    }

    /**
     * Main service method that handles users input.
     * @param description description of current task
     * @param point input point of 243 task (a or b)
     */
    void service(String description, Point point) {
        System.out.println(description);
        System.out.println("Type (exit task) to end attempt");
        while (true) {
            System.out.println("Input n:");
            try {
                String input = reader.readLine();
                if (input.equals("exit task")) {
                    break;
                }
                try {
                    List<Entry> list = resultList(findSquares(validation(input)), point);
                    if (list.size() == 0) {
                        System.out.println("");
                    } else {
                        for (Entry entry: list) {
                            System.out.println(entry.toString());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You input not a natural number! Try again.");
                }
            } catch (IOException e) {
                //NOP
            }
        }
    }

    /**
     * Checks the entered data for validity.
     * @param input string data for verification
     * @return int value of input
     * @throws NumberFormatException can throw {@link NumberFormatException}
     */
    private int validation(String input) throws NumberFormatException {
        int parsedInput = Integer.valueOf(input);
        if (parsedInput <= 0) {
            throw new NumberFormatException();
        }
        return parsedInput;
    }

    /**
     * If possible return all pairs of such numbers, where n = x^2 + y^2.
     * @param input accepts natural number.
     * @return set of entries of all possible combinations of the sum of squares of a given number
     */
    private List<Entry> findSquares(int input) {
        List<Entry> list = new ArrayList<>();
        for (int x = 1; x <= Math.floor(Math.sqrt(input)); x++) {
            for (int y = 1; y <= Math.floor(Math.sqrt(input)); y++) {
                if (input == (x * x + y * y)) {
                    list.add(new Entry(x, y));
                }
            }
        }
        return list;
    }

    /**
     * Method selects the data needed in this case.
     * @param list list accepts return of {@link AbstractTaskOstap243#findSquares(int)}
     *             format and print it into console.
     * @param point accepts to identify exact exercise
     * @return list of entries
     */
    private List<Entry> resultList(List<Entry> list, Point point) {
        List<Entry> result = new ArrayList<>();
        switch (point) {
            case A:
                result.add(list.get(0));
                break;
            case B:
                for (Entry entry : list) {
                    if (entry.x >= entry.y) {
                        result.add(entry);
                    }
                }
                break;
        }
        return result;
    }


    /** Class that displays a pair of resulting variables.*/
    protected class Entry {
        /** Variable X.*/
        private int x;
        /** Variable Y.*/
        private int y;

        /**
         * Base constructor.
         * @param x first variable
         * @param y second variable
         */
        Entry(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /**
         * Classic toString method.
         * @return string representation of the object
         */
        @Override
        public String toString() {
            return "Entry{x=" + x + ", y=" + y + '}';
        }
    }

    /**Set of constants to determine the task item.*/
    enum Point {
        /** Constant that represents task 243a.*/
        A,
        /** Constant that represents task 243b.*/
        B
    }

}
