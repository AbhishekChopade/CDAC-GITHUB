package reverselinklist;

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
	
	public int count() {
		if (isEmpty()) {
			return 0;
		}
		int cnt = 0;
		Node trav = head;
		do {
			cnt++;
		} while ((trav.next!= head));
		return cnt;
	}
}


public class TestSinglyCircularLinkedList {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			SinglyCircularLinkedList scl = new SinglyCircularLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n"
						+ "4. Check count of elements\n5. Check list is empty or not\n ");
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
					case 4://Check count of elements
						int cnt = scl.count();
						System.out.println("Count of element which are present in list : "+cnt);
						break;
					case 5://
						boolean flag = scl.isEmpty();
						if(flag)
							System.out.println("Singly circular linked list is empty");
						else
							System.out.println("Singly circular linked list is not empty");
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
