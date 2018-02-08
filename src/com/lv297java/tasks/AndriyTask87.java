package com.lv297java.tasks;

/**
 * This program return the amount m from the last digits of the number n.
 *
 * @version        1.0  06.02.18
 * @author         Andriy Shemechko 
 */

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AndriyTask87 extends AbstractTest {

    private String number;
    private String n;

    public AndriyTask87() {
        super("87");
    }

    private String getN() {
        return n;
    }

    private boolean isValueNumberAndNotEmpty(String value) {
        return value.chars().allMatch(Character::isDigit) && !value.equals("");
    }

    private boolean isValueNCorrect(String value) {
        return Integer.parseInt(getN()) <= number.length();   // checks whether the number of the last digits is no more than the length of the number
    }

    private void readData() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Please, enter some number");
            number = br.readLine();

            while (!isValueNumberAndNotEmpty(number)) {  
                System.out.println("Value invalid. Try again");
                number = br.readLine();     // if input is non-digital or empty try again
            }

            System.out.println("How many digits from the end of number you want to count the sum\n Enter the number (N)");
            n = br.readLine();

            while (!isValueNumberAndNotEmpty(n)) {      
                System.out.println("Please, enter a digit value of N\n Try again");
                n = br.readLine();   // if input is non-digital or empty try again
            }

            while (!isValueNCorrect(n)) {
                System.out.println("You entered invalid value of N\n Try again");
                n = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
                       
    
    private int getTheSumOfLastElements() {   

        // put input (entered number) into String array, each cell in which it is a character of the number
        String numbersArray[] = number.split("");          
           
        // convertation all characters from String array to Integer array and returning the amount depending on the condition - (getN())
        return Arrays.stream(numbersArray).mapToInt(Integer::parseInt).skip(numbersArray.length - Integer.parseInt(getN())).sum();                                 
        
    }

    @Override
    public void execute() {
        readData();
        System.out.println(getTheSumOfLastElements());
    }


}