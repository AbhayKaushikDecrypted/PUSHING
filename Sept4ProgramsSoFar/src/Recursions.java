
public class Recursions {

	public static void main(String[] args) {
		// printDecreasing(5);
		// pdiSkip2(8);
		// printTwoCalls(3);
		toh(3, "a", "b", "c");
		// System.out.println(Factorial(5));
		// System.out.println(Power(2, 5));
		// System.out.println(PowerSmart(2, 11));
		// System.out.println(Fib(10));
		int[] arr = { 4, 5, 3, 9, 77, 22, 52, 9, 63 };
		// displayR(arr, 0);
		System.out.println(max(arr, 0));
	}

	// E -> PD(5) - > 5 4 3 2 1
	// F -> PD(4) - > 4 3 2 1
	// HL -> PD(5) - > 5 PD(4)
	public static void printDecreasing(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		printDecreasing(n - 1);
	}

	public static void printIncreasing(int n) {
		if (n == 0) {
			return;
		}

		printIncreasing(n - 1);
		System.out.println(n);
	}

	// 7 -> 7 5 3 1 2 4 6
	// 8 -> 7 5 3 1 2 4 6 8
	public static void pdiSkip(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 == 1) {
			System.out.println(n);
		}

		pdiSkip(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static void pdiSkip2(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 == 0) {
			pdiSkip2(n - 1);
			System.out.println(n);
		} else {
			System.out.println(n);
			pdiSkip2(n - 1);
		}
	}

	// 4 -> 4 3 2 1 1 2 3 4
	public static void printDecreasingIncreasing(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		printDecreasingIncreasing(n - 1);
		System.out.println(n);
	}

	// printTwoCalls(3)
	public static void printTwoCalls(int n) {
		if (n == 0) {
			return;
		}

		System.out.print("[" + n + "*");

		printTwoCalls(n - 1);

		System.out.print("+");

		printTwoCalls(n - 1);

		System.out.print("*" + n + "]");
	}

	public static void toh(int n, String src, String dest, String helper) {
		if (n == 0) {
			return;
		}

		toh(n - 1, src, helper, dest);
		System.out.println(src + n + dest);
		toh(n - 1, helper, dest, src);
	}
	
	public static int Factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int fnm1 = Factorial(n - 1);
		int fn = n * fnm1;

		return fn;
	}

	public static int Power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpnm1 = Power(x, n - 1);
		int xpn = xpnm1 * x;

		return xpn;
	}

	public static int PowerSmart(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpnb2 = Power(x, n / 2);
		int xpn = xpnb2 * xpnb2;

		if (n % 2 == 1) {
			xpn = xpn * x;
		}

		return xpn;
	}

	public static int Fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fibnm1 = Fib(n - 1);
		int fibnm2 = Fib(n - 2);
		int fn = fibnm1 + fibnm2;

		return fn;
	}

	public static void display(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		System.out.print(arr[vidx]);
		display(arr, vidx + 1);
	}

	public static void displayR(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		displayR(arr, vidx + 1);
		System.out.print(arr[vidx]);
	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length - 1) {
			return arr[vidx];
		}

		int misa = max(arr, vidx + 1);
		if (misa > arr[vidx]) {
			return misa;
		} else {
			return arr[vidx];
		}
	}

	public static boolean find(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}

		boolean fisa = find(arr, vidx + 1, data);
		if (fisa == true) {
			return true;
		} else {
			if (arr[vidx] == data) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean findSmart(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}

		if (arr[vidx] == data) {
			return true;
		} else {
			boolean fisa = findSmart(arr, vidx + 1, data);
			return fisa;
		}
	}

	public static int firstIndex(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == data) {
			return vidx;
		} else {
			int fisa = firstIndex(arr, vidx + 1, data);
			return fisa;
		}
	}

	public static int lastIndex(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}

		int fisa = lastIndex(arr, vidx + 1, data);
		if (fisa != -1) {
			return fisa;
		} else {
			if (arr[vidx] == data) {
				return vidx;
			} else {
				return -1;
			}
		}

	}
	
	
	
}

