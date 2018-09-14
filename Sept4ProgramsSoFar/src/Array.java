import java.util.Scanner;

public class Array {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		int[] arr = ARRAYINPUT();
		// { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100,110 };
		// MAXARRAY(arr,1,arr[0]);
		// LINEARSEARCH(arr, 0, 88);
		// BINARYSEARCH(arr, 0, arr.length - 1, 50);
		// arr = REVERSEANARRAY(arr, 0,0,arr.length-1);
		// DISPLAY(arr, 0,arr.length-1);
		// arr = REVERSEBY3(arr, 3); // do that once again
		// DISPLAY(arr, 0, arr.length - 1);
		// DISPLAY(arr, 0,arr.length-1);
		// INVERSE(arr);
		// boolean res = ISMIRRORINVERSE(arr);
		// System.out.println(res);
		// SUBARRAYS(arr); // REMEMBER THE DEFINATION
		// MAXSUBARRAYSUM(arr);
		// System.out.println();
		// KADANESALGORITHM(arr);

	}

	private static int[] ARRAYINPUT() {
		System.out.println("enter size");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	private static void DISPLAY(int[] arr, int start, int end) {
		if (start > end) {
			return;
		}
		System.out.print(arr[start] + " ");
		DISPLAY(arr, start + 1, end);
	}

	private static void MAXARRAY(int[] arr, int vindex, int max) {
		if (vindex == arr.length) {
			System.out.println(max);
			return;
		}
		if (arr[vindex] > max) {
			MAXARRAY(arr, vindex + 1, arr[vindex]);
		} else {
			MAXARRAY(arr, vindex + 1, max);
		}

	}

	private static void LINEARSEARCH(int[] arr, int vindex, int data) {
		if (vindex == arr.length) {
			System.out.println("data not present");
			return;
		}
		if (data == arr[vindex]) {
			System.out.println("data present at " + vindex);
		} else {
			LINEARSEARCH(arr, vindex + 1, data);
		}
	}

	private static void BINARYSEARCH(int[] arr, int start, int end, int data) {
		int mid = (start + end) / 2;
		if (data == arr[mid]) {
			System.out.println("data present at " + mid);
			return;
		}

		if (data > arr[mid]) {
			BINARYSEARCH(arr, mid + 1, end, data);
		} else {
			BINARYSEARCH(arr, start, mid - 1, data);
		}
	}

	private static int[] REVERSEANARRAY(int[] arr, int vindex, int start, int end) {
		if (vindex == (start + end) / 2) {
			return arr;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		arr = REVERSEANARRAY(arr, vindex + 1, start + 1, end - 1);
		return arr;
	}

	private static int[] REVERSEBY3(int[] arr, int data) {
		arr = REVERSEANARRAY(arr, 0, 0, arr.length - 1 - data);
		arr = REVERSEANARRAY(arr, arr.length - data, arr.length - data, arr.length - 1);
		arr = REVERSEANARRAY(arr, 0, 0, arr.length - 1);
		return arr;
	}

	private static void INVERSE(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr1[temp] = i;
		}
		DISPLAY(arr1, 0, arr.length);
	}

	private static boolean ISMIRRORINVERSE(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (arr[temp] != i) {
				return false;
			}
		}
		return true;
	}

	private static void SUBARRAYS(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				DISPLAY(arr, i, j);
				System.out.println();
			}
		}
	}

	private static int subarray(int[] arr, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	private static void MAXSUBARRAYSUM(int[] arr) {
		int csum = 0;
		int csumst = 0;
		int csumend = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = subarray(arr, i, j);
				if (csum < sum) {
					csum = sum;
					csumst = i;
					csumend = j;
				}
			}
		}
		System.out.println(csum);
		DISPLAY(arr, csumst, csumend);
	}

	private static void KADANESALGORITHM(int[] arr) {
		int csum = arr[0];
		int osum = arr[0];
		int cend = 0;
		int cstart = 0;
		int ostart = 0;
		int oend = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= 0) {
				csum = csum + arr[i];
				cend++;
			} else {
				csum = arr[i];
				cstart = cend = i;
			}
			if (csum > osum) {
				osum = csum;
				ostart = cstart;
				oend = cend;
			}
		}
		System.out.println(osum);
		DISPLAY(arr, ostart, oend);

	}
}