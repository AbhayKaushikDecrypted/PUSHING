import java.util.Scanner;

public class Recursion_34K_Concatnations {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		inputs(N);
	}

	private static void inputs(int N) {
		if (N == 0) {
			return;
		}
		int n = scn.nextInt();
		int k = scn.nextInt();
		int[] arr = new int[n];
		arr = arrayinput(arr, n, 0);
		int[] arr1 = new int[n * k];
		arr1 = matrix(arr, n, k, 0, 0, arr1);
		long sum = KADANESALGORITHM(arr1, 1, arr[0], arr[0]);
		System.out.println(sum);
		inputs(N - 1);
	}

	private static int[] arrayinput(int[] arr, int n, int vindex) {
		if (vindex == n) {
			return arr;
		}
		arr[vindex] = scn.nextInt();
		return arrayinput(arr, n, vindex + 1);

	}

	private static int[] matrix(int[] arr, int n, int k, int vindex, int mindex, int[] arr1) {
		if (mindex == arr.length) {
			mindex = 0;
		}
		if (vindex == arr1.length) {
			return arr1;
		}
		arr1[vindex] = arr[mindex];
		return matrix(arr, n, k, vindex + 1, mindex + 1, arr1);
	}

	private static long KADANESALGORITHM(int[] arr, int vindex, long csum, long osum) {
		if (vindex == arr.length) {
			return osum;
		}
		if (arr[vindex] > 0 && csum >= 0) {
			csum = csum + arr[vindex];
		} else {
			csum = arr[vindex];
		}
		if (csum > osum) {
			osum = csum;
		}
		return KADANESALGORITHM(arr, vindex + 1, csum, osum);

	}
}
