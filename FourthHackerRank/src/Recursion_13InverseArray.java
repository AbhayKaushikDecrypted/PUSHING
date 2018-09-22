import java.util.Scanner;

public class Recursion_13InverseArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int n1 = scn.nextInt();
		int[] arr1 = new int[arr.length];
		arr1 = reverse(arr, 0, arr1);
		display(arr1);
		System.out.println();
		System.out.println(arr1[n1]);
		scn.close();
	}

	private static int[] reverse(int[] arr, int vindex, int[] arr1) {

		if (vindex == arr.length) {
			return arr1;
		}
		int temp = arr[vindex];
		arr1[temp] = vindex;
		arr1 = reverse(arr, vindex + 1, arr1);
		return arr1;
	}

	private static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
