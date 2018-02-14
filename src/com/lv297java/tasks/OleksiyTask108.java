

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * This class implement task 108.
 *
 * @author Oleksiy Starodub
 * @version 1.0
 */
public class OleksiyTask108 extends AbstractTask {

    /**
     * Initializes a newly created {@code OleksiyTask108} object. It represents an Task 108.
     */
  public OleksiyTask108() {
        super("108");
          }
    /**
     * {@inheritDoc}
     */
  @Override
    public void execute() {
        printNumber();
    }


    /**
     * Finds the smalest integer <code>k</code>, for which the right condition <code>pow(2, r)  which is  bigger then n</code> is true.
     *
     * @param n an integer number greater than 0
     * @return The smallest integer that satisfies the condition <code>pow(2, r) which is  bigger then n</code>.
       */
    public static double returnNumber(int n) {
    double index = 0;
        while (true) {
      double result = Math.pow(2, index);
            index++;
      if (result >= n)
                return result;
        }

    }


    /**
     * * @throws NumberFormatException when the user entered  incorrect string.
     print the smallest integer that satisfies the condition <code>pow(2, r) which is  bigger then n</code>.
     */
    private static void printNumber() {
         while (true) {
            try {
                System.out.println("Enter the number:");
        String input =  new BufferedReader(new InputStreamReader(System.in)).readLine();
                   if (input.equals("exit")) {
                    break;
                }
                try {
          int number = Integer.parseInt(input);
                    if (number < 1) {
                        throw new NumberFormatException();
                    }

                    System.out.println("Number is:" + returnNumber(number));
                } catch (NumberFormatException e) {
                    System.out.println("You have entered wrong number! Try again.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
