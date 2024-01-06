package com.app.ll;

import java.util.Scanner;

class SinglyLinkedList{
	
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

	public SinglyLinkedList() {
	
		this.head = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void display() {
		System.out.println("SinglyLinkedList : ");
		Node trav = head;
		while(trav!=null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int val) {
		//create new node
		Node newNode  = new Node(val);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			Node trav = head;
			//trav till last node
			while(trav.next!=null) {
				trav = trav.next;
			}
			
			trav.next = newNode;
		} 
	}
	public void addAtPosition(int val,int pos) {
		//if list is empty and pos is 1 or less than the add at 1st position
		if(isEmpty() || pos<=1) {
			addFirst(val);
		}else {
			Node newNode = new Node(val);
			Node trav = head;
			for(int  i=1;i<pos-1;i++) {
				if(trav.next==null)
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
		
		//if only one node is present
		if(head.next==null) {
			head = null;
		}else {
			head = head.next;
		}
	}
	
	public void delLast() {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		//if only one node is present
		if(head.next==null) {
			head = null;
		}
		else {
			//trav till last node , create temp ptr which run behind trav
			Node temp = null;
			Node trav =head;
			while(trav.next!=null) {
				temp = trav;
				trav = trav.next;
			}
			
			temp.next = null;	
		}
	}
	
	public void delAtPos(int pos) {
		if(pos==1) {
			delFirst();
		}
		
		if(isEmpty() || pos<1) {
			throw new RuntimeException("List is empty");
		}
		Node temp = null;
		Node trav = head;
		for(int i = 1;i<pos;i++) {
			if(trav == null)
				throw new RuntimeException("Invalid position.");
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}
	
	public void delAll() {
		head = null;
	}
}





public class TestSinglyLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			SinglyLinkedList sl = new SinglyLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add At Pos\n"
						+ "5. Del First\n6. Del Last\n7. Del At Pos\n8. Del All ");
				try {
					switch(sc.nextInt()) {
					case 1://Display
						sl.display();
						break;
					case 2://Add First
						System.out.println("Enter the data :");
						int val = sc.nextInt();
						sl.addFirst(val);
						break;
					case 3:// Add Last
						System.out.println("Enter the data :");
						val = sc.nextInt();
						sl.addLast(val);
						break;
					case 4://Add At Pos
						System.out.println("Enter the element and position :");
						val = sc.nextInt();
						int pos = sc.nextInt();
						sl.addAtPosition(val, pos);
						break;
					case 5://Del First
						sl.delFirst();
						break;
					case 6://Del Last
						sl.delLast();
						break;
					case 7://Del At Pos
						System.out.println("Enter the position :");
						pos = sc.nextInt();
						sl.delAtPos(pos);
						break;
					case 8://Del all
						sl.delAll();
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
