package com.lv297java.tasks;

import com.lv297java.AbstractTask;

public class KolyasaTask322 extends AbstractTask {


    /**
     * Initializes a newly created {@code AbstractTask} object so that it represents
     * certain math test.
     *
     * @param testID unique ID of test
     */
    public KolyasaTask322() {
        super("322");
    }

    @Override
    public void execute() {
        int result = 0;
        int resultNumber = 1;
        int p = 10000;

        for (int i = 1; i < p; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum > result) {
                result = sum;
                resultNumber = i;
            }
        }
        System.out.println("The program finds a natural number"
                + " from 1 to 10 000 with a maximum sum of dividers");
        System.out.println("The number with a maximum "
                + "sum of dividers: " + resultNumber
                + " The sum of dividers:" + result);


    }
}
