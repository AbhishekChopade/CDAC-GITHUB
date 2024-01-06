package tester;

import com.app.exceptions.StackHandlingException;
import com.app.questack.QueueUsingStack;

public class TestQueue {

	public static void main(String[] args) throws StackHandlingException {
		QueueUsingStack<Integer> queue = new QueueUsingStack<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.display();
		queue.denQueue();
		queue.display();
		queue.enQueue(6);
		queue.enQueue(7);
		queue.display();
		
	}

}
