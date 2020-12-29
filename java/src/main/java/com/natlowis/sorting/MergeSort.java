package com.natlowis.sorting;

/**
 * This performs merge sort in ascending order
 * @author low101043
 *
 */
class MergeSort implements Sorting {

	int[] a; //To be sorted
	
	@Override
	public int[] sort(int[] a) {
		this.a = a;
		mergesort(0, a.length - 1);
		return this.a;
		
	}

	/**
	 * The recursive function
	 * @param left  The left side to be sorted
	 * @param right The right side to be sorted
	 */
	private void mergesort(int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergesort(left, mid);
			mergesort(mid+1,right);
			merge(left,mid,right);
		}
	}

	/**
	 * Performs the actual merge
	 * @param left The left side of the array
	 * @param mid The middle element
	 * @param right The right side of the array
	 */
	private void merge(int left, int mid, int right) {
		
		int[] b = new int[right-left + 1];
		int bcount = 0;
		int lcount = left;
		int rcount = mid+1;
		
		while ((lcount <= mid) && (rcount <= right)) {
			if (a[lcount] <= a[rcount]) {
				b[bcount] = a[lcount];
				bcount++;
				lcount++;
			}
			else {
				b[bcount] = a[rcount];
				bcount++;
				rcount++;
			}
		}
		
		if (lcount > mid) {
			while (rcount <= right) {
				b[bcount] = a[rcount];
				bcount++;
				rcount++;
			}
		}
		else {
			while (lcount <= mid) {
				b[bcount] = a[lcount];
				bcount++;
				lcount++;
			}
		}
		
		for (bcount = 0; bcount < right-left+1; bcount++) {
			a[left+bcount] = b[bcount];
		}
		
	}

}
