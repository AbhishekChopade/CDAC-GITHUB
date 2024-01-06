package com.app.list;

import com.app.list.LinkedList_3.Node;

public class LinkedList_2 {

	static class Node{
		private Node next;
		private int data;
		
		public Node(int val) {
			next = null;
			data = val;
		}
	}
	
	private Node head;
	public LinkedList_2() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			System.out.println("New node is added at first ");
		}else {
			Node trav =  head;
			while(trav.next!=null) {
				trav = trav.next;
			}
			
			newNode.next = trav.next;
			trav.next = newNode;
			System.out.println("New node is added at last ");
		}
	}
	
	public void addAtPos(int val,int pos) {
		Node newNode = new Node(val);
		if(isEmpty()||pos<=1) {
			newNode.next = head;
			head = newNode;
			System.out.println("Elem is added at first position");
		}else {
			Node trav = head ;
			for(int i=1;i<pos-1;i++) {
				if(trav.next==null)
					return;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			
			System.out.println("Elem is added at "+pos+" position");
		}
	}
	
	public void list() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		Node trav = head;
		while(trav!=null) {
			System.out.print(trav.data+" -> ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void reverse() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		Node oldHead = head;
		head = null;
		Node temp=null;
		
		while(oldHead!=null) {
			temp = oldHead;
			oldHead = oldHead.next;
			
			temp.next = head;
			head = temp;
		}
	}
//	public void reverseList() {
//		Node oldHead = head;
//		head = null;
//		Node temp = null;
//		while(oldHead!=null) {
//			temp = oldHead;
//			oldHead = oldHead.next;
//			
//			temp.next = head;
//			head = temp;
//		}
//	}
	
	public void remove(int val) {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		if(head.data==val) {
			head = null;
		}else {
			Node trav = head;
			Node temp = null;
			while(trav.data!=val) {
				temp = trav;
				trav = trav.next;
				
			}
			temp.next = trav.next;
		}
	}
	
}
