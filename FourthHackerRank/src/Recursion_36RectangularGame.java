import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_36RectangularGame {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		int N = scn.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		int[] arr1 = new int[N * 2];
		arr1 = inputs(arr1, 0);
		arr = matrix(arr, arr1, 0);
		// DISPLAY(arr);
		int max = MAXVALUE(arr);
		// System.out.println(max);
		timesmaxoccurs(max, arr);
		System.out.println(counter);

	}

	private static void timesmaxoccurs(int max, int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == max) {
					counter++;
				}
			}
		}
	}

	private static int MAXVALUE(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	private static int[] inputs(int[] arr, int vindex) {
		if (vindex == arr.length) {
			return arr;
		}
		arr[vindex] = scn.nextInt();
		return inputs(arr, vindex + 1);
	}

	private static int[][] matrix(ArrayList<ArrayList<Integer>> arr, int[] arr1, int vindex) {
		if (vindex >= arr1.length - 1) {
			return arr;
		}
		int temp = arr1[vindex];
		int temp2 = arr1[vindex + 1];
		rowsandcolwork(temp, temp2, arr);
		return matrix(arr, arr1, vindex + 2);

	}

	private static void rowsandcolwork(int temp, int temp2, ArrayList<ArrayList<Integer>> arr) {
		for (int i = arr.size() - 1; i >= arr.size() - temp; i--) {
			for (int j = 0; j < temp2; j++) {
				arr[i][j]++;
			}
		}
	}

	private static void DISPLAY(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
