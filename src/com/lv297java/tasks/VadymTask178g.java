package com.lv297java.tasks;

import java.util.Scanner;

public class VadymTask178g extends AbstractTest{
	
	private Scanner scanner = new Scanner(System.in);
	private String n;

	public VadymTask178g() {
		super("178g");
	}
	
	private int[] progresionFilling() {
		System.out.println("Task is to find amount of a.k elements in 'a.1,...,a.n' that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'");
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
		for (int i = 1; i < arrOfProg.length-1; i++) {
			if (arrOfProg[i] < ((arrOfProg[i-1]+arrOfProg[i+1])/2)) {
				counter++;
			}
		}
		System.out.println("Amount of elements that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2' is -> " + counter);
	}

	@Override
	public void execute() {
		calculation(progresionFilling());
	}

}
