package com.lv297java.tasks;

import com.lv297java.AbstractTest;

import java.io.BufferedReader;
import java.util.Scanner;

public class VadymTask555 extends AbstractTest {

	public VadymTask555() {
		super("555");
	}
	
	private Scanner scanner = new Scanner(System.in);
	private int n;
	
	private int pascalCalculation(int i, int j) {
	    return (j == 0 || j == i) ? 1 : pascalCalculation(i - 1, j - 1) + pascalCalculation(i - 1, j);
	}

	@Override
	public void execute() {
		System.out.println("Enter 'n' the number of lines in Pascal triangle:");
		n = Integer.valueOf(scanner.nextLine());
		System.out.println("Result:");
		
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j <= i; j++) {
	            System.out.print(pascalCalculation(i, j) + " ");
	        }
	        System.out.println();
	    }
	}

}
