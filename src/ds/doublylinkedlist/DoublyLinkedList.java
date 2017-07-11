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

	public boolean insertAfter(int key, int data) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null)
				return false;
		}
		Node newNode = new Node();
		newNode.data = data;
		if (current == last) {
			current.next = null;
			last = newNode;
		} else {

			newNode.next = current.next;
			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
		return true;
	}

	// assume non-empty list
	public Node deleteKey(int key) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == last)
				return new Node();
		}
		if (current == first) {
			first = first.next;
		} else {
			current.previous.next = current.next;
			// current.next.previous = current.previous;
		}
		if (current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		return current;
	}
}
