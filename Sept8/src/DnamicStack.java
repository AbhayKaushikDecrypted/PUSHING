
public class DnamicStack extends Stacks {

	public DnamicStack(int cap) {
		super(cap);
	}

	public void push(int val) {
		if (isFull() == true) {
			int[] oldarray = data;
			data = new int[2 * oldarray.length];
			for (int i = 0; i < oldarray.length; i++) {
				data[i] = oldarray[i];
			}
		}
		super.push(val);
	}

}
