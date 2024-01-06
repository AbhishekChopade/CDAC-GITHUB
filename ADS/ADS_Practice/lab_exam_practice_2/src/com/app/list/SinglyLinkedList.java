package com.app.list;

import exceptions.LinkedListHandlingException;

public class SinglyLinkedList {
	public static class Node{
		Node next;
		int data;
		
		public Node() {
			this.next = null;
			this.data = 0;
		}
		
		public Node(int val) {
			this.next = null;
			this.data = val;
		}
		
	}

	private Node head;
	public SinglyLinkedList() {
		head=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void add(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
		}else {
			Node trav = head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next = newNode;
		}
		
	}
	
	public void add(int val,int pos) {
		Node newNode = new Node(val);
		if(isEmpty() || pos <=1) {
			newNode.next = head;
			head = newNode;
			
		}else {
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				if(trav.next==null)
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	
	public void remove(int elem) throws LinkedListHandlingException {
		if(isEmpty()) {
			throw new LinkedListHandlingException("Linked List is empty");
		}else {
		
			Node trav = head;
			Node temp = null;
			if(head.data == elem) {
				head = head.next;
			}else {
				while(trav.data!=elem) {
					temp = trav;
					trav = trav.next;
				}
				temp.next = trav.next;
			}
		}
	}
	
	public void list() throws LinkedListHandlingException {
		if(isEmpty()) {
			throw new LinkedListHandlingException("Linked List is empty");
		}else {
			Node trav = head;
			while(trav!=null) {
				System.out.print(trav.data+" -> ");
				trav = trav.next;	
			}
			System.out.println();
		}
		
	}
	
	public void reverse() throws LinkedListHandlingException {
		if(isEmpty()) {
			throw new LinkedListHandlingException("Linked List is empty");
		}else {
			Node oldHead = head;
			Node temp = null;
			head = null;
			
			while(oldHead!=null) {
				temp = oldHead;
				oldHead = oldHead.next;
				
				temp.next = head;
				head = temp;
			}
		}
	}
	
}
