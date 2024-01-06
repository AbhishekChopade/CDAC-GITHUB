package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.list.SinglyLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			SinglyLinkedList sl = new SinglyLinkedList();
			boolean exit = false;
			do {
				System.out.println("1. Add\n"+"2. Add all\n"+"3. remove\n"+"4. Display all(toSting)\n"+"0. Exit\n"+"Enter Options :");
				try {
					switch(sc.nextInt()) {
					case 1://Add
						System.out.println("Enter the elem : ");
						int val = sc.nextInt();
						sl.add(val);
						break;
						
					case 2://Add all
						System.out.println("Enter the values");
						List<Integer> list = List.of(28,12,3,90);
						sl.addAll(list);
						System.out.println("List in added into linked list");
						break;
						
					case 3:
						System.out.println("Enter the position : ");
						int pos = sc.nextInt();
						sl.remove(pos);
						System.out.println("Element is removed from list");
						break;
						
					case 4://Display all(toSting)
						System.out.print("SinglyLinkedList : "+sl.toString());
						//sl.list();
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
