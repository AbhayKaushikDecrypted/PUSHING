import java.util.Scanner;

public class Recursion_12ReverseOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int n1 = scn.nextInt();
		arr = reverse(arr, 0);
		display(arr);
		System.out.println();
		System.out.println(arr[n1]);
		scn.close();
	}

	private static int[] reverse(int[] arr, int vindex) {
		if (vindex == (arr.length) / 2) {
			return arr;
		}
		int temp = arr[vindex];
		arr[vindex] = arr[arr.length - 1 - vindex];
		arr[arr.length - 1 - vindex] = temp;
		arr = reverse(arr, vindex + 1);
		return arr;
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
