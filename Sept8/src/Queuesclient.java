
public class Queuesclient {

	public static void main(String[] args) {
        Queues qu = new Queues(5);
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
        qu.enqueue(60);
        qu.display();
        
        System.out.println(qu.dequeue() + " removed");
		qu.display();
		System.out.println(qu.dequeue() + " removed");
		qu.display();
        
        qu.enqueue(60);
        qu.display();
        qu.enqueue(70);
        qu.display();
	}

}
