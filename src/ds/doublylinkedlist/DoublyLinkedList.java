package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty())
			last = newNode;
		else {
			first.previous = newNode;
			newNode.next = first;
		}
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty())
			first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	// assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) {
			// only 1 item
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	// assume Non-empty list
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) {
			// only 1 item
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;

	}
}
