package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * With this class you can print all Armstrong numbers consisting of two, three and four digits if there exists.
 *
 * @author Andriy Shemechko
 * @version 1.0
 * @since 2017-06-02
 */

public class AndriyTask562 extends AbstractTask {

    /**
     * The number that represents the lower limit of Armstrong numbers.
     */
    private static final int LOWER_LIMIT = 10;

    /**
     * The number that represents the upper limit of Armstrong numbers.
     */
    private static final int UPPER_LIMIT = 10000;

    /**
     * Initializes a newly created {@code AndriyTask562} object.
     * It represents an Task 562.
     */
    public AndriyTask562() {
        super("562");
    }

    /**
     * @return the list of all Armstrong numbers in set range.
     */
    private List getArmstrongNumbers() {

        List<Integer> listOfArmstrongNumbers = new LinkedList<>();

        IntStream.range(LOWER_LIMIT, UPPER_LIMIT)
                .filter((n) -> {
                    final String number = Integer.toString(n);
                    return number.chars()
                            .map(d -> d - '0')
                            .mapToDouble(v -> Math.pow(v, number.length()))
                            .sum() == n;
                }).forEach(listOfArmstrongNumbers::add);

        return listOfArmstrongNumbers;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {

        System.out.printf("This is all Armstrong numbers in range between %s - %s\n", LOWER_LIMIT, UPPER_LIMIT);
        System.out.println(getArmstrongNumbers());
    }


}