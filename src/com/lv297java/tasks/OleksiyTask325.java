package com.lv297java.hometask1.tasks;

import com.lv297java.hometask1.AbstractTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 This class implement task 325.
 *
 * @author Oleksiy Starodub
 * @version 1.0
 */

public class OleksiyTask325 extends AbstractTest {

     /**
     * Initializes a newly created {@code OleksiyTask325} object. It represents an Task 325.
     */
    public OleksiyTask325() {
        super("325");
    }

    /**
     * Checks if the number is simple.
     *
     * @param number an integer number greater than 0
     * @return true if  number is simple.
         */
  public static boolean isSimpleNumber(int number)  {
    for(int i = 2; i < number/2; ++i)
      if( number % i == 0)
                return false;
        return true;
    }

    /**
     *This method show  all simple dividers of input number
     *  * @throws NumberFormatException user have entered the incorrect string.
     */
    private static void showNumbers()  {
         while(true) {
            try {
                System.out.println("Enter the number:");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if( input.equals("exit")) {
                    break;
                }
                 try {
          int number = Integer.parseInt(input);
                    if (number < 1) {
                        throw new NumberFormatException();
                    }
                    System.out.println("Print simple dividers:");
          for(int i = 1; i <=number; ++i)
                     if( number % i == 0)      {
              if (isSimpleNumber(i))
                    System.out.println("simple divisor = "+i);
            }

                } catch (NumberFormatException e) {
                    System.out.println("You have entered wrong number! Try again.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
       showNumbers();
    }
}

