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
	
	
	//add(X) — Add element X such that list remains sorted.
//	public void add(int val) {
//		Node newNode = new Node(val);
//		if(isEmpty())
//			head = newNode;
//		if(val<=head.data) {
//			newNode.next = head;
//			head = newNode;
//		}else {
//			Node trav = head;
//			Node temp = null;
//			while(trav.data<=val&&trav.next!=null) {
//				temp = trav; 
//				trav = trav.next;	
//			}
//			temp.next = newNode;
//			newNode.next = trav;
//		}
//		
//		
//	}
	
	public void add(int element) {
        Node newNode = new Node(element);

        if (head == null || element<=head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && element>current.next.data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }
	
//	public void addSorted(int val) {
//		Node newNode =  new Node(val);
//		if(isEmpty()) {
//			newNode.next = head; ///elem added first if empty
//			head = newNode;
//		}
//		else if(val>head.data) {
//			Node trav = head;
//			Node temp = null;
//			while(trav.next!=null&&val>trav.data) {
//				temp = trav;
//				trav = trav.next;
//			}
//			if(val>=temp.data&&val<trav.data) {
//				temp.next = newNode;
//				newNode.next = trav;   ///elem added in between
//			}
//			else
//				trav.next = newNode;       //elem added at last 
//		}
//		else {
//			newNode.next = head;
//			head = newNode;   //elem added first if non empty
//		}
//	}

	public void addAll(List<Integer> intList) throws LinkedListHandlingException {
		if(intList.isEmpty())
			throw new LinkedListHandlingException("Linked List is empty");
		
		for(int i=0;i<intList.size();i++) {
			add(intList.get(i));
		}
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
	
	public void remove(int pos) throws LinkedListHandlingException {
		if(isEmpty())
			throw new LinkedListHandlingException("Linked List is empty");
		if(pos<=1) {
			head = head.next;
		}else {
			Node trav = head;
			Node temp = null;
			for(int i = 1; i<pos; i++) {
				if(trav==null)
					throw new LinkedListHandlingException("Linked List is empty");
				temp = trav;
				trav = trav.next;
			}
			
			temp.next = trav.next; 
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
}
