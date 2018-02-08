package oksanamekh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestOksana182 extends AbstractTest {

    public TestOksana182() {
        super("182");
    }

    @Override
    public void execute() {
        int n = readCountOfNumbers();
        List<Integer> numbers = readNumbers(n);

        int resultCount = 0;
        int resultSum = 0;

        for (Integer number : numbers) {
            if ((number % 5 == 0) && (number % 7 != 0)) {
                resultCount++;
                resultSum += number;
            }
        }
        System.out.println("Count: " + resultCount);
        System.out.println("Sum: " + resultSum);
        System.out.println("Task executed.");
    }

    private static int readCountOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter count of the numbers: ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n < 1) {
                    System.out.println("Count of the numbers can not be less then 1.");
                } else {
                    return n;
                }
            } else {
                System.out.println("Input text is not a number.");
            }
        }
    }

    private static List<Integer> readNumbers(int count) {
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