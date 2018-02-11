package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class that extends abstract class AbstractTask and contains solution for task number 559.
 *
 * @author Yura Katola
 * @version 1.0
 */
public class TaskYura559 extends AbstractTask {

    /**
     * Initializes a newly created {@code TaskYura559} object.
     */
    public TaskYura559() {
        super("559");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Naturally number n is given. Find all Mersen numbers smaller than n.");
        System.out.println("Enter the naturally number n: ");
        int n = sc.nextInt();
        System.out.println("Mersen numbers: " + findMersenNumbers(n));
    }

    /**
     * Finds all Mersen numbers smaller than <code>n</code>.
     *
     * @param n an naturally integer number. For example [1,2,3,4,5...]
     * @return list of naturally mersen integer numbers
     * @throws IllegalArgumentException when <code>n</code> will be not a naturally number: when it will be less then
     *                                  1.
     */
    public List<Integer> findMersenNumbers(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(
                    "Argument 'n' is not a naturally integer number. It less then 1.");
        }
        List<Integer> mersenNumbers = new ArrayList<>();
        int temp = 1;
        int mersenNum;
        do {
            temp *= 2;
            mersenNum = temp - 1;
            if (mersenNum < n) {
                mersenNumbers.add(mersenNum);
            }
        } while (mersenNum < n);
        return mersenNumbers;
    }
}
