package com.lv297java.tasks;

import com.lv297java.AbstractTask;
import static com.lv297java.inputreader.BufferReader.reader;

import java.io.IOException;

public class VadymTask178g extends AbstractTask {

	private String inputProgresion;
	private String[] splitedInputProgresion;
	private int[] progresionIntArr;

	public VadymTask178g() {
		super("178g");
	}

	private void progresionReading() {
		System.out.println(
				"Task is to find amount of a.k elements in 'a.1,...,a.n' that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'");
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
		for (int i = 1; i < arrOfProg.length - 1; i++) {
			if (arrOfProg[i] < ((arrOfProg[i - 1] + arrOfProg[i + 1]) / 2)) {
				counter++;
			}
		}
		return counter;
	}

	private void printResult(int counter) {
		System.out
				.println("Amount of elements that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2' is -> " + counter);
	}

	@Override
	public void execute() {
		progresionReading();
		progresionConverting();
		printResult(calculation(progresionIntArr));
	}

}
