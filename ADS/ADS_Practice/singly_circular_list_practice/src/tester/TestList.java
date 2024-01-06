package tester;

import java.util.Scanner;

import com.app.ll.SinglyCircularLinkedList;

public class TestList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			SinglyCircularLinkedList sl = new SinglyCircularLinkedList();
			boolean  exit = false;
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add At Pos\n"
						+ "5. Del First\n6. Del Last\n7. Del At Pos\n");
				try {
					switch(sc.nextInt()) {
					
					case 1:
						System.out.println("SinglyCircularLinkedList :");
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
					case 4://Add At Pos
						System.out.println("Enter the element and position :");
						val = sc.nextInt();
						int pos = sc.nextInt();
						sl.addAtPos(val, pos);
						break;
					case 5://Del First
						sl.delFirst();
						break;
					case 6://Del Last
						sl.delLast();
						break;
					case 7://Del At Pos
						System.out.println("Enter the position :");
						pos = sc.nextInt();
						sl.delAtPos(pos);
						break;
					case 0://exit
						System.out.println("Exit!!");
						break;
					}
				}catch (Exception e) {
					System.out.println(e);
				}
				
			}while(!exit);
		}

	}

}
