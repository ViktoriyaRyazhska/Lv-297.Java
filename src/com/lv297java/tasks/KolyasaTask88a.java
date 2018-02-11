package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.Scanner;

public class KolyasaTask88a extends AbstractTask {

    private String m;
    private String n;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Initializes a newly created {@code AbstractTask} object so that it represents
     * certain math test.
     *
     * @param unique ID of test
     */
    public KolyasaTask88a() {
        super("88a");
    }


    public void read() {
        System.out.println("Enter the number m, the program will put it in the square m^2");
        //System.out.println("Enter the number m, this program find:");
        m = scanner.nextLine();
        System.out.println("Enter the number n, the program determines whether the number is included in the square of the previous number m^2:");
        n = scanner.nextLine();
    }

    private boolean isNinTheM() {
        int readNumber = Integer.parseInt(m);  // convr input String to Integer
        int rez = readNumber*readNumber;
        String stringFromRez = String.valueOf(rez);
        return stringFromRez.contains(n);
    }

    @Override
    public void execute() {
        read();
        System.out.println(isNinTheM());
    }
}
