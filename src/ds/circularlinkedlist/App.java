package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(20);
		list.insertLast(100);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.removeFirst();
		list.displayList();
	}

}
