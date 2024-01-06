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
				System.out.println("1. Add\n"+"2. Find position\n"+"3. Display all(toSting)\n"+"4. Find Sorted or not\n"+"0. Exit\n"+"Enter Options :");
				try {
					switch(sc.nextInt()) {
					case 1://Add
						System.out.println("Enter the elem : ");
						int val = sc.nextInt();
						sl.add(val);
						break;
						
					case 2://Add all
						System.out.println("Enter the elem to be find at which pos :");
						int pos = sl.find(sc.nextInt());
						System.out.println("The position is "+(pos+1));
						break;
						
//					
					case 3://Display all(toSting)
						System.out.print("SinglyLinkedList : "+sl.toString());
						System.out.println();
						break;
						
						
					case 4://isSorted
						boolean sorted = sl.isSorrted();
						if(sorted)
							System.out.println("Linked list is sorted");
						else
							System.out.println("Linked list is not sorted");		
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
