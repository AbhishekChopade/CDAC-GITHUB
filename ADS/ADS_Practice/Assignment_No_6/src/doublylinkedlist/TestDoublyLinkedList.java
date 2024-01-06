package doublylinkedlist;

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
	
	
	public int count() {
		// TODO Auto-generated method stub
		int cnt = 0;
		Node trav = head;
		while (trav != null) {
			cnt++;
			trav = trav.next;
		}
		return cnt;
	}
	
}
public class TestDoublyLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			DoublyLinkedList dl = new DoublyLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display Forward, Display Reverse\n2. Add First\n3. Add Last\n"
						+  "4. Check count of elements\n5. Check list is empty or not\n");
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
						
					case 4://Check count of elements
						int cnt = dl.count();
						System.out.println("Count of element which are present in list : "+cnt);
						break;
					case 5://
						boolean flag = dl.isEmpty();
						if(flag)
							System.out.println("Doubly linked list is empty");
						else
							System.out.println("Doubly linked list is not empty");
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
