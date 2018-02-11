package com.lv297java.tasks;


import com.lv297java.AbstractTask;
import static com.lv297java.inputreader.BufferReader.reader;

import java.io.IOException;

public class VadymTask555 extends AbstractTask {

	public VadymTask555() {
		super("555");
	}

	private int amountOfPrintedLines;

	public int pascalCalculation(int i, int j) {
		return (j == 0 || j == i) ? 1 : pascalCalculation(i - 1, j - 1) + pascalCalculation(i - 1, j);
	}

	private void inputReading() {
		System.out.println("Enter 'n' the number of lines in Pascal triangle:");
		try {
			amountOfPrintedLines = Integer.valueOf(reader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void printResult() {
		System.out.println("Result:");

		for (int i = 0; i < amountOfPrintedLines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascalCalculation(i, j) + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void execute() {
		inputReading();
		printResult();
	}

}
