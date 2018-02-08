package com.lv297java.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskOstap243a extends AbstractTest {

    public TaskOstap243a() {
        super("243a");
    }

    @Override
    public void execute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Given a natural number n. Can it be represented it in the form of the sum of two squares of positive integers ? If you can specify a pair of such numbers, where n = x^2 + y^2. Show one pair");
        System.out.println("Type (exit task) to end attempt");
        while (true) {
            System.out.println("Input n:");
            try {
                String input = reader.readLine();
                if(input.equals("exit task")) {
                    break;
                }
                try {
                    int parsedInput = Integer.valueOf(input);
                    if (parsedInput <= 0) {
                        throw new NumberFormatException();
                    }
                    printResults(findSquares(parsedInput));
                } catch (NumberFormatException e) {
                    System.out.println("You input not a natural number! Try again.");
                }
            } catch (IOException e) {
                //NOT
            }
        }

    }

    private List<Integer[]> findSquares(int input) {
        List<Integer[]> list = new ArrayList<>();
        input = Math.abs(input);
        for(int x = 1; x <= Math.floor(Math.sqrt(input)); x++){
            for(int y = 1; y <= Math.floor(Math.sqrt(input)); y++) {
                if (input == (x*x + y*y)) {
                    list.add(new Integer[] {x,y});
                }
            }
        }
        return list;
    }

    private void printResults(List<Integer[]> list) {
        if(list.size() == 0) {
            System.out.println("There are no such pairs of numbers");
        }
        else {
            System.out.println("x = " + list.get(0)[0] + " y = " + list.get(0)[1]);
        }
    }
}
