package com.natlowis.io;

import java.util.Scanner;

public class InputOutput {
	
	private Scanner input;
	
	public InputOutput() {
		input = new Scanner(System.in);
	}
	
	public void print(int[] toOutput) {
		
		String output = "The list in order is: ";
		for (int element: toOutput) {
			output = output + element + ", ";
		}
		int length = output.length();
		if (length > 2) {
			output = (String) output.subSequence(0, length -2);
		}
		
		
		
		System.out.println(output);
	}
	
	public int[] input() {
		// create an object of Scanner
		//Scanner input = new Scanner(System.in);

		
		System.out.print("Enter how many values you want to sort: ");
		
		// take input from the user
		String numberOfInputsStr = input.nextLine();
		int numberOfInputs = -1;
		while (!checkNumInt(numberOfInputsStr)) {
			System.out.print("This isn't a valid number");
			numberOfInputsStr = input.nextLine();
		}
		//System.out.println(number);
		numberOfInputs = Integer.parseInt(numberOfInputsStr);
		int[] inputArray = new int[numberOfInputs];
		System.out.println("Please provide " + numberOfInputs + " integers");
		for (int i =0; i < numberOfInputs; i++) {
			String inputString = input.nextLine();
			while (!checkInt(inputString)) {
				System.out.println("Not a valid number");
				inputString = input.nextLine();
			}
			
			inputArray[i] = Integer.parseInt(inputString);
		}
		
		return inputArray;
	}
	
	private Boolean checkNumInt(String intToTry) {
		try {
			int i = Integer.parseInt(intToTry);
			if (i >= 0) {
			return true;
			}
			else {
				return false;
			}
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	private Boolean checkInt(String intToTry) {
		
		try {
			int i = Integer.parseInt(intToTry);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	
	public int menu() {
		System.out.println("Welcome to my Sorting program.  Please choose which sort you would like to use.");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Insertion Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Quick Sort");
		System.out.println("5. Exit program");
		
		System.out.print("\nPlease choose an option: ");
		//Scanner input = new Scanner(System.in);
		String inputChosenStr = input.nextLine();
		
		while (!checkInt(inputChosenStr)) {
			System.out.print("Enter a valid number: ");
			inputChosenStr = input.nextLine();
		}
		//input.close();
		return Integer.parseInt(inputChosenStr);
		
	}
	
	public void close() {
		input.close();
	}
}
