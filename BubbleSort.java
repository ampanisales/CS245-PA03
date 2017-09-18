//Author: Anthony Panisales

public class BubbleSort implements SortingAlgorithm {

	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] a) {
		boolean swapped = true;
		for (int h = 0; h < a.length && swapped; h++) {
			swapped = false;
			for (int i = 0; i < a.length - h - 1; i++) {
				if (a[i] > a[i+1]) {
					swap(a, i, i+1);
					swapped = true;
				}
			}
		}
	}

}
