import java.util.Scanner;

public class Recursion_6CheckSortedArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sorted(arr, 0);
		scn.close();
	}

	private static void sorted(int[] arr, int vindex) {
		if (vindex == arr.length - 1) {
			System.out.println(true);
			return;
		}
		if (arr[vindex] > arr[vindex + 1]) {
			System.out.println(false);
			return;
		} else {
			sorted(arr, vindex + 1);
		}
	}

}
