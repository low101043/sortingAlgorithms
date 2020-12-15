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
		int numberOfInputs = input.nextInt();
		//System.out.println(number);
		int[] inputArray = new int[numberOfInputs];
		System.out.println("Please provide " + numberOfInputs + " integers");
		for (int i =0; i < numberOfInputs; i++) {
			int inputNumber = input.nextInt();
			inputArray[i] = inputNumber;
		}
		
		return inputArray;
	}
	
	public int menu() {
		System.out.println("Welcome to my insertion sort program.  Please choose which sort you would like to use.");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Insertion Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Quick Sort");
		System.out.println("5. Exit program");
		
		System.out.print("\nPlease choose an option: ");
		//Scanner input = new Scanner(System.in);
		int inputChosen = input.nextInt();
		
		//input.close();
		return inputChosen;
		
	}
	
	public void close() {
		input.close();
	}
}
