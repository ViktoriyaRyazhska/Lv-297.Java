package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class implement task 182.
 * @version 1.0
 * @author Oksana Mekh
 */
public class TaskOksana182 extends AbstractTask {

    /**
     * Initializes a newly created {@link TaskOksana182} object.
     * It represents a Task 182.
     */
    public TaskOksana182() {
        super("182");
    }

    /**
     * {@inheritDoc}
     * <p>Current task is to find count and sum those members of the
     * sequence (1..n), divided into 5, but do not divided by 7.</p>
     * <p>It expects the input of the number of members
     * of the sequence and the same sequence of numbers</p>
     */
    @Override
    public void execute() {
        int n = readCountOfNumbers();
        List<Integer> numbers = readNumbers(n);

        int resultCount = 0;
        int resultSum = 0;

        final int five = 5;
        final int seven = 7;
        for (Integer number : numbers) {
            if ((number % five == 0) && (number % seven != 0)) {
                resultCount++;
                resultSum += number;
            }
        }
        System.out.println("Count: " + resultCount);
        System.out.println("Sum: " + resultSum);
        System.out.println("Task executed.");
    }

    /**
     * Read count of numbers from console input.
     * @return count of numbers in sequence
     */
    private static int readCountOfNumbers() {
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
     * Read sequence of numbers from console input.
     * @param count count of numbers in sequence
     * @return sequence of numbers as List
     */
    private static List<Integer> readNumbers(final int count) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.print("Enter number 1: ");
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
}
