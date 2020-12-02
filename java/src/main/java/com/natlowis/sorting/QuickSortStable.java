package com.natlowis.sorting;

public class QuickSortStable implements Sorting {

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
		
		int[] b = new int[right -left + 1];
		int pivotIndex = choosePivot(left, right);
		int pivot = a[pivotIndex];
		int acount = left;
		int bcount = 1;
		
		for (int i = left; i <= right; i++) {
			if (i == pivotIndex) {
				b[0] = a[i];
			}
			else if (a[i] < pivot || (a[i] == pivot && i < pivotIndex)) {
				a[acount] = a[i];
				acount++;
			}
			else {
				b[bcount] = a[i];
				bcount++;
			}
		}
		for (int i = 0; i < bcount; i++) {
			a[acount] = b[i];
			acount++;
		}
		
		return right - bcount +1;
	}

	private int choosePivot(int left, int right) {

		return left;
		//return (right - left -1 ) /2;
	}
}
