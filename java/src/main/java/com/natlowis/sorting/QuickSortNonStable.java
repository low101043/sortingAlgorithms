package com.natlowis.sorting;

import java.util.Random;

public class QuickSortNonStable implements Sorting {

	int[] a;
	
	@Override
	public int[] sort(int[] a) {
		this.a = a;
		quicksort(0, a.length -1);
		return this.a;
	}

	private void quicksort( int left, int right) {
		if (left < right) {
			int pivotIndex = partition(left, right);
			quicksort(left, pivotIndex-1);
			quicksort(pivotIndex+1, right);
		}
	}

	private int partition(int left, int right) {
		
		int pivotIndex = choosePivot(left, right);
		int pivot = a[pivotIndex];
		
		int temp = a[pivotIndex];
		a[pivotIndex] = a[right];
		a[right] = temp;
		
		int leftmark = left;
		int rightmark = right - 1;
		
		while (leftmark <= rightmark) {
			while (leftmark <= rightmark && a[leftmark] <= pivot) {
				leftmark++;
			}
			while (leftmark <= rightmark && a[rightmark] >= pivot) {
				rightmark--;
			}
			
			if (leftmark < rightmark) {
				temp = a[leftmark];
				a[leftmark] = a[rightmark];
				a[rightmark] = temp;
				leftmark++;
				rightmark++;
			}
		}
		
		temp = a[leftmark];
		a[leftmark] = a[right];
		a[right] = temp;
		
		return leftmark;
	}

	private int choosePivot(int left, int right) {

		return left;
		//return (right - left -1 ) /2;
	}
}
