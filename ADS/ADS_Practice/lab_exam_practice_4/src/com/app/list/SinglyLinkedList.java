package com.app.list;

import java.util.List;

import com.app.list.SinglyLinkedList.Node;

import exceptions.LinkedListHandlingException;

public class SinglyLinkedList {
	
	static class Node{
		Node next;
		int data;
		
		public Node() {
			this.next = null;
			this.data = 0;
		}
		
		public Node(int data) {
			this.next = null;
			this.data = data;
		}
			
	}

	Node head;
	
	
	public SinglyLinkedList() {
		this.head = null;
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
	
	
	//find(X) – Returns the position of X in the list. Returns -1 if X does not exists in the list. 
	public int find(int val) throws LinkedListHandlingException {
		if (isEmpty())
			throw new LinkedListHandlingException("Linked list in empty");
		
		Node trav = head;
		int pos = 0;
		while(trav!=null) {
			if(trav.data==val)
				return pos;
			trav = trav.next;
			++pos;
		}
		return -1;
	}
	
	//toString() — Returns comma separated elements from start to end
	public String toString() {
		if(isEmpty()) {
			return "List is empty ";
		}
		else{
			Node trav = head;
			String str ="";
			String allStr = "";
			while(trav!=null) {
				str = trav.data+", ";
				allStr +=str;
				trav = trav.next;
			}
			return allStr;
		}
	}
	
	public boolean isSorrted() throws LinkedListHandlingException {
		if (isEmpty())
			throw new LinkedListHandlingException("Linked list in empty");
		
		Node trav = head;
		while(trav.next!=null) {
			if(trav.data<=trav.next.data) {
				trav = trav.next;
			}else
				return false;
		}
		
		return true;
	}
	
	
}
