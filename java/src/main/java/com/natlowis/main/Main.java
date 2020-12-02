package com.natlowis.main;

import com.natlowis.sorting.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting sort = new BubbleSort();
		int[] arrayToSort = {4,765,32,87,12,98};
		int[] answer = sort.sort(arrayToSort);
		
		for (int num: answer) {
			System.out.println(num);
		}
	}

}
