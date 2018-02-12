package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class implement task 182:
 * <p>Current task is to find count and sum those members of the
 * sequence (1..n), divided into 5, but do not divided by 7.</p>
 *
 * @author Oksana Mekh
 * @version 1.0
 */
public class OksanaTask182 extends AbstractTask {
    /**
     * Number by the task condition.
     */
    public static final int FIVE = 5;

    /**
     * Number by the task condition.
     */
    public static final int SEVEN = 7;

    /**
     * Initializes a newly created {@link OksanaTask182} object.
     * Constructor without parameters exist for initialise field
     * {@link AbstractTask#testID} in parent {@code AbstractTest} Class
     * It represents a Task 182.
     */
    public OksanaTask182() {
        super("182");
    }

    /**
     * This method calculates count of that numbers in input list,
     * which meet the task condition.
     *
     * @param numbers input sequence of numbers
     * @return count of numbers, which meet the task condition
     */
    public static int findResultCount(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if ((number % FIVE == 0) && (number % SEVEN != 0)) {
                result++;
            }
        }
        return result;
    }

    /**
     * This method calculates sum of that numbers in input list,
     * which meet the task condition.
     *
     * @param numbers input sequence of numbers
     * @return sum of numbers, which meet the task condition
     */
    public static int findResultSum(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            if ((number % FIVE == 0) && (number % SEVEN != 0)) {
                result += number;
            }
        }
        return result;
    }

    /**
     * Reads count of numbers from console input.
     *
     * @return count of numbers in sequence
     */
    public static int readCountOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter count of the numbers: ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n < 1) {
                    System.out.println(
                            "Count of the numbers can not be less then 1.");
                } else {
                    return n;
                }
            } else {
                System.out.println("Input text is not a number.");
            }
        }
    }

    /**
     * Reads sequence of numbers from console input.
     *
     * @param count count of numbers in sequence
     * @return sequence of numbers as List
     * @throws IllegalArgumentException when {@code count < 1}
     */
    public static List<Integer> readNumbers(final int count) {
        if (count < 1) {
            throw new IllegalArgumentException(
                    "Count can not be less then 1.");
        }
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.print("Enter number " + i + ": ");
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                    break;
                } else {
                    System.out.println("Input is not a number.");
                }
            }
        }
        return numbers;
    }

    /**
     * {@inheritDoc}
     * <p>This method finds count and sum those members of the
     * sequence (1..n), divided into 5, but do not divided by 7.</p>
     * <p>It expects the input of the number of members
     * of the sequence and the same sequence of numbers</p>
     */
    @Override
    public void execute() {
        int n = readCountOfNumbers();
        List<Integer> numbers = readNumbers(n);

        System.out.println("Count: " + findResultCount(numbers));
        System.out.println("Sum: " + findResultSum(numbers));
        System.out.println("Task executed.");
    }
}
