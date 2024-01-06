package tester;

import java.util.Scanner;

import com.app.list.LinkedList;

public class TestSortedList {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			LinkedList sl = new LinkedList();
			boolean exit = false;
			
			do {
				System.out.println("Enter Options :\n0. Exit\n1. Display\n2. Add Sorted\n3. Del First\n");
				try {
					switch(sc.nextInt()) {
					case 1://Display
						sl.display();
						break;
					case 2://Add Sorted
						System.out.println("Enter the data :");
						int val = sc.nextInt();
						sl.addSorted(val);
						break;
					
					case 3://Del First
						sl.delFirst();
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
