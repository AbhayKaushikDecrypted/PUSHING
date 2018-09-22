import java.util.Scanner;

public class Recursion_11Palindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no.");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		boolean res = palindrome(arr, 0);
		System.out.println(res);
		scn.close();
	}

	private static boolean palindrome(int[] arr, int vindex) {
		if (vindex == arr.length/2) {
			return true;
		}
		if (arr[vindex] == arr[arr.length - 1 - vindex]) {
			return palindrome(arr, vindex + 1);
		}
		return false;
	}

}
