package com.app.list;

import java.util.List;

public class LinkedList_3 {

	static class Node{
		private Node next;
		private int data;
		
		public Node(int val) {
			next = null;
			data = val;
		}
	}
	
	private Node head;
	public LinkedList_3() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addSorted(int val) {
		Node newNode = new Node(val);
		if(isEmpty() || val<=head.data) {
			newNode.next = head;
			head = newNode;
		}else {
			Node trav = head;
			while(trav.next!=null && val>trav.next.data) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			
		}
	}
	
	public void addAll(List<Integer> list ) {
		if(list.isEmpty())
			throw new RuntimeException("Passed list is empty");
		
		for(int i=0;i<list.size();i++) {
			addSorted(list.get(i));
		}
		
		System.out.println("List is added to linked list");
	}
	
	public void remove(int index) {
		if(isEmpty())
			throw new RuntimeException("Linked list is empty");
		if(index<0)
			throw new RuntimeException("Invalid index");
		if(index==0) {
			head = head.next;
		}else {
			Node trav = head;
			Node temp = null;
			for(int i=0;i<index;i++) {
				if(trav.next==null)
					throw  new RuntimeException("Invalid index");
				temp = trav;
				trav = trav.next;
			}
			temp.next =  trav.next;
		}
	}
	
	public String toString() {
		if(isEmpty())
			throw new RuntimeException("Linked list is empty");
		
		Node trav = head;
		String elem = "";
		String allElem="";
		while(trav!=null) {
			elem=trav.data+", ";
			allElem+=elem;
			trav = trav.next;
		}
		
		return allElem;
	}
	
}
