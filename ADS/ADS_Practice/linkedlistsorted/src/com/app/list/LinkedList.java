package com.app.list;

public class LinkedList{
	
	static class Node{
		private Node next;
		private int data;
		
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
		
	}
	
	private Node head;

	public LinkedList() {
	
		this.head = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void display() {
		System.out.println("LinkedList : ");
		Node trav = head;
		while(trav!=null) {
			System.out.print(trav.data+" -> ");
			trav = trav.next;
		}
		System.out.println("");
	}
	
//	public void addFirst(int val) {
//		Node newNode = new Node(val);
//		
//		newNode.next = head;
//		head = newNode;
//	}
	
	public void addSorted(int val) {
		Node newNode =  new Node(val);
		if(isEmpty()) {
			newNode.next = head; ///elem added first if empty
			head = newNode;
		}
		else if(val>head.data) {
			Node trav = head;
			Node temp = null;
			while(trav.next!=null&&val>trav.data) {
				temp = trav;
				trav = trav.next;
			}
			if(val>=temp.data&&val<trav.data) {
				temp.next = newNode;
				newNode.next = trav;   ///elem added in between
			}
			else
				trav.next = newNode;       //elem added at last 
		}
		else {
			newNode.next = head;
			head = newNode;   //elem added first if non empty
		}
	}
//	public void addLast(int val) {
//		//create new node
//		Node newNode  = new Node(val);
//		if(isEmpty()) {
//			head = newNode;
//		}
//		else {
//			Node trav = head;
//			//trav till last node
//			while(trav.next!=null) {
//				trav = trav.next;
//			}
//			
//			trav.next = newNode;
//		} 
//	}
	public void delFirst() {
		
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		
		//if only one node is present
		if(head.next==null) {
			System.out.println("in del first with only one node");
			head = null;
		}else {
			System.out.println("in del first");
			head = head.next;
		}
	}
	


}