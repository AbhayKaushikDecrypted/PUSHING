
public class DynamicQueues extends Queues {

	public DynamicQueues(int cap) {
		super(cap);
	}

	public void enqueue(int val) {
		if (isFull() == true) {
			int[] oldarray = data;
			data = new int[2 * oldarray.length];
			for (int i = 0; i < oldarray.length; i++) {
				data[i] = oldarray[(front + i) % oldarray.length];
			}
			front = 0;
		}
		super.enqueue(val);
	}
	
}
