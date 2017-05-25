package ds.stack;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		stackArray = new char[maxSize];
		this.top = -1;
	}

	public void push(char j) {
		if (!isFull()) {
			top += 1;
			stackArray[top] = j;
		} else
			System.out.println("Stack is full");
	}

	public char pop() {
		if (!isEmpty()) {
			char result = stackArray[top];
			top -= 1;
			return result;
		} else {
			System.out.println("Stack is empty");
			return '0';
		}
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}
