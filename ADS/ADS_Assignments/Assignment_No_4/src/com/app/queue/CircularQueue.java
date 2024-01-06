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
			int value;
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			if(front==rear) {
				value = queue[front];
				front = -1;
				rear = -1;
				return value;
			}
			value = queue[front];
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
		
		public int getCount() throws QueueHandlingException {
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			int cnt = 0;
			int i = front;
			int elemCnt = 0;
			while(cnt<size) {
				if(queue[i]!=0) {
	        	  i = (i+1)%size;
	        	 ++elemCnt;
				}
				cnt++;
	        }
			return elemCnt;
		}
		public void display() throws QueueHandlingException {
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
	        int cnt = 0;
	        int i = front;
	        while(cnt<size) {
	        	System.out.print(queue[i]+" ");
	        	i = (i+1)%size;
	        	cnt++;
	        }

	        System.out.println();
		}
}
