package com.lv297java.tasks;

import java.util.Scanner;

/**
 * Created by ivan on 06.02.18.
 */
public class TestIvan330 extends AbstractTest {
    public TestIvan330() {
        super("TestIvan330");
    }

    @Override
    public void execute() {
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        if (var>0){
            for (int i = 1; i < var; i++){
                int sum = 0;
                for (int j = 1; j < i; j++){
                    if (i%j == 0)
                        sum = sum + j;
                }
                if (i == sum)
                    System.out.println("the number " + i +" is perfect");
            }
        }else {
            System.out.println("the number is not natural");
        }
        System.out.println("*******************************************");
    }
}
