
//public interface ICircularQueue {
//	
//	// Add the given element at the REAR of the queue
//	// Returns false if queue is full otherwise true is returned
//	boolean add(String element);
//	
//	// Remove element from the FRONT of the queue
//	// Returns null if the queue is empty
//	String remove();
//	
//	// Returns the total number of elements stored in the queue
//	// Returns 0 if the queue is empty
//	int size();
//	
//	// Returns comma separated elements from FRONT to REAR
//     // Returns empty string if queue is empty
//	String toString();
//}

package com.app.queue;

import exceptions.QueueHandlingException;

public class CircularQueue {
	String[] queue;
	int rear;
	int front;
	int size;
	
	public CircularQueue(int s) {
		size = s;
		front = -1;
		rear = -1;
		queue = new String[size];
	}
	
	public boolean isEmpty() {
		return (front==-1 && rear==front);
	}
	
	public boolean isFull() {
		return(front==(rear+1)%size);
	}
	
	public boolean add(String element) {
		if(isFull()) {
			return false;
		}else {
			rear = (rear+1)%size;
			queue[rear] = element;
			if(front==-1) {
				front = 0;
			}
			return true;
		}
	}
	
	public String remove() throws QueueHandlingException {
		String val;
		if(isEmpty()) {
			return null;
		}else {
			if(front==rear) {
				val = queue[front];
				queue[front] = null;
				front = -1;
				rear = -1;
				return val;
			}
			val = queue[front];
			queue[front] = null;
			front = (front+1)%size;
			return val;
		}
	}
	
	public void Display() {
		if(isEmpty()) {
			System.out.println("Empty");
		}else {
			int i = front;
			int cnt = 0;
			while(cnt<size) {
				System.out.print(queue[i]+" -> ");
				i = (i+1)%size;
				cnt++;
			}
		}
	}
	
	public int size() {
		if(isEmpty()) {
			return 0;
		}else {
			int cnt = 0;
			int elemCnt = 0;
			int i = front;
			while(cnt<size) {
				if(queue[i] != null) {
					++elemCnt;
					i =(i+1)%size;
				}
				++cnt;
			}
				
			return elemCnt;
			//return (size + rear - front) % size + 1;
		}
		
	}
	
	public String toString() {
		if(isEmpty()) {
			return " ";
		}else {
			String queElems = "";
			String allElems = "";
			int cnt = 0;
			int i = front;
			while(cnt<size) {
				queElems = queue[i] + ", ";
				allElems+=queElems;
				i = (i+1)%size;
				++cnt;
			}
			return allElems;
		}
	}
}
