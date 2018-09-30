public class StackUsingQueuesPopEfficient {
	Queues dq;
	Queues hq;

	// POP EFFICIENT
	public StackUsingQueuesPopEfficient(int cap) {
		dq = new Queues(cap);
		hq = new Queues(cap);
	}

	public int size() {
		return this.size();
	}

	public boolean isEmpty() {
		if (dq.isEmpty() == true) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (dq.isFull() == true) {
			return true;
		}
		return false;
	}

	public void push(int val) {
		if (isFull() == true) {
			System.out.println("stack is full");
			return;
		}
		while (dq.isEmpty() == false) {
			hq.enqueue(dq.dequeue());
		}
		dq.enqueue(val);
		while (hq.isEmpty() == false) {
			dq.enqueue(hq.dequeue());
		}

	}

	public int pop() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		}
		return dq.dequeue();
	}

	public void top() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println(dq.front);
	}

	public void display() {
		dq.display();
	}

}
