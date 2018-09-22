import java.util.Scanner;

public class Recursion_8IndexOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int trg = scn.nextInt();
		find(arr, 0, trg);
		scn.close();
	}

	private static void find(int[] arr, int vindex, int trg) {
		if (vindex == arr.length) {
			System.out.println("-1");
			return;
		}
		if (arr[vindex] == trg) {
			System.out.println(vindex);
			return;
		} else {
			find(arr, vindex + 1, trg);
		}
	}
}
