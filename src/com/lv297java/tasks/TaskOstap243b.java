package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import static com.lv297java.tasks.AbstractTaskOstap243.Point.B;

/**
 * This class realize method execute from AbstractTask.
 *
 * <p>This class can count sum of squares of natural number n (if it exists).
 *
 * <p>But it prints all of existing sum of squares where x>=y.
 * It responsible for processing users input and
 * calculating result for task 243b.
 *
 * @author Kravtsiv Ostap
 * @version 1.0.4   10.02.2018
 */

public class TaskOstap243b extends AbstractTaskOstap243 {

    /** Constructor without parameters used to initializing of field {@link AbstractTask#testID}.*/
    public TaskOstap243b() {
        super("243b");
    }

    /**
     * Realized method from {@link AbstractTask}.
     *
     * <p>Call service method {@link AbstractTaskOstap243#service(String, Point)}
     * to process users input and return result.
     */
    @Override
    public void execute() {
        service("Given a natural number n. Can it be represented in the form of the sum of two squares of positive integers. If you can specify a pair of such numbers, where n = x^2 + y^2. Show all possible pairs where x>=y", B);
    }






}
