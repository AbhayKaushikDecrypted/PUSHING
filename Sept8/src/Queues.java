
public class Queues {
	protected int[] data;
	protected int front = 0; // parsing means assigning the values to data we
								// created thus replacing the default values
								// given
								// by constructor itself
	protected int size = 0;

	public Queues(int cap) { // this is constructor name same as class
								// every function we write is under the class we
								// defined
		this.data = new int[cap];
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (size() == data.length) {
			return true;
		}
		return false;
	}

	public void enqueue(int val) {
		if (isFull()) {
			System.out.println("queue is full");
			return;
		}
		int rear = (front + size) % data.length;
		data[rear] = val;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int val = data[front];
		data[front] = 0;
		size--;
		front = (front + 1) % data.length;
		return val;
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return data[front];
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[(front + i) % data.length] + " ");
		}
		System.out.println();
	}
}
