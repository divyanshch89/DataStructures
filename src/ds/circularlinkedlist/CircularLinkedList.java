package ds.circularlinkedlist;

public class CircularLinkedList {
	Node first;
	Node last;

	public CircularLinkedList() {

		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty())
			last = newNode;
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}

	public int removeFirst() {
		int temp = first.data;
		first = first.next;
		return temp;
	}

	public void displayList() {
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}

	}
}
