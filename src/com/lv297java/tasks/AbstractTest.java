package com.lv297java.tasks;

public abstract class AbstractTest {

    public AbstractTest(String testID){
        this.testID = testID;
    }

    private String testID;

    public String getTestID() {
        return testID;
    }

    public abstract void execute();
}
