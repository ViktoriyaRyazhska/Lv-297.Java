package com.lv297java.tasks;

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

    private static boolean isValueNumberAndNotEmpty(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    private static void getAllNumbersDivisors() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter any Number to find all simple divisors");
            String inputValue = br.readLine();

            while (!isValueNumberAndNotEmpty(inputValue)) {
                System.out.println("Please, enter a digit value\nTry again");
                inputValue = br.readLine();
            }

            int number = Integer.parseInt(inputValue);
            System.out.printf("This is all simple divisors of the number %s : ", number);

            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    System.out.print("\n" + i);
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