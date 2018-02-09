package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class implement task 107.
 * @version 1.0
 * @author Nazariy Demyanovskyi
 */
public class TaskNazariy181 extends AbstractTest {

    /**
     * This count defined in task.
     */
    public static final int COUNT_OF_NUMBERS = 50;

    /**
     * This count defined in task.
     */
    public static final int DIVISOR_FOR_SUBTASK_A = 5;

    /**
     * Minimum value that be randomly created
     * if user choose randomized initializing input.
     */
    public static final int MIN_RANDOM_VALUE = -5000;

    /**
     * Maximum value that be randomly created
     * if user choose randomized initializing input.
     */
    public static final int MAX_RANDOM_VALUE = 5000;

    /**
     * Initializes a newly created {@code TaskNazariy181} object.
     * It represents an Task 181.
     */
    public TaskNazariy181() {
        super("181");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        List<Integer> numbers = readDataFromInput();
        executeSubTaskA(numbers);
        executeSubTaskB(numbers);
        executeSubTaskC(numbers);
    }

    /**
     * This method executes subtask A from current test.
     * It outputs the result to a standard output.
     * @param numbers list of integers
     */
    private static void executeSubTaskA(final List<Integer> numbers) {
        long sum = numbers.stream()
                .filter(n -> n % DIVISOR_FOR_SUBTASK_A == 0)
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("The sum of all the numbers that are multiples of 5: " + sum);
    }
    /**
     * This method executes subtask B from current test.
     * It outputs the result to a standard output.
     * @param numbers list of integers
     */
    private static void executeSubTaskB(final List<Integer> numbers) {
        long sum = numbers.stream()
                .filter(n -> n % 2 != 0 && n < 0)
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("The sum of all the numbers that are odd and negative: " + sum);
    }

    /**
     * This method executes subtask C from current test.
     * It outputs the result to a standard output.
     * @param numbers list of integers
     */
    private static void executeSubTaskC(final List<Integer> numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (Math.abs(number) < Math.pow(i, 2)) {
                sum += number;
            }
        }
        System.out.println("The sum of all the numbers that are satisfy the condition |a| < i^2: " + sum);
    }

    /**
     * Reads {@link TaskNazariy181#COUNT_OF_NUMBERS} integer values from standart input.
     * @return integer values from standart input
     */
    private static List<Integer> readDataFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Generate [g] or input manually [m] or exit [any other key]: ");
        String inputType = scanner.next().trim().toLowerCase();
        if (inputType.equals("g")) {
            List<Integer> numbers = new ArrayList<>(COUNT_OF_NUMBERS);
            Random random = new Random();
            for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
                int number = random.nextInt((MAX_RANDOM_VALUE - MIN_RANDOM_VALUE)) + MIN_RANDOM_VALUE;
                numbers.add(number);
                System.out.println("Number " + i + ": " + number);
            }
            System.out.println();
            return numbers;
        } else if (inputType.equals("m")) {
            List<Integer> numbers = new ArrayList<>(COUNT_OF_NUMBERS);
            for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                if (!scanner.hasNextInt()) {
                    if (scanner.hasNext("(?i)\\s*exit\\s*")) {
                        return numbers;
                    } else {
                        System.out.println("Incorrect number. Try again or input 'exit' to exit.");
                        scanner.next();
                        i--;
                        continue;
                    }
                }
                numbers.add(scanner.nextInt());
            }
            System.out.println();
            return numbers;
        } else {
            return Collections.emptyList();
        }
    }
}
