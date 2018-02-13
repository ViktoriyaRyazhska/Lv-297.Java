package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import static com.lv297java.tasks.AbstractTaskOstap243.Point.A;

/**
 * This class realize method {@link AbstractTask#execute()}.
 *
 * <p>This class can count sum of squares of natural number n (if it exists).
 *
 * <p>But it prints only one of existing sums of squares.
 * It responsible for processing users input and
 * calculating result for task 243a.
 *
 * @author Kravtsiv Ostap
 * @version 1.0.4   10.02.2018
 */

public class TaskOstap243a extends AbstractTaskOstap243 {

    /** Constructor without parameters used to initializing of field {@link AbstractTask#testID}.*/
    public TaskOstap243a() {
        super("243a");
    }

    /**
     * Realized method from {@link AbstractTask}.
     *
     * <p>Call service method {@link AbstractTaskOstap243#service(String, Point)}
     * to process users input and return result.
     */
    @Override
    public void execute() {
        service("Given a natural number n. Can it be represented "
                + "it in the form of the sum of two squares of positive integers ? "
                + "If you can specify a pair of such numbers, where n = x^2 + y^2. Show one pair", A);
    }


}
