package com.lv297java;

/**
 * Base class for all tests.
 *
 * @version 1.0 6 Feb 2018
 * @author Ostap Kravtsiv
 */
public abstract class AbstractTask {
    /**
     * Unique ID of test.
     */
    private String testID;

    /**
     * Initializes a newly created {@code AbstractTask} object so that it represents
     * certain math test.
     * @param testID unique ID of test
     */
    public AbstractTask(final String testID) {
        this.testID = testID;
    }

    /**
     * Returns unique ID of current test.
     *
     * @return current {@link AbstractTask#testID}
     */
    public String getTestID() {
        return testID;
    }

    /**
     * This method executes current test.
     * It accepts data from the standard input (if necessary)
     * and outputs the result to a standard output.
     */
    public abstract void execute();
}
