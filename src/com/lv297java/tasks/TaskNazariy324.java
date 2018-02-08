package com.lv297java.tasks;

import java.util.*;

public class TaskNazariy324 extends AbstractTest {

    public TaskNazariy324() {
        super("324");
    }

    @Override
    public void execute() {
        Integer p = readNumberFromInput("p");
        if(p == null) return;
        Integer q = readNumberFromInput("q");
        if(q == null) return;


        List<Integer> divisors = filteredDivisors(p, q);
        System.out.println("Divisors: " + divisors);
    }

    private static List<Integer> filteredDivisors(int p, int q) {
        List<Integer> divisors = new ArrayList<>();
        int sqrtQ = (int) Math.sqrt(q) + 1;
        for (int i = 1; i < sqrtQ; i++) {
            if(q % i == 0) {
                if(greatestCommonDivisor(i, p) == 1) {
                    divisors.add(i);
                }
                if (i*i != q) {
                    int additionalDivisor = q / i;
                    if(greatestCommonDivisor(additionalDivisor, p) == 1) {
                        divisors.add(additionalDivisor);
                    }
                }
            }
        }
        return divisors;
    }

    private static int greatestCommonDivisor(int x, int y) {
        if (y != 0) {
            return greatestCommonDivisor(y, x % y);
        } else {
            return x;
        }
    }

    private static Integer readNumberFromInput(String name) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter " + name + ": ");
            if (!scanner.hasNextInt()) {
                if (scanner.hasNext("(?i)\\s*exit\\s*")) {
                    return null;
                } else {
                    System.out.println("Incorrect number. Try again or input 'exit' to exit.");
                    scanner.next();
                    continue;
                }
            }
            return scanner.nextInt();
        }
    }
}
