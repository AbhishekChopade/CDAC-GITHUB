package com.app.queue;

import customexception.QueueHandlingException;

public class CircularQueue {
		int[] queue;
		int rear;
		int front;
		int size;
		
		public CircularQueue(int s){
			rear=-1;
			front=-1;
			size=s;
			queue = new int[size];
		}
		
		public boolean isEmpty() {
			return (rear==-1&&front==rear);
		}
		
		public boolean isFull() {
			return (front==(rear+1)%size);
		}
		
		public void add(int data) throws QueueHandlingException {
			if(isFull()) {
				throw new QueueHandlingException("Queue is full");
			}
			
			rear = (rear+1)%size;
			queue[rear]=data;
			if(front==-1) {
				front = 0;
			}
			
		}
		
		public int remove() throws QueueHandlingException {
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			int value = queue[front];
			front = (front+1)%size;
			return value;
		}
		
		public int peek() throws QueueHandlingException {
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			int value = queue[front];
			
			return value;
		}
		
		public void display() throws QueueHandlingException {
//			System.out.println(front+" "+rear);
			int i = front;
			int count = 0;
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			
			while(count<size) {
			
				System.out.println(queue[i]+" ");
				i = (i+1)%size;
				count++;
			}
			
		}

}
