package com.lv297java.tasks;

import java.util.Scanner;

/**
 * Created by ivan on 06.02.18.
 */
public class TestIvan86b extends AbstractTest {
    public TestIvan86b() {
        super("TestIvan86b");
    }

    @Override
    public void execute() {
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int var = scanner.nextInt();
        int var2 = var;
        if (var>0){
            while(var > 0){
                sum += var%10;
                var/=10;
            }
            System.out.println("the sum of digits number's "+var2+" are " +sum);
        }else {
            System.out.println("the number is not natural");
        }
        System.out.println("*******************************************");
    }
}
