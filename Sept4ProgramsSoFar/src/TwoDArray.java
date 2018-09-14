import java.util.Scanner;

public class TwoDArray {
	static Scanner scn = new Scanner(System.in);
	static int counter = 0;

	public static void main(String[] args) {
		int[][] arr = ARRAYINPUT();
		// DISPLAY(arr);
		// System.out.println();
		// WAVEDISPLAY(arr);
		// System.out.println();
		// SPIRALDISPLAY(arr);
		// System.out.println();
		// ROTATE90(arr);
		// int[][] arr2 = ARRAYINPUT();
		// MULTIPLY(arr, arr2);
	}

	private static int[][] ARRAYINPUT() {
		System.out.println("enter row size and column size");
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	private static void DISPLAY(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void WAVEDISPLAY(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}

	private static void SPIRALDISPLAY(int[][] arr) {
		int rmin = 0;
		int rmax = arr.length - 1;
		int cmin = 0;
		int cmax = arr[0].length - 1;
		int tne = arr.length * arr[0].length;
		while (counter < tne) {
			for (int i = rmin; i <= rmax; i++) {
				System.out.print(arr[i][cmin] + " ");
				counter++;
			}
			cmin++;
			for (int i = cmin; i <= cmax; i++) {
				System.out.print(arr[rmax][i] + " ");
				counter++;
			}
			rmax--;
			for (int i = rmax; i >= rmin; i--) {
				System.out.print(arr[i][cmax] + " ");
				counter++;
			}
			cmax--;
			for (int i = cmax; i >= cmin; i--) {
				System.out.print(arr[rmin][i] + " ");
				counter++;
			}
			rmin++;
		}

	}

	private static void ROTATE90(int[][] arr) {
		int[][] arr1 = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr1[0].length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[j][(arr1.length) - 2 - i] = arr[i][j];
			}
		}
		DISPLAY(arr1);
	}

	private static void MULTIPLY(int[][] arr1, int[][] arr2) {
		int[][] arr3 = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					arr3[i][j] = arr3[i][j] + (arr1[i][k] * arr2[k][j]);
				}
			}
		}
		DISPLAY(arr3);
	}
}
