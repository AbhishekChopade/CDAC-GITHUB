package tester;

import java.util.Scanner;

import com.app.stackll.StackUsingLinkedList;

public class TestStack {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			StackUsingLinkedList stack = new StackUsingLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Push\n2. Pop\n3. Display\n");
				
				try {
				switch(sc.nextInt()) {
					case 1://Push
						System.out.println("Enter the element to be Added : ");
						int val = sc.nextInt();
						stack.push(val);
						break;
						
					case 2://Pop
						stack.pop();
						break;
					case 3:System.out.println("Linked List :");
					stack.display();
						break;
						
					case 0://exit
						exit = true;
						break;
				}
		      }catch (Exception e) {
					System.out.println(e);
		      }
						
			}while(!exit);
		}
	}

}
