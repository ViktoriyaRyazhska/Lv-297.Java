package com.lv297java.tasks;

import java.util.stream.IntStream;

/**
 * This program return all Armstrong numbers consisting of two, three and four digits if there exists.
 *
 * @version        1.0  06.02.18
 * @author         Andriy Shemechko 
 */

public class AndriyTask562 extends AbstractTest {

    public AndriyTask562() {
        super("562");
    }

     public static void getArmstrongNumbers() {

        IntStream.range(10, 100000)   // here we set the range
                .filter((n) -> {
                    final String number = Integer.toString(n);
                    return number.chars()
                            .map(d -> d - '0')
                            .mapToDouble(v -> Math.pow(v, number.length()))
                            .sum() == n;
                }).forEach(System.out::println);

    }


    @Override
    public void execute() {
        getArmstrongNumbers();
    }


}