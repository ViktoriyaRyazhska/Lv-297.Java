package com.lv297java.tasks;

import java.util.Scanner;

/**
 * Created by ivan on 06.02.18.
 */
public class TestIvan86a extends AbstractTest {
    public TestIvan86a() {
        super("TestIvan86a");
    }

    @Override
    public void execute() {
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int var = scanner.nextInt();
        int var2 = var;
        if (var>0){
            while(var > 0){
                count++;
                var /= 10;
            }
            System.out.println("in the number "+var2+" are " +count + " numbers");
        }else {
            System.out.println("the number is not natural");
        }
        System.out.println("*******************************************");

    }
}
