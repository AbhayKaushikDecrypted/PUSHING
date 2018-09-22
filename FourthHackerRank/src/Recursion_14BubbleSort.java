import java.util.Scanner;

public class Recursion_14BubbleSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		bubblesort(arr, 0, 0);
		display(arr);
		scn.close();
	}

	private static void bubblesort(int[] arr, int i, int j) {
		if (i == arr.length) {
			return;
		}
		if (j < arr.length - i - 1) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
			bubblesort(arr, i, j + 1);
		}
		bubblesort(arr, i + 1, 0);
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
