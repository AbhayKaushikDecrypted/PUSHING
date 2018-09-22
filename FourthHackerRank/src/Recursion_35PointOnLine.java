import java.util.Scanner;

public class Recursion_35PointOnLine {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] arr = new int[N * 2];
		arr = inputs(arr, 0);
		boolean res1 = horizontal(arr, 2, arr[0],false);
		boolean res2 = vertical(arr, 3, arr[1],false);
		if ((res1 || res2) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static int[] inputs(int[] arr, int vindex) {
		if (vindex == arr.length) {
			return arr;
		}
		arr[vindex] = scn.nextInt();
		return inputs(arr, vindex + 1);
	}

	private static boolean horizontal(int[] arr, int vindex, int value,boolean res) {
		if (vindex == arr.length - 2) {
			return res;
		}
		if (arr[vindex] == value) {
			res = true;
			return horizontal(arr, vindex + 2, value,res);
		} else {
			res = false;
			return res;
		}
	}

	private static boolean vertical(int[] arr, int vindex, int value, boolean res) {
		if (vindex == arr.length - 2) {
			return res;
		}
		if (arr[vindex] == value) {
			res = true;
			return vertical(arr, vindex + 2, value, res);
		} else {
			res = false;
			return res;
		}
	}
}
