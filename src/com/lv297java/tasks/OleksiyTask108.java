package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * Created by Администратор on 08.02.18.
 */
public class OleksiyTask108 extends AbstractTest {

    public OleksiyTask108() {
        super("108");
    }

    @Override
    public void execute(BufferedReader reader) {
       printNumber();
    }


    private static double returnNumber(int n)
    {
        double index = 0;
        while(true)
        {
            double result = Math.pow(2,index);
            index++;
            if(result >= n )
                return result;
        }

    }

    private static void printNumber()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                System.out.println("Enter the number:");
                String input = reader.readLine();
                if(input.equals("exit")) {
                    break;
                }
                try {
                    int number = Integer.parseInt(input);
                    if (number < 1) {
                        throw new NumberFormatException();
                    }

                    System.out.println("Number is:"+ returnNumber(number));
                   } catch (NumberFormatException e) {
                    System.out.println("You have entered wrong number! Try again.");
                }
            } catch (IOException e) {

            }
        }
    }

}
