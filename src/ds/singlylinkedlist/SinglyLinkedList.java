package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;

	public SinglyLinkedList() {
	}

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert new node at the begining of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		// add last node here
		if (isEmpty())
			last = newNode;
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int data) {
		Node currentNode = first;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		// reached the last node
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}

	public void insertLastEfficient(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("Display from first --> last");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

}
