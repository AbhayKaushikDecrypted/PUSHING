
public class StackUsingQueuesPushEfficient {
	Queues dq;
	Queues hq;

	// Push EFFICIENT
	public StackUsingQueuesPushEfficient(int cap) {
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
	 dq.enqueue(val);
		}
	
	public int pop() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		}
		while (dq.size()>1) {
			hq.enqueue(dq.dequeue());
		}
		dq.dequeue();
		
		while (hq.isEmpty() == false) {
			dq.enqueue(hq.dequeue());
		}
	}
	
	public int top() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		}
		while (dq.size()>1) {
			hq.enqueue(dq.dequeue());
		}
		
		while (dq.size()>1) {
			hq.enqueue(dq.dequeue());
		}
		
		while (hq.isEmpty() == false) {
			dq.enqueue(hq.dequeue());
		}
		
		
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
