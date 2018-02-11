package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.util.Scanner;

public class KolyasaTask88b extends AbstractTest {
    /**
     * Initializes a newly created {@code AbstractTest} object so that it represents
     * certain math test.
     *
     * @param testID unique ID of test
     */
    public KolyasaTask88b() {
        super("88b" );
    }
    private void  printLineReverse() {
        // Call the class scanner
        System.out.println("Enter any number,"
                + "program find reverse this number:");
        Scanner num = new Scanner(System.in);
        //  System.out.println(num.nextLine());
        StringBuffer buffer = new StringBuffer(num.nextLine());
        buffer.reverse();
        System.out.println("Revers your number: ");
        System.out.println(buffer);
    }

    @Override
    public void execute() {
        printLineReverse();
    }
}
