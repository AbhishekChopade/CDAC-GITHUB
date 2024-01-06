package com.app.ll;

import java.util.Scanner;

class SinglyCircularLinkedList{
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
	
	public SinglyCircularLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	public void display() {
		if(isEmpty())
			return;
		 Node trav = head;
		 System.out.println("SinglyCircularLinkedList :");
		 do {
			 System.out.println(trav.data);
			 trav = trav.next;
		 }while(trav!=head);
		 System.out.println();
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			head.next = head;
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
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			head.next = head;
		}else {
		
			Node trav = head;
			while(trav.next!=head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.next = head;
		}
	}
	
	public void addAtPosition(int val,int pos) {
		Node newNode = new Node(val);
		if(isEmpty()|| pos<=1) {
			addFirst(val);
		}
		else {
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
		if(head.next==head) {
			head = null;
		}else {
			Node trav = head;
			while(trav.next!=head) {
				trav = trav.next;
			}
			head = head.next;
			trav.next = head;
		}
	}
	
	public void delLast() {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		if(head.next==head) {
			head = null;
		}else {
			Node trav = head;
			Node temp = null;
			while(trav.next!=head) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = head;
		}
	}
	
	public void delAtPosition(int pos) {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		if(pos<1) {
			throw new RuntimeException("Invalid position");
		}
		if(pos==1) {
			delFirst();
		}
		Node trav = head;
		Node temp = null;
		for(int i=1;i<pos;i++) {
			if(trav.next==head)
				throw new RuntimeException("Invalid position");
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}
	public void delAll() {
		//convert circular to linear list
		head.next = null;
		//point head to null
		head = null;
	}
}


public class TestSinglyCircularLinkedList {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			SinglyCircularLinkedList scl = new SinglyCircularLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add At Pos\n"
						+ "5. Del First\n6. Del Last\n7. Del At Pos\n8. Del All ");
				try {
					switch(sc.nextInt()) {
					case 1://Display
						scl.display();
						break;
					case 2://Add First
						System.out.println("Enter the data :");
						int val = sc.nextInt();
						scl.addFirst(val);
						break;
					case 3:// Add Last
						System.out.println("Enter the data :");
						val = sc.nextInt();
						scl.addLast(val);
						break;
					case 4://Add At Pos
						System.out.println("Enter the element and position :");
						val = sc.nextInt();
						int pos = sc.nextInt();
						scl.addAtPosition(val, pos);
						break;
					case 5://Del First
						scl.delFirst();
						break;
					case 6://Del Last
						scl.delLast();
						break;
					case 7://Del At Pos
						System.out.println("Enter the position :");
						pos = sc.nextInt();
						scl.delAtPosition(pos);
						break;
					case 8://Del all
						scl.delAll();
						break;
					case 0://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}while(!exit);
		}
		
		
	}

}
