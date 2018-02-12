package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.lv297java.inputreader.BufferReader.reader;

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
    private static final int lowerLimit = 10;

    /**
     * The number that represents the upper limit of Armstrong numbers.
     */
    private static final int upperLimit = 10000;

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
    private List printArmstrongNumbers() {

        List<Integer> listOfArmstrongNumbers = new ArrayList<>();

        IntStream.range(lowerLimit, upperLimit)
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

        System.out.printf("This is all Armstrong numbers in range between %s - %s\n", lowerLimit, upperLimit);
        System.out.println(printArmstrongNumbers());
    }


}