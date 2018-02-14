package com.lv297java.hometask1.tasks;

import com.lv297java.hometask1.AbstractTest;

import java.io.*;


/**
 * This class implement task 561.
 *
 * @author Oleksiy Starodub
 * @version 1.0
 */
public class OleksiyTask561  extends AbstractTest {

    /**
     * Initializes a newly created {@code OleksiyTask561} object. It represents an Task 561.
     */
    public OleksiyTask561() {
        super("561");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        showNumbers();
    }

    /**
     * Checks if the number is authomorphic.
     *
     * @param number an integer number greater than 0
     * @return true if  number is authomorphic.
     */
    public static boolean isAutomorphicNumber(int number)   {
    int  square = (int)Math.pow((double) number,2);
    double power = 0;
    int result = 0;

        while( square > 0)    {
            result += square%10 * Math.pow(10,power);
      if( number == result)
                return true;
            power++;
            square /= 10;
        }
        return false;
    }

    /**
     *This method show  all authomorphic numbers from 0 to number
     *  * @throws NumberFormatException user have entered the incorrect string.
     */
    private static void showNumbers()   {
           while(true) {
            try {
                System.out.println("Enter the number:");
        String input =  new BufferedReader(new InputStreamReader(System.in)).readLine();
                if( input.equals("exit") ) {
                    break;
                }
                try {
          int number = Integer.parseInt(input);
                    if (number < 1) {
                        throw new NumberFormatException();
                    }

                System.out.println("Found numbers:");
          for (int i = 0; i < number; ++i)
            if (isAutomorphicNumber(i))
                        System.out.println(i);

                } catch (NumberFormatException e) {
                    System.out.println("You have entered wrong number! Try again.");
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }


}
