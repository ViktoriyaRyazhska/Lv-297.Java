package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.*;


/**
 * Created by Администратор on 08.02.18.
 */
public class OleksiyTask561  extends AbstractTask {

    public OleksiyTask561() {
        super("561");
    }

    @Override
    public void execute() {
        showNumbers();
    }

    public static boolean isAutomorphicNumber(int number)
    {
        int  square = (int)Math.pow((double) number,2);
        double power = 0;
        int result = 0;

        while(square > 0)
        {
            result +=square%10*Math.pow(10,power);
            if(number == result)
                return true;
            power++;
            square/=10;
        }
        return false;
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

                System.out.println("Found numbers:");
                for (int i = 0; i < number; ++i)
                    if (isAutomorphicNumber(i))
                        System.out.println(i);

                } catch (NumberFormatException e) {
                    System.out.println("You have entered wrong number! Try again.");
                }
            } catch (IOException e) {

            }
        }
    }


}
