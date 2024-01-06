package com.app.stack;

public class StackUsingArray {
	  private static final int MAX_SIZE = 10;
	  private int[] stack;
	  private int top;
	
	  public StackUsingArray() {
	    stack = new int[MAX_SIZE];
	    top = -1;
	  }
	
	  public void push(int data) {
	    if (top == MAX_SIZE - 1) {
	      System.out.println("Stack is full");
	      return;
	    }
	
	    top++;
	    stack[top] = data;
	  }
	
	  public int pop() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	      return -1;
	    }
	
	    int data = stack[top];
	    top--;
	    return data;
	  }
	
	  public void displayStack() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	      return;
	    }
	
	    for (int i = top; i >= 0; i--) {
	      System.out.println(stack[i]);
	    }
	  }
	
	  public boolean isStackFull() {
	    return (top == MAX_SIZE - 1);
	  }
	
	  public boolean isStackEmpty() {
	    return top == -1;
	  }
	
	  public int countElements() {
	    return top + 1;
	  }
}
