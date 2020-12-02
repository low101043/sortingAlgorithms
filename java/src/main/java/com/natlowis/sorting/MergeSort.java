package com.natlowis.sorting;

public class MergeSort implements Sorting {

	int[] a;
	
	@Override
	public int[] sort(int[] a) {
		this.a = a;
		mergesort(0, a.length - 1);
		return this.a;
		
	}

	private void mergesort(int left, int right) {
		if (left < right) {
			int mid = (left + right) /2;
			mergesort(left, mid);
			mergesort(mid+1,right);
			merge(left,mid,right);
		}
	}

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
