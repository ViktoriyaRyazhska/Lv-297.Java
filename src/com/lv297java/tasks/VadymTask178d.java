package com.lv297java.tasks;


import com.lv297java.AbstractTask;
import static com.lv297java.inputreader.BufferReader.reader;

import java.io.IOException;

public class VadymTask178d extends AbstractTask {

	public VadymTask178d() {
		super("178d");
	}

	private String inputProgresion;

	private String[] splitedInputProgresion;

	private int[] progresionIntArr;

	private void progresionReading() {
		System.out.println(
				"Task is to find amount of a.k elements in 'a.1,...,a.n' that satisfy the condition like '2^k < a.k < k!'");
		System.out.println("Enter number of progresion by space:");
		try {
			inputProgresion = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void progresionConverting() {
		splitedInputProgresion = inputProgresion.split("\\s+");
		progresionIntArr = new int[splitedInputProgresion.length];
		for (int i = 0; i < splitedInputProgresion.length; i++) {
			progresionIntArr[i] = Integer.valueOf(splitedInputProgresion[i]);
		}
	}

	public int calculation(int[] arrOfProg) {
		int counter = 0;
		int factorialOfCurrentStepCounter;
		double twoInStepOfCurrentStepCounter;
		for (int i = 0; i < arrOfProg.length; i++) {
			factorialOfCurrentStepCounter = factorialCalculation(i);
			twoInStepOfCurrentStepCounter = Math.pow(2, i);
			if ((arrOfProg[i] < factorialOfCurrentStepCounter) && (arrOfProg[i] > twoInStepOfCurrentStepCounter)) {
				counter++;
			}
		}
		return counter;
	}

	public int factorialCalculation(int x) {
		int result = 1;
		for (int i = 1; i <= x; i++) {
			result *= i;
		}
		return result;
	}

	private void printResult(int counter) {
		System.out.println("Amount of elements that satisfy the condition like '2^k < a.k < k!' is -> " + counter);
	}

	@Override
	public void execute() {
		progresionReading();
		progresionConverting();
		printResult(calculation(progresionIntArr));
	}

}
