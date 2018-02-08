package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOstap107 extends AbstractTest {

    public TaskOstap107() {
        super("107");
    }

    @Override
    public void execute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Given an integer m > 1. Get the most out of the whole k, at which 4^k < m.");
        System.out.println("Type (exit task) to end attempt");
        while(true) {
            System.out.println("Input m: ");
            try {
                String input = reader.readLine();
                if(input.equals("exit task")) {
                    break;
                }
                try {
                    int parsedInput = Integer.valueOf(input);
                    if (parsedInput <= 1) {
                        throw new NumberFormatException();
                    }
                    System.out.println("Max k = " + findMaxK(parsedInput));
                } catch (NumberFormatException e) {
                    System.out.println("You input not a natural number! Try again.");
                }
            } catch (IOException e) {
                //NOT
            }
        }
    }

    private int findMaxK(int input){
        return (int)(0.5*(Math.log10(input)/Math.log10(2)));
    }
}
