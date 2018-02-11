package com.lv297java.tasks;

import com.lv297java.AbstractTask;

import java.util.Scanner;

public class VadymTask178d extends AbstractTask {

	public VadymTask178d() {
		super("178d");
	}
	
	private Scanner scanner = new Scanner(System.in);
	private String n;
	
	private int[] progresionFilling() {
		System.out.println("Task is to find amount of a.k elements in 'a.1,...,a.n' that satisfy the condition like '2^k < a.k < k!'");
		System.out.println("Enter number of progresion by space:");
		n = scanner.nextLine();
		String progresionStr[] = n.split("\\s+");
		int progresionIntArr[] = new int[progresionStr.length];
		for (int i = 0; i < progresionStr.length; i++) {
			progresionIntArr[i] = Integer.valueOf(progresionStr[i]);
		}
		return progresionIntArr;
	}
	
	private void calculation(int[] arrOfProg) {
		int counter = 0;
		for (int i = 0; i < arrOfProg.length; i++) {
			if ((arrOfProg[i] < (factorialCalculation(i)))&&(arrOfProg[i] > Math.pow(2, i))) {
				counter++;
			}
		}
		System.out.println("Amount of elements that satisfy the condition like '2^k < a.k < k!' is -> " + counter);
	}

	
	private int factorialCalculation(int x){
		int result=1;
	    for (int i = 1; i <= x; i++)
	    {
	        result *= i;
	    }
	    return  result;
	}

	@Override
	public void execute() {
		calculation(progresionFilling());
	}

}
