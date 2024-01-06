package tester;

import java.util.Scanner;

import com.app.list.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			SinglyLinkedList sl = new SinglyLinkedList();
			boolean exit = false;
			
			do {
				System.out.println("1. Add Last\n"+"2. Add At Position\n"+"3. Remove\n"+"4. Display all\n"+"5. Reverse\n"+"6. Exit\n"+"Enter choice :");
				try {
					switch(sc.nextInt()) {
					case 1://Add Last
						System.out.println("Enter the data :");
						int val = sc.nextInt();
						sl.add(val);
						break;
				
					case 2://Add At Pos
						System.out.println("Enter the element and position :");
						val = sc.nextInt();
						int pos = sc.nextInt();
						sl.add(val, pos);
						break;
						
					case 3://Remove
						System.out.println("Enter the element to be removed :");
						int elem = sc.nextInt();
						sl.remove(elem);
						System.out.println("element is removed from list");
						break;
						
					case 4://Display all
						System.out.println("Singly Linked List");
						sl.list();
						break;
						
					case 5://Reverse
						System.out.print("Before reverse : ");
						sl.list();
						sl.reverse();
						System.out.print("After reverse : ");
						sl.list();
						break;
					
					case 6://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
				}catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}while(!exit);
		}
	}

	

}
