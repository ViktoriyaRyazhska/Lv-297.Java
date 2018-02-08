package com.lv297java.tasks;

import java.util.*;

public class TaskNazariy181 extends AbstractTest {

    public TaskNazariy181() {
        super("181");
    }

    @Override
    public void execute() {
        List<Integer> numbers = readDataFromInput();
        executeSubTaskA(numbers);
        executeSubTaskB(numbers);
        executeSubTaskC(numbers);
    }

    private static void executeSubTaskA(List<Integer> numbers) {
        long sum = numbers.stream()
                .filter(n -> n % 5 == 0)
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("The sum of all the numbers that are multiples of 5: " + sum);
    }

    private static void executeSubTaskB(List<Integer> numbers) {
        long sum = numbers.stream()
                .filter(n -> n % 2 != 0 && n < 0)
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("The sum of all the numbers that are odd and negative: " + sum);
    }

    private static void executeSubTaskC(List<Integer> numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if(Math.abs(number) < Math.pow(i, 2)) {
                sum += number;
            }
        }
        System.out.println("The sum of all the numbers that are satisfy the condition |a| < i^2: " + sum);
    }

    private static List<Integer> readDataFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Generate [g] or input manually [m] or exit [any other key]: ");
        String inputType = scanner.next().trim().toLowerCase();
        if(inputType.equals("g")) {
            List<Integer> numbers = new ArrayList<>(50);
            Random random = new Random();
            for(int i = 0; i < 50; i++) {
                int number = random.nextInt(10000) - 5000;
                numbers.add(number);
                System.out.println("Number " + i + ": " + number);
            }
            System.out.println();
            return numbers;
        } else if(inputType.equals("m")) {
            List<Integer> numbers = new ArrayList<>(50);
            for(int i = 0; i < 50; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                if(!scanner.hasNextInt()) {
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
