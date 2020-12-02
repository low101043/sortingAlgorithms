package com.natlowis.sorting;

public class BubbleSort implements Sorting {

	@Override
	public int[] sort(int[] a) {

		int n = a.length;
		
		for (int i = 1; i < n; i++) {
			
			for (int j = n - 1; j >= i; j--) {
				
				if (a[j] < a[j - 1]) {
					
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		return a;
	}

}
