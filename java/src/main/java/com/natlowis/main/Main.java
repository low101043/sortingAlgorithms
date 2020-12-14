package com.natlowis.main;

import com.natlowis.sorting.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting sort = new QuickSortNonStable();
		int[] arrayToSort = {4,765};
		int[] answer = sort.sort(arrayToSort);
		
		for (int num: answer) {
			System.out.println(num);
		}
	}

}
