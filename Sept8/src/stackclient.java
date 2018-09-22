
public class stackclient {

	public static void main(String[] args) {
		// boolean res1 = isBalanced("[a+{b+(c+d)+e}+f]");
		// boolean res2 = isBalanced("[a+{b+(c+d)+e)+f]");
		// boolean res3 = isBalanced("[a+{b+(c+d)+e}+f");
		// boolean res4 = isBalanced("a+{b+(c+d)+e}+f]");
		// System.out.println(res1);
		// System.out.println(res2);
		// System.out.println(res3);
		// System.out.println(res4);
		// boolean res1 = isDuplicate("(a+(b+(c+d)+e)+f)");
		// System.out.println(res1);
		// int[] arr = {30, 35, 40, 60, 50, 45, 48, 49, 55, 70, 20, 29, 35,
		// 30,20};
		// StockSpan(arr);
		// DI("diddidd");

		// Stacks st = new DnamicStack(5);
		StackUsingQueues st = new StackUsingQueues(5);
		st.push(10);
		st.display();
		st.push(20);
		st.display();
		st.push(30);
		st.display();
		st.push(40);
		st.display();
		st.push(50);
		st.display();
		st.push(60);
		st.display();

		System.out.println(st.pop() + " removed");
		System.out.println("remaining stack");
		st.display();
		System.out.println(st.pop() + " removed");
		System.out.println("remaining stack");
		st.display();
		System.out.println(st.pop() + " removed");
		System.out.println("remaining stack");
		st.display();
		System.out.println(st.pop() + " removed");
		System.out.println("remaining stack");
		st.display();
		System.out.println(st.pop() + " removed");
		System.out.println("remaining stack");
		st.display();
		System.out.println(st.pop() + " removed");
		System.out.println("remaining stack");
		st.display();

	}

	public static boolean isBalanced(String str) {
		boolean res;
		Stacks st = new Stacks(str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (st.size() == 0) {
					return false;
				}

				else if (str.charAt(i) == ')' && st.top() == '(') {
					System.out.println(st.pop() + " removed");
				} else if (str.charAt(i) == '}' && st.top() == '{') {
					System.out.println(st.pop() + " removed");
				} else if (str.charAt(i) == ']' && st.top() == '[') {
					System.out.println(st.pop() + " removed");
				} else {
					return false;
				}
			}
		}

		if (st.isEmpty() == true)

		{
			res = true;
		} else {
			res = false;
		}
		return res;
	}

	public static boolean isDuplicate(String str) {
		Stacks st = new Stacks(str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ')') {
				if (st.top() == '(') {
					return true;
				} else {
					while (st.top() != '(') { // remove it until we got its
												// match

						System.out.println(st.pop() + " removed"); // here we
																	// are
																	// removing
																	// Alphabets
																	// and
																	// operators
					}
					System.out.println(st.pop() + " removed");
				}

			} else {
				st.push(ch);
			}
		}
		return false;
	}

	public static void StockSpan1() {
		int[] arr = { 30, 35, 40, 60, 50, 45, 8, 49, 55, 70, 30, 29, 35, 30, 20 };
		int[] arr1 = new int[arr.length];
		arr1[0] = 1;
		int j = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] > arr[i]) {
				arr1[i + 1] = i + 2;
				j = i;
			} else {
				arr1[i + 1] = i - j;

			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

	public static void StockSpan(int[] arr) {
		int[] arr1 = new int[arr.length];
		Stacks st1 = new Stacks(arr.length);
		arr1[0] = 1;
		st1.push(0);
		for (int i = 1; i < arr.length; i++) {

			while (st1.isEmpty() == false && arr[st1.top()] < arr[i]) {
				st1.pop();
			}

			if (st1.isEmpty() == true) {
				arr1[i] = i + 1;
			} else {
				arr1[i] = i - (st1.top());
			}
			st1.push(i);
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

	public static void DI(String s) {
		int counter = 1;
		Stacks st = new Stacks(s.length() + 1);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'd') {
				st.push(counter);
				counter++;
			} else {
				st.push(counter);
				counter++;
				while (st.isEmpty() == false) {
					System.out.print(st.pop());
				}
			}

		}
		st.push(counter); // for greater than string.length
		while (st.isEmpty() == false) {
			System.out.print(st.pop());
		}

	}
}
