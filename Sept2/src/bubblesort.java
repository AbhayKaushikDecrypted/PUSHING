
public class bubblesort {

	public static void main(String[] args) {
		// int[] arr = { 11, 55, 22, 33, 88 };
		// bubblesorting(arr);
		// display(arr);
		// int[] arr1 = { 10, 15, 18, 22, 27 };
		// int[] arr2 = { 5, 7, 16, 23, 28, 40, 50 };
		// int[] arr3 = merge(arr1, arr2);
		// display(arr3);
		// int[] arr = { 5, 2, 1, 4, 8, 9, -10 };
		// int[] arr3 = mergesort(arr, 0, arr.length - 1);
		// display(arr3);
		// int[] arr = { 2, 25, 10, 1, 18, 25, 17, 44 };
		// int pidx = pivoting(arr, arr[arr.length - 1],0,arr.length-1);
		// display(arr);
		// System.out.println();
		// System.out.println(pidx);
		// quicksort(arr, 0, arr.length - 1);
		// display(arr);
		// int[] arr = {0,1,1,0,1,0,1,1,1,1};
		int[] arr1 = { 1, 2, 2, 0, 1, 1, 0, 0, 1, 2, 0 };
		anoymoussort(arr1);
		display(arr1);

	}

	private static void anoymoussort(int[] arr1) {
		int z = 0; // 0 to z-1
		int o = 0; // z to o-1
		int t = 0; // o to t-1

		// unknown area from t to arr.length

		while (t <= arr1.length - 1) {
			if (arr1[t] == 2) {
				t++;
			} else if (arr1[t] == 1) {
				swap(arr1, t, o);
				t++;
				o++;
			} else if (arr1[t] == 0) {
				swap(arr1, t, o);
				t++;
				swap(arr1, z, o);
				o++;
				z++;
			}

		}

	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quicksort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int pivot = arr[high];
		int idx = pivoting(arr, pivot, low, high);
		quicksort(arr, low, idx - 1);
		quicksort(arr, idx + 1, high);
	}

	private static int pivoting(int[] arr, int pivot, int low, int high) {
		int i = low;
		int pidx = low;

		while (i <= high) {
			if (arr[i] > pivot) {
				i++;
			} else {
				swap(arr, i, pidx);
				i++;
				pidx++;
			}
		}
		return pidx - 1;
	}

	private static int[] mergesort(int[] arr, int start, int end) {
		if (start == end) {
			int[] ba = new int[1];
			ba[0] = arr[start];
			return ba;
		}

		int mid = (start + end) / 2;
		int[] l = mergesort(arr, start, mid);
		int[] r = mergesort(arr, mid + 1, end);
		int[] mergesorted = merge(l, r);
		return mergesorted;

	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int[] arr3 = new int[(arr1.length) + (arr2.length)];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				arr3[k] = arr2[j];
				k++;
				j++;
			} else {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
		}
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		return arr3;
	}

	private static void bubblesorting(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

}
