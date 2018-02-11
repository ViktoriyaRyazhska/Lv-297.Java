package com.lv297java.tasks;

import com.lv297java.AbstractTask;
import static com.lv297java.inputreader.BufferReader.reader;

import java.io.IOException;
/**
 * With this class you can find amount of a.k elements in 'a.1,...,a.n
 * that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'.
 *
 * @version 1.0
 * @since 2017-11-02
 * @author Vadym Teslytskyy
 */
public class VadymTask178g extends AbstractTask {

	/**
     * Entered progresion.
     */
    private String inputProgresion;
    /**
     * Progresion splited in array .
     */
    private String[] splitedInputProgresion;
    /**
     * String progresion array converted in int array .
     */
    private int[] progresionIntArr;

    /**
    * Initializes a newly created {@link VadymTask178g} object.
    * It represents a Task 178g.
    */
	public VadymTask178g() {
		super("178g");
	}
	/**
     * This method reads a inputProgresion.
     */
	private void progresionReading() {
		System.out.println(
				"Task is to find amount of a.k elements in 'a.1,...,a.n' "
						+ "that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'");
		System.out.println("Enter number of progresion by space:");
		try {
			inputProgresion = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
     * This method covert String[] splitedInputProgresion to int[] progresionIntArr.
     */
	private void progresionConverting() {
		splitedInputProgresion = inputProgresion.split("\\s+");
		progresionIntArr = new int[splitedInputProgresion.length];
		for (int i = 0; i < splitedInputProgresion.length; i++) {
			progresionIntArr[i] = Integer.valueOf(splitedInputProgresion[i]);
		}
	}
	/**
     * This method calculate amount of number in progresionIntArr
     * that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'.
     *
     * @param arrOfProg it`s int array of progresion in which we search numbers.
     * @return counter = amount of numbers that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'.
     */
	public int calculation(int[] arrOfProg) {
		int counter = 0;
		for (int i = 1; i < arrOfProg.length - 1; i++) {
			if (arrOfProg[i] < ((arrOfProg[i - 1] + arrOfProg[i + 1]) / 2)) {
				counter++;
			}
		}
		return counter;
	}
	/**
     * This method print result of calculating.
     * @param counter amount of numbers that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2'.
     */
	private void printResult(int counter) {
		System.out.println("Amount of elements that satisfy the condition like 'a.k = (a.k-1+a.k+1)/2' is -> "
						+ counter);
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public void execute() {
		progresionReading();
		progresionConverting();
		printResult(calculation(progresionIntArr));
	}

}
