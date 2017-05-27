package ds.Queue;

public class App {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.insert(2);
		q.insert(3);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		q.insert(8);
		System.out.println("Item removed: "+q.remove());
		q.view();

	}

}
