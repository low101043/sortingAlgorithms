package com.natlowis.main;

import com.natlowis.io.InputOutput;
import com.natlowis.sorting.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputOutput io = new InputOutput();
		int inputChosen = io.menu();
		while (inputChosen != 5) {
			
			if (inputChosen == 1) {

				int[] numbers = io.input();
				System.out.println("Performing Bubble Sort");
				Sorting bubble = new BubbleSort();
				numbers = bubble.sort(numbers);
				io.print(numbers);
			}
			else if (inputChosen == 2) {
				int[] numbers = io.input();
				System.out.println("Performing Insertion Sort");
				Sorting insertion = new InsertionSort();
				numbers = insertion.sort(numbers);
				io.print(numbers);
			}
			else if (inputChosen == 3) {
				int[] numbers = io.input();
				System.out.println("Performing Merge Sort");
				Sorting merge = new MergeSort();
				numbers = merge.sort(numbers);
				io.print(numbers);
			}
			else if (inputChosen == 4) {
				int[] numbers = io.input();
				System.out.println("Performing Quick Sort");
				Sorting quick = new QuickSortNonStable();
				numbers = quick.sort(numbers);
				io.print(numbers);
			}
			else {
				System.out.println("This is not a valid input try again");
			}
			
			inputChosen = io.menu();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Goodbye");
		io.close();
		
	}

}
