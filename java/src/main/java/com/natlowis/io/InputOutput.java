package com.natlowis.io;

import java.util.Scanner;

/**
 * Class to control input and outputs to user
 * @author low101043
 *
 */
public class InputOutput {
	
	private Scanner input;  // Allows input off user
	
	/**
	 * Constructs class
	 */
	public InputOutput() {
		input = new Scanner(System.in);
	}
	
	/**
	 * This will output a list
	 * @param toOutput The list to output
	 */
	public void print(int[] toOutput) {
		
		String output = "The list in order is: ";  // The list to output
		
		for (int element: toOutput) {
			output = output + element + ", ";
		}
		int length = output.length();
		
		// If there is more than one element
		if (length > 2) {
			output = (String) output.subSequence(0, length -2);
		}
		
		
		
		System.out.println(output);
	}
	
	/**
	 * This gets the input list off the user
	 * @return The input list
	 */
	public int[] input() {
		
		System.out.print("Enter how many values you want to sort: ");
		
		// take input from the user
		String numberOfInputsStr = input.nextLine();
		int numberOfInputs = -1;
		
		// Checks input is correct
		while (!checkNumInt(numberOfInputsStr)) {
			System.out.print("This isn't a valid number");
			numberOfInputsStr = input.nextLine();
		}
		

		numberOfInputs = Integer.parseInt(numberOfInputsStr);
		int[] inputArray = new int[numberOfInputs];
		System.out.println("Please provide " + numberOfInputs + " integers");
		
		//Gets the input off the user
		for (int i =0; i < numberOfInputs; i++) {
			String inputString = input.nextLine();
			
			while (!checkInt(inputString)) {
				System.out.println("Not a valid number: ");
				inputString = input.nextLine();
			}
			
			inputArray[i] = Integer.parseInt(inputString);
		}
		
		return inputArray;
	}
	
	/**
	 * Checks that an input is a number and larger than 0
	 * @param intToTry The input to check
	 * @return Whether it is a valid input
	 */
	private Boolean checkNumInt(String intToTry) {
		
		//Checks its a number
		if (checkInt(intToTry)) {
			
			
			if (Integer.parseInt(intToTry) >= 0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/**
	 * Checks if an input is a number
	 * @param intToTry  The input is valid
	 * @return  Whether it is a valid input
	 */
	private Boolean checkInt(String intToTry) {
		
		try {
			int i = Integer.parseInt(intToTry);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	/**
	 * The menu for the user
	 * @return The input
	 */
	public int menu() {
		
		System.out.println("Welcome to my Sorting program.  Please choose which sort you would like to use.");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Insertion Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Quick Sort");
		System.out.println("5. Exit program");
		
		System.out.print("\nPlease choose an option: ");
		
		//Gets input
		String inputChosenStr = input.nextLine();
		
		while (!checkInt(inputChosenStr)) {
			System.out.print("Enter a valid number: ");
			inputChosenStr = input.nextLine();
		}
		//input.close();
		return Integer.parseInt(inputChosenStr);
		
	}
	
	/**
	 * Closes the scanner.  Must be called before ending program.
	 */
	public void close() {
		input.close();
	}
}
