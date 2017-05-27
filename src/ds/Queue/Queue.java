package ds.Queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		this.maxSize = size;
		queueArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		if (rear == maxSize - 1)
			rear = -1;// if the queue is full reset the rear counter. This will
						// overwrite the values inserted in the queue
		// implementation of circular queue here
		rear++;
		queueArray[rear] = j;
		nItems++;
	}

	public void view() {
		System.out.print("[");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}

	public long remove() {
		long temp = queueArray[front];
		front++;
		if (front == maxSize - 1)
			front = 0;// reset it to begining of array
		nItems--;
		return temp;

	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}
}
