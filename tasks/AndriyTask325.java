package com.lv297java.hometask1.tasks;

/**
 * This program displays all the simple divisors of the number
 *
 * @version        1.0  06.02.18
 * @author         Andriy Shemechko 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AndriyTask325 extends AbstractTest {


    public AndriyTask325() {
        super("325");
    }

    private static void getPrimeFactor() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter any Number to find Prime Factors ");
            int number = Integer.parseInt(br.readLine());
            System.out.print("Prime Factors are : ");

            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    System.out.print(i + " ");
                    number = number / i;
                }
            }

            if (number < 1) System.out.println(number);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute() {
        getPrimeFactor();
    }
}