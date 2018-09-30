
public class Queuesclient {

	public static void main(String[] args) {
		Queues qu = new DynamicQueues(5);
		int n = qu.size();
		System.out.println(n);
		qu.enqueue(10);
		qu.display();
		qu.enqueue(20);
		qu.display();
		qu.enqueue(30);
		qu.display();
		qu.enqueue(40);
		qu.display();
		qu.enqueue(50);
		qu.display();
		System.out.println(qu.isFull());

		String str = new String();
		str = "just to test the string FUNCTION string()";
		System.out.println(str);

		qu.dequeue();
		qu.display();
		qu.dequeue();
		qu.display();

		qu.enqueue(60);
		qu.display();
		qu.enqueue(70);
		qu.display();
		System.out.println(qu.isFull());
		qu.enqueue(80);
		qu.display();
		System.out.println(qu.isFull());

		int n1 = qu.size();
		System.out.println(n1);

	}

}
