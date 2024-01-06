package tester;

import com.app.stack.MyStack;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<Integer>();
		myStack.push(10);
		myStack.push(7);
		myStack.push(1);
		myStack.push(15);
		myStack.push(77);
		myStack.push(11);
		myStack.display();
		myStack.pop();
		myStack.pop();
		myStack.display();
		myStack.push(99);
		myStack.pop();
		myStack.display();
	}
}
