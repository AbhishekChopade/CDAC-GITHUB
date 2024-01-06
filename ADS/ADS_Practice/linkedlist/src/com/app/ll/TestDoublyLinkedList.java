package com.app.ll;

import java.util.Scanner;


class DoublyLinkedList {
	static class Node{
		private Node next;
		private Node prev;
		private int data;
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}
		public Node(int val) {
			this.next = null;
			this.prev = null;
			this.data = val;
		}
		
	}
	private Node head;
	
	public boolean isEmpty() {
		return head==null;
	}
	public void displayForward() {
		Node trav = head;
		System.out.println("DoublyLinkedList :");
		while(trav!=null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void displayReverse() {
		if(isEmpty()) {
			return;
		}
		Node trav = head;
		while(trav.next!=null) {
			trav = trav.next;
		}
		System.out.println("Reversed DoublyLinkedList :");
		while(trav!=null) {
			System.out.println(trav.data);
			trav = trav.prev;
		}
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
		}
		else {
			Node trav = head;
			while(trav.next!=null) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}
	}
	
	
	public void addAtPosition(int val,int pos) {
		Node newNode = new Node(val);
		if(isEmpty()||pos<=1) {
			addFirst(val);
		}else {
			Node trav = head;
			Node temp =null;
			for(int i=1;i<pos-1;i++) {
				if(trav.next==null)
					break;
				trav = trav.next;
				
			}
			temp = trav.next;
			newNode.next = temp;
			trav.next = newNode;
			newNode.prev = trav;
			if(temp!=null)
				temp.prev = newNode;
		}
	}

	public void delFirst() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		if(head.next == null)
			head = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}
	
	
	public void delLast() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		if(head.next == null)
			head = null;
		else {
			Node trav = head;
			Node temp = null;
			while(trav.next!=null) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
	}
	public void delAtPosition(int pos) {
				if(pos == 1)
					delFirst();
				
				if(head == null || pos < 1)
					throw new RuntimeException("List is empty or Invalid position.");
				Node trav = head;
				for(int i = 1; i < pos; i++) {
					
					if(trav == null)
						throw new RuntimeException("Invalid position.");
					trav = trav.next;
				}
				// trav's previous node's next to trav's next node
				trav.prev.next = trav.next;
				// trav's next node's prev to trav's previous node
				if(trav.next != null) 
					trav.next.prev = trav.prev;
				
	}
	
	public void delAll() {
		head = null;
	}
	
}
public class TestDoublyLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			DoublyLinkedList dl = new DoublyLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display Forward, Display Reverse\n2. Add First\n3. Add Last\n4. Add At Pos\n"
						+ "5. Del First\n6. Del Last\n7. Del At Pos\n8. Del All ");
				try {
					switch(sc.nextInt()) {
					case 1://Display Forward, Display Reverse
						dl.displayForward();
						dl.displayReverse();
						break;
						
					case 2://Add First
						System.out.println("Enter the data :");
						int val = sc.nextInt();
						dl.addFirst(val);
						break;
						
					case 3:// Add Last
						System.out.println("Enter the data :");
						val = sc.nextInt();
						dl.addLast(val);
						break;
						
					case 4://Add At Pos
						System.out.println("Enter the element and position :");
						val = sc.nextInt();
						int pos = sc.nextInt();
						dl.addAtPosition(val, pos);
						break;
						
					case 5://Del First
						dl.delFirst();
						break;
						
					case 6://Del Last
						dl.delLast();
						break;
						
					case 7://Del At Pos
						System.out.println("Enter the position :");
						pos = sc.nextInt();
						dl.delAtPosition(pos);
						break;
						
					case 8://Del all
						dl.delAll();
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
