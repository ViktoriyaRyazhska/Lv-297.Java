package com.lv297java.tasks;

import com.lv297java.AbstractTest;
import java.util.stream.IntStream;

/**
 * With this class you can print all Armstrong numbers consisting of two, three and four digits if there exists.
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2017-06-02
 */

public class AndriyTask562 extends AbstractTest {

    /**
     * Initializes a newly created {@code AndriyTask562} object.
     * It represents an Task 562.
     */
    public AndriyTask562() {
        super("562");
    }

    /**
     * This method print all Armstrong numbers consisting of condition.
     */
    private void printArmstrongNumbers() {

        int lowerLimit = 10; // is the number that represents the lower limit of Armstrong numbers.
        int maxLimit = 10000; // is the number that represents the upper limit of Armstrong numbers.

        IntStream.range(lowerLimit, maxLimit)
                .filter((n) -> {
                    final String number = Integer.toString(n);
                    return number.chars()
                            .map(d -> d - '0')
                            .mapToDouble(v -> Math.pow(v, number.length()))
                            .sum() == n;
                }).forEach(System.out::println);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        printArmstrongNumbers();
    }


}
