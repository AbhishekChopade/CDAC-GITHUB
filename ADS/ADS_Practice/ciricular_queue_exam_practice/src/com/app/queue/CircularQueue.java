package com.app.queue;

public class CircularQueue {
	
	private int arr[];
	private int size;
	private int rear;
	private int front;

	public CircularQueue(int s) {
		size = s;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		return (rear==-1 && rear == front);
	}
	public boolean isFull() {
		return (front == (rear+1)%size);
	}
	public void enQueue(int val) {
		if(isFull()) {
			throw new RuntimeException("Queue is full");
		}
		
		if(front==-1)
			front = 0;
		
		rear = (rear+1)%size;
		arr[rear] = val;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		int val = arr[front];
		front = (front+1)%size;
		return val;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		return arr[front];
	}
	public void display() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		int cnt = 0;
		int i = front;
		while(cnt<size) {
			System.out.print(arr[i]+", ");
			i = (i+1)%size;
			cnt++;
		}
		System.out.println();
	}
	
	public int getCount() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		
		int cnt = 0;
		int i = front;
		int presentElem = 0;
		while(cnt<size) {
			if(arr[i]!=0) {
				i = (i+1)%size;
				presentElem++;
			}
			cnt++;
		}
		//return presentElem;
		return (size+rear-front)%size+1;
	}
	
}
