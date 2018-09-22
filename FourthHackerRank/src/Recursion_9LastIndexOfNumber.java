import java.util.Scanner;

public class Recursion_9LastIndexOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int trg = scn.nextInt();
		int res = find(arr, 0, trg);
		System.out.println(res);
		scn.close();
	}

	private static int find(int[] arr, int vindex, int trg) {
		if (vindex == arr.length) {
			return -1;
		}
		int res = find(arr, vindex + 1, trg);

		if (res != -1) {
			return res;
		} else {
			if (arr[vindex] == trg) {
				return vindex;
			} else {
				return res;
			}
		}
	}
}
