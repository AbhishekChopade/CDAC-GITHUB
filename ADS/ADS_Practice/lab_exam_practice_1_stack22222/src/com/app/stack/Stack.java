package com.app.stack;

import exceptions.StackHandlingException;

public class Stack {
	int[] stack;
	int[] minStack;
	int size;
	int top;
	int minTop;
	//int max;
	
	public Stack(int s) {
		size = s;
		stack = new int[size];
		minStack = new int[size];
		top = -1;
		minTop = -1;
		//max = 0;
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	public boolean isFull() {
		if(top==(size-1))
			return true;
		return false;
	}
	
	public void push(int val) throws StackHandlingException {
		if(isFull()) 
			throw new StackHandlingException("Stack is full");
//		else {
//			top++;
//			stack[++top]=val;
//			if(val>max)
//				max = val;
			
		if(isEmpty()) {
			stack[++top] = val;
			minStack[++minTop] = val;
		}else {
			if(val<minStack[minTop]) {
				stack[++top] = val;
				minStack[++minTop] = val;
			}else
				stack[++top] = val;
		}
	}
	
	public int pop() throws StackHandlingException {
		if(isEmpty()) 
			throw new StackHandlingException("Stack is empty");
		if(stack[top]==minStack[minTop]) {
			int data = stack[top];
			top--;
			minTop--;
			return data;
		}else {
			int data = stack[top];
			top--;
			return data;
		}
		
	}
	
	public int top() throws StackHandlingException {
		if(isEmpty()) {
			throw new StackHandlingException("Stack is empty");
		}else {
			int topVal = stack[top];
			return topVal;
		}
	}
	
	public int getMin() throws StackHandlingException {
		if(isEmpty()) 
			throw new StackHandlingException("Stack is empty");
		
		return minStack[minTop];
		
	}
	
	public void display() throws StackHandlingException {
		if(isEmpty()) {
			throw new StackHandlingException("Stack is empty");
		}else {
			
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]);
			}
			
		}
	}
	
	
}
