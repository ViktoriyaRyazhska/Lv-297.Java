package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class implement task 107.
 *
 * @author Nazariy Demyanovskyi
 * @version 1.0
 */
public class TaskNazariy181 extends AbstractTest {

    /**
     * This count defined in task.
     */
    public static final int COUNT_OF_NUMBERS = 50;

    /**
     * Minimum value that be randomly created if user choose randomized initializing input.
     */
    public static final int MIN_RANDOM_VALUE = -5000;

    /**
     * Maximum value that be randomly created if user choose randomized initializing input.
     */
    public static final int MAX_RANDOM_VALUE = 5000;

    /**
     * Initializes a newly created {@code TaskNazariy181} object. It represents an Task 181.
     */
    public TaskNazariy181() {
        super("181");
    }

    /**
     * Reads 50 integer values from standart input or generate randomly them.
     *
     * @return integer values from standart input
     * @see TaskNazariy181#COUNT_OF_NUMBERS
     */
    private static List<Integer> readDataFromInputOrGenerate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Generate [g] or input manually [m] or exit [any other key]: ");
        String inputType = scanner.next().trim().toLowerCase();
        switch (inputType) {
            case "g": {
                List<Integer> numbers = new ArrayList<>(COUNT_OF_NUMBERS);
                Random random = new Random();
                for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
                    int number = random.nextInt((MAX_RANDOM_VALUE - MIN_RANDOM_VALUE)) + MIN_RANDOM_VALUE;
                    numbers.add(number);
                    System.out.println("Number " + i + ": " + number);
                }
                System.out.println();
                return numbers;
            }
            case "m": {
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
            }
            default:
                return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        List<Integer> numbers = readDataFromInputOrGenerate();
        System.out.println("The sum that are multiples of 5: " + findSumMultiplesOfFive(numbers));
        System.out.println("The sum that are odd and negative: " + findSumOddAndNegative(numbers));
        System.out.println("The sum that are satisfy the condition |a| < i^2: " + findSumSatisfyCondition(numbers));
    }

    /**
     * Finds the sum of the numbers that are multiples of 5.
     *
     * @param numbers list of any integer numbers. Value can not be a <code>null</code>.
     * @return sum of the numbers that are multiples of 5.
     * @throws NullPointerException when <code>numbers</code> is <code>null</code>.
     */
    public long findSumMultiplesOfFive(final List<Integer> numbers) {
        final int five = 5;
        return numbers.stream()
                .filter(n -> n % five == 0)
                .mapToLong(Integer::longValue)
                .sum();
    }

    /**
     * Finds the sum of the numbers that are odd or negative.
     *
     * @param numbers list of any integer numbers. Value can not be a <code>null</code>.
     * @return sum of the numbers that are multiples of 5.
     * @throws NullPointerException when <code>numbers</code> is <code>null</code>.
     */
    public long findSumOddAndNegative(final List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0 && n < 0)
                .mapToLong(Integer::longValue)
                .sum();
    }

    /**
     * Finds the sum of the numbers which the right condition <code>abs(n) < pow(i, 2)</code> is true, where
     * <code>n</code> - even number in list and <code>i</code> - index of <code>n</code>.
     *
     * @param numbers list of any integer numbers. Value can not be a <code>null</code>.
     * @return sum of the numbers that are multiples of 5.
     * @throws NullPointerException when <code>numbers</code> is <code>null</code>.
     */
    public long findSumSatisfyCondition(final List<Integer> numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (Math.abs(number) < Math.pow(i, 2)) {
                sum += number;
            }
        }
        return sum;
    }
}
