package com.app.stackll;

import com.app.exception.StackHandlingException;

public class StackUsingLinkedList {

	static class Node{
		Node next;
		int data;
		public Node() {
			next = null;
			data = 0;
		}
		
		public Node(int data) {
			next = null;
			this.data = data;
		}
	}
	
	private Node head;

	public StackUsingLinkedList() {
		head = null;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void push(int a) { //addfirst
		Node newNode = new Node(a);
		if(isEmpty()) {
			head = newNode;
			System.out.println(a +" elem is added at first position.");
		}
		else {
			
//			Node trav = head;
//			while(trav.next!=null) {
//				trav = trav.next;
//				
//			}
			newNode.next = head;
			head = newNode;
			System.out.println(a +" elem is added.");
		}
	}
	
	
	public void pop() throws StackHandlingException {//delfirst
		if(isEmpty()) 
			throw new StackHandlingException("Stack is empty");
		
		if(head.next==null) {
			head = null;
			System.out.println("List has only 1 elem and first elem is removed.");
		}
		else {
			//Node trav = head;
			head = head.next;
			System.out.println("First elem is removed");
		}
	}
	
	public void display() throws StackHandlingException {
		if(isEmpty()) 
			throw new StackHandlingException("Stack is empty");
		
		Node trav = head;
		while(trav!=null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
