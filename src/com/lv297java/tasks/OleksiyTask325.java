package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by Администратор on 08.02.18.
 */

public class OleksiyTask325 extends AbstractTask {

    public OleksiyTask325() {
        super("325");
    }

    public static boolean isSimpleNumber(int number)
    {
        for(int i = 2; i < number/2; ++i)
            if(number%i ==0)
                return false;
        return true;
    }

    private static void showNumbers()
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
                    System.out.println("Print simple dividers:");
                     for(int i = 1; i <=number; ++i)
                     if(number%i == 0)
			            {
			                if (isSimpleNumber(i))
			                    System.out.println("simple divisor = "+i);
			            }
                } catch (NumberFormatException e) {
                    System.out.println("You have entered wrong number! Try again.");
                }
            } catch (IOException e) {

            }
        }
    }



    @Override
    public void execute() {
       showNumbers();
    }
}

