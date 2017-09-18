//Author: Anthony Panisales

public class MergeSort implements SortingAlgorithm {
	
	int[] merge(int[] a, int[] top, int[] bottom) {
		int topIndex = 0;
		int botIndex = 0;
		int aIndex = 0;
		while (topIndex < top.length && botIndex < bottom.length) {
			if (top[topIndex] <= bottom[botIndex]) {
				a[aIndex++] = top[topIndex++];
			} else {
				a[aIndex++] = bottom[botIndex++];
			}
		}
		while (topIndex < top.length) {
			a[aIndex++] = top[topIndex++];
		}
		while (botIndex < bottom.length) {
			a[aIndex++] = bottom[botIndex++];
		}
		return a;
	}
	
	
	int[] mergeSort(int[] a) {
		if (a.length == 1) {
			return a;
		} else {
			int mid = a.length/2;
			int[] top = new int[mid];
			int[] bottom = new int[a.length-mid];
			for (int i = 0; i < mid; i++) {
				top[i] = a[i];
			}
			for (int i = mid, j = 0; i < a.length; i++, j++) {
				bottom[j] = a[i];
			}
			return merge(a, mergeSort(top), mergeSort(bottom));
		}
	}

	public void sort(int[] a) {
		mergeSort(a);
	}

}
