package com.lv297java.hometask1.tasks;

import java.util.Scanner;

public class TaskNazariy107 extends AbstractTest {

    public TaskNazariy107() {
        super("N-107");
    }

    @Override
    public void execute() {
        Integer m = readMFromInput();
        if(m == null) return;

        for(int k = 1; ; k++) {
            if (Math.pow(4, k) >= m) {
                System.out.println("k = " + (k - 1));
                break;
            }
        }
    }

    private static Integer readMFromInput() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter m: ");
            if (!scanner.hasNextInt()) {
                if (scanner.hasNext("(?i)\\s*exit\\s*")) {
                    return null;
                } else {
                    System.out.println("Line is not a number. Try again or input 'exit' to exit.");
                    scanner.next();
                    continue;
                }
            }
            int m = scanner.nextInt();
            if(m <= 1) {
                System.out.println("Number must be greater then 1. Try again or input 'exit' to exit.");
                continue;
            }
            return m;
        }
    }
}
