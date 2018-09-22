import java.util.Scanner;

public class Recursion_10AllIndexOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int trg = scn.nextInt();
		int index = scn.nextInt();
		int[] arr1 = new int[arr.length];
		arr1 = allindex(arr, 0, trg, arr1, 0);
		System.out.println(arr1[index]);
		scn.close();
	}

	private static int[] allindex(int[] arr, int vindex, int trg, int[] arr1, int vindex1) {
		if (vindex == arr.length) {
			return arr1;
		}
		if (arr[vindex] == trg) {
			arr1[vindex1] = vindex;
			allindex(arr, vindex + 1, trg, arr1, vindex1 + 1);
		} else {
			allindex(arr, vindex + 1, trg, arr1, vindex1);
		}
		return arr1;
	}
}
