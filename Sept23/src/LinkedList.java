
public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addlast(int val) {
		// create a node
		Node n = new Node();

		// define node features

		n.data = val;
		n.next = null;
		// linking to previous node and changing in linked list
		if (size > 0) {

			tail.next = n;
			tail = n;
		} else {
			head = n;
			tail = n;

		}
		// increasing the size
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public int getFirst() {
		if (size > 0) {
			return head.data;
		}
		System.out.println("index out of bound");
		return -1;
	}

	public int getLast() {
		if (size > 0) {
			return tail.data;
		}
		System.out.println("index out of bound");
		return -1;
	}

	public int getAt(int index) {

		if (index < 0 || index >= size) {
			System.out.println("LL out of bound index");
			return -1;
		}
		Node temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		return temp.data;

	}

	public void addfirst(int val) {
		Node n = new Node();
		n.data = val;
		if (size > 0) {
			n.next = head;
			head = n;
		} else {
			head = n;
			tail = n;
		}
		size++;
	}

	public int removefirst() {
		int n = head.data;

		if (size == 0) {
			System.out.println("index out of bound");
			return -1;
		} else if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
		}
		size--;
		return n;
	}

	private Node getnodeat(int index) {
		if (index < 0 || index >= size) {
			System.out.println("LL out of bound index");
			return null;
		}
		Node temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		return temp;

	}

	public int removelast() {
		int r;
		if (size == 0) {
			System.out.println("index out of bound");
			return -1;
		} else if (size == 1) {
			r = tail.data;
			head = null;
			tail = null;
			size--;
			return r;
		}

		else {
			r = tail.data;
			Node n = getnodeat(size - 2);
			tail = n;
			n.next = null;
			size--;
			return r;
		}
	}

	public void addat(int index, int data) {
		if (index < 0 || index > size) {
			System.out.println("index out of bound");
			return;
		}

		else if (index == 0) {
			addfirst(data);
			return;
		}

		else if (index == size) {
			addlast(data);
			return;
		}

		else {
			Node n = new Node();
			Node n1 = getnodeat(index - 1);
			n.data = data;
			n.next = n1.next;
			n1.next = n;
			size++;

		}
	}

	public int removeat(int index) {
		if (index < 0 || index >= size) {
			System.out.println("index out of bound");
			return -1;
		}

		else if (index == 0) {
			return removefirst();

		}

		else if (index == size - 1) {
			return removelast();
		}

		else {
			Node nm1 = getnodeat(index - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			size--;
			return n.data;
		}
	}

	public void reversedataiterative() {
		for (int i = size - 1; i >= size / 2; i--) {
			Node last = getnodeat(i);
			Node first = getnodeat(size - 1 - i);
			int temp = last.data;
			last.data = first.data;
			first.data = temp;
		}
	}

	public void reversepointeriterative() {
	
	}
}
