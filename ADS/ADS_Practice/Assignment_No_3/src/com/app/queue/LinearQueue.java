package com.app.queue;

import customexception.QueueHandlingException;

public class LinearQueue {
		int[] queue;
		int rear;
		int front;
		int size;
		
		public LinearQueue(int s){
			rear=-1;
			front=-1;
			size=s;
			queue = new int[size];
		}
		
		public boolean isEmpty() {
			return rear==-1;
		}
		
		public boolean isFull() {
			return rear==(size-1);
		}
		
		public void add(int data) throws QueueHandlingException {
			if(isFull()) {
				throw new QueueHandlingException("Queue is full");
			}
			
			if(front==-1) {
				front = 0;
			}
			rear++;
			queue[rear]=data;
			
		}
		
		public int getCount() {
			int cnt = 0;
			  for (int i = front; i <=rear; i++) {
				  if(queue[i]!=0)
					  cnt++;
	          }
			return cnt;
		}
		public int remove() throws QueueHandlingException {
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			int value = queue[0];
			for(int i =front;i<rear;i++) {
				queue[i]=queue[i+1];
			}
			rear--;
			return value;
		}
		
		public int peek() throws QueueHandlingException {
			if(isEmpty()) {
				throw new QueueHandlingException("Queue is empty");
			}
			int value = queue[0];
			
			return value;
		}
		
		public void display() {
		
	        for (int i = front; i <=rear; i++) {

	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
		}

}
