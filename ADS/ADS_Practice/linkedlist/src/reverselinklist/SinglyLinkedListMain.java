package reverselinklist;



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
			System.out.print(trav.data+" -> ");
			trav = trav.next;
		}
		System.out.println("");
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
	
	public void sortList() {
		Node i,j;
		int temp;
		for(i=head;i!=null;i=i.next) {
			for(j=i.next;j!=null;j=j.next) {
				if(i.data>j.data) {
					temp = i.data;
					i.data = j.data;
					j.data = temp;
					
				}
			}
		}
	}
	
	public void reverseList() {
		Node oldHead = head;
		head = null;
		Node temp = null;
		while(oldHead!=null) {
			temp = oldHead;
			oldHead = oldHead.next;
			
			temp.next = head;
			head = temp;
		}
	}
	
	private Node recursiveReverse(Node h){
		if(h.next==null) {
			head = h;
			return h;
		}
		Node t = recursiveReverse(h.next);
		t.next = h;
		h.next = null;
		
		return h;
	}
	
	public void recursiveReverse(){
		recursiveReverse(head);
	
	}
	
	private void reverseDisplay(Node h) {
		if(h==null)
			return;
		reverseDisplay(h.next);
		System.out.print(h.data+" -> ");
		
	}
	public void reverseDisplay() {
		reverseDisplay(head);
	}
	
	public void findMiddle() {
		Node slow = head;
		Node fast = head;
		while(fast!=null&&fast.next!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Element : "+slow.data);
	}
}



public class SinglyLinkedListMain {

	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.addLast(50);
		sl.addLast(20);
		sl.addLast(80);
		sl.addLast(40);
		sl.addLast(10);
		sl.addLast(70);
		sl.addLast(60);
		sl.display();
//		sl.sortList();
//		sl.display();
//		sl.reverseList();
//		sl.display();
//		sl.recursiveReverse();
//		sl.display();
//		System.out.println("Reverse SinglyLinkedList :");
//		sl.reverseDisplay();
		sl.findMiddle();
		

	}
	
}
