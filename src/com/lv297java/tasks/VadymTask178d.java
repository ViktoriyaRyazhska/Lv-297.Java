package com.lv297java.tasks;

import com.lv297java.AbstractTask;
import static com.lv297java.inputreader.BufferReader.reader;

import java.io.IOException;

/**
 * With this class you can find amount of a.k elements in 'a.1,...,a.n that satisfy the condition like '2^k < a.k < k!'.
 *
 * @version 1.1
 * @since 2018-07-02
 * @author Vadym Teslytskyy
 */
public class VadymTask178d extends AbstractTask {
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
    * Initializes a newly created {@link VadymTask178d} object.
    * It represents a Task 178d.
    */
    public VadymTask178d() {
        super("178d");
    }
    /**
     * This method reads a inputProgresion.
     */
    private void progresionReading() {
        System.out.println("Task is to find amount of a.k elements in 'a.1,...,a.n' "
            + "that satisfy the condition like '2^k < a.k < k!'");
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
     * This method calculate amount of number in progresionIntArr that satisfy the condition like '2^k < a.k < k!'.
     * @param arrOfProg it`s int array of progresion in which we search numbers.
     * @return counter = amount of numbers that satisfy the condition like '2^k < a.k < k!'.
     */
	public int calculation(int[] arrOfProg) {
		int counter = 0;
		int factorialOfCurrentStepCounter;
		double twoInStepOfCurrentStepCounter;
		for (int i = 0; i < arrOfProg.length; i++) {
			factorialOfCurrentStepCounter = factorialCalculation(i);
			twoInStepOfCurrentStepCounter = Math.pow(2, i);
			if ((arrOfProg[i] < factorialOfCurrentStepCounter)
					&& (arrOfProg[i] > twoInStepOfCurrentStepCounter)) {
				counter++;
			}
		}
		return counter;
	}
	/**
     * This method calculate factorial of number.
     * @param baseNumber the number from which we calculate the factorial.
     * @return result = result of factorial.
     */
	public final int factorialCalculation(int baseNumber) {
		int result = 1;
		for (int i = 1; i <= baseNumber; i++) {
			result *= i;
		}
		return result;
	}
	/**
     * This method print result of calculating.
     * @param counter amount of numbers that satisfy the condition like '2^k < a.k < k!'.
     */
	private void printResult(int counter) {
		System.out.println(
				"Amount of elements that satisfy the condition like '2^k < a.k < k!' is -> " + counter);
	}
	/**
     * {@inheritDoc}
     */
	@Override
	public final void execute() {
		progresionReading();
		progresionConverting();
		printResult(calculation(progresionIntArr));
	}

}
