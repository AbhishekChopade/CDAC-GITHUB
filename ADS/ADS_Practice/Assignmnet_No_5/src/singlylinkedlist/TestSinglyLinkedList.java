package singlylinkedlist;

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
	
	public int count() {
		int cnt = 0;
		if(isEmpty()) {
			return 0;
		}
		Node trav = head;
		while(trav != null) {
			cnt++;
			trav = trav.next;
		}
		return cnt;
	}
	
	
	
}





public class TestSinglyLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the count of singly linked list : ");
			SinglyLinkedList sl = new SinglyLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n"
						+ "4. Check count of elements\n5. Check list is empty or not\n");
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
					case 4://Check count of elements
						int cnt = sl.count();
						System.out.println("Count of element which are present in list : "+cnt);
						break;
					case 5://
						boolean flag = sl.isEmpty();
						if(flag)
							System.out.println("Singly linked list is empty");
						else
							System.out.println("Singly linked list is not empty");
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
