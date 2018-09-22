import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Recursion_33DaysInMonth {
	static Scanner scn = new Scanner(System.in);
	static String[] arr = { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };

	public static void main(String[] args) {
		int n = scn.nextInt();
		inputs(n);
	}

	private static void inputs(int n) {
		if (n == 0) {
			return;
		}
		int days = scn.nextInt();
		String s = scn.next();
		int quo = days / 7;
		int rem = days % 7;
		int[] arr1 = new int[7];
		Arrays.fill(arr1, quo);
		if (rem != 0) {
			arr1 = day(arr, arr1, s, 0, 0, quo, rem);
		}
		display(arr1);
		System.out.println();
		inputs(n - 1);
	}

	private static int[] day(String[] arr, int[] arr1, String s, int vindex, int bindex, int quo, int rem) {
		if (vindex >= 7 && rem==0) {
			return arr1;
		}
		if (arr[vindex%7].equals(s) || rem==0) {
			bindex = vindex;
		}
		if (arr[bindex%7].equals(s)) {
			arr1[vindex%7]++;
			rem = rem-1;
		}

		return day(arr, arr1, s, vindex + 1, bindex, quo, rem);
	}

	private static void display(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
