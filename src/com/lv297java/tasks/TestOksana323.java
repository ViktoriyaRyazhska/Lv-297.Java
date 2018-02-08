package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestOksana323 extends AbstractTest {

    public TestOksana323() {
        super("323");
    }

    @Override
    public void execute() {
        int n = readNumber();
        List<Integer> resultNumbers = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (greatestCommonDivisor(i, n) == 1) {
                resultNumbers.add(i);
            }
        }

        System.out.println("Result: " + resultNumbers);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n < 1) {
                    System.out.println("Number can not be less then 1.");
                } else {
                    return n;
                }
            } else {
                System.out.println("Input text is not a number.");
            }
        }
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        int remainder = a % b;
        return greatestCommonDivisor(b, remainder);
    }
}
