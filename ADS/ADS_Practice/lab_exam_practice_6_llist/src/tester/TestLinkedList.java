package tester;

import java.util.Scanner;

import com.app.list.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			LinkedList sl = new LinkedList();
			boolean exit = false;
			do {
				System.out.println("1. Add at last\n"+"2. Delete first\n"+"3. Display \n"+"0. Exit\n"+"Enter Options :");
				try {
					switch(sc.nextInt()) {
					case 1://Add at last
						System.out.println("Enter the elem : ");
						int val = sc.nextInt();
						sl.insertAtEnd(val);
						System.out.println(val+" is inserted at end");
						break;
						
					case 2://Delete first
						sl.deleteFirst();
						System.out.println("The first element is removed");
						break;
						
//					
					case 3://Display all(toSting)
						System.out.print("SinglyLinkedList : ");
						sl.display();
						System.out.println();
						break;
						
					
						
					case 0://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}while(!exit);
		}

	}

}
