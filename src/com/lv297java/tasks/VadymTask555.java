package com.lv297java.tasks;


import com.lv297java.AbstractTask;
import static com.lv297java.inputreader.BufferReader.reader;

import java.io.IOException;
/**
 * With this class you can draw Pascal`s triangle in console
 *
 * @version 1.1
 * @since 2018-07-02
 * @author Vadym Teslytskyy
 */
public class VadymTask555 extends AbstractTask {
    /**
     * Amount of Pascal triangle lines that will be printed
     */
    private int amountOfPrintedLines;
    /**
     * Initializes a newly created {@link VadymTask555} object.
     * It represents a Task 555.
     */
    public VadymTask555() {
        super("555");
    }
    /**
     * This method calculate number of Pascal triangle by the formula:
     * 'X(i, j) = X(i - 1, j) + X(i - 1, j - 1)' where X = func of calculating, i = row, j = column
     *
     * @param row = row number.
     * @param column = column number.
     * @return number of Pascal triangle.
     */
    public int pascalCalculation(int row, int column) {
        int number = (column == 0 || column == row) ? 1 : pascalCalculation(row - 1, column - 1)
                        + pascalCalculation(row - 1, column);
        return number;
    }
    /**
     * This method reads a amountOfPrintedLines.
     */
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
	/**
     * This method print result: Pascal triangle with 'amountOfPrintedLines' amount of lines.
     */
	private void printResult() {
		System.out.println("Result:");

		for (int i = 0; i < amountOfPrintedLines; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascalCalculation(i, j) + " ");
			}
			System.out.println();
		}
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public void execute() {
		inputReading();
		printResult();
	}

}
