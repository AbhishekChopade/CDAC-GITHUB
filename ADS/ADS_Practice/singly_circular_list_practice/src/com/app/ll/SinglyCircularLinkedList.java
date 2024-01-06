package com.app.ll;

import com.app.ll.SinglyCircularLinkedList.Node;

public class SinglyCircularLinkedList {

	static class Node{
		Node next;
		int data;
		public Node(int data) {
			next = null;
			this.data = data;
		}
	}
	
	private Node head;
	public SinglyCircularLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			newNode.next = head;
			head = newNode;
			head.next=head;	
		}else {
			Node trav = head;
			while(trav.next!=head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			newNode.next = head;
			head = newNode;
			head.next=head;	
		}else {
			Node trav = head;
			while(trav.next!=head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
			
		}
	}
	
	public void addAtPos(int data,int pos) {
		Node newNode = new Node(data);
		if(isEmpty()||pos<=1) {
			addFirst(data);
		}else {
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				if(trav.next==head)
						break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
		
	}
	
	public void delFirst() {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		if(head.next == head) {
			head=null;
		}else {
			Node trav = head;
			while(trav.next!=head) {
				trav=trav.next;
			}
			head = head.next;
			trav.next = head;
		}	
	}
	
	public void delLast() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		
		if(head.next == head) {
			head=null;
		}else {
			Node trav= head;
			Node temp = null;
			while(trav.next!=null) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
		}
	}
	
	public void delAtPos(int pos) {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		if(pos<1) 
			throw new RuntimeException("Invalid position");
		if(pos==1) {
			delFirst();
		}
		else {
			Node trav = head;
			Node temp = null;
			for(int i=1;i<pos;i++) {
				if(trav.next==head)
					break;
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
		}
	}
	
	public void display() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		
		Node trav = head;
		do{
			System.out.print(trav.data+" -> ");
			trav = trav.next;
		}while(trav!=head);
		System.out.println();
	}
	
//	public void display() {
//		if(isEmpty())
//			return;
//		 Node trav = head;
//		 System.out.println("SinglyCircularLinkedList :");
//		 do {
//			 System.out.println(trav.data);
//			 trav = trav.next;
//		 }while(trav!=head);
//		 System.out.println();
//	}
	
}
