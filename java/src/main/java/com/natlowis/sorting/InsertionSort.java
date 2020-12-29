package com.natlowis.sorting;

/**
 * Class which implements insertion sort numerically in ascending order
 * @author low101043
 *
 */
public class InsertionSort implements Sorting {

	@Override
	public int[] sort(int[] a) {
		
		int n = a.length;
		
		for (int i = 1; i < n; i++) {
			
			int j = i;
			int t = a[j];
			
			while (j > 0 && t < a[j-1]) {
				
				a[j] = a[j -1];
				j--;
			}
			a[j] = t;
		}
		return a;
	}

}
