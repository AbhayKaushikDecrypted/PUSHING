
public class Stacks {
	protected int[] data; // parsing means assigning the values to data we
						// created thus replacing the default values given
						// by constructor itself
	protected int tos = -1;

	public Stacks(int cap) {
		this.data = new int[cap]; // this is constructor name same as class
									// every function we write is under the
									// class we
									// defined
	}

	public int size() {
		return tos + 1;
	}

	public boolean isFull() {
		if (tos == data.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (tos == -1) {
			return true;
		}
		return false;
	}

	public void push(int val) {
		if (isFull() == true) {
			System.out.println("stack is full");
			return;
		} else {
			tos++;
			data[tos] = val;
		}
	}

	public int pop() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		} else {
			int val = data[tos];
			data[tos] = 0;
			tos--;
			return val;
		}

	}

	public int top() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		}

		return data[tos];
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i] + " ");
		}
		System.out.println();
	}

}
