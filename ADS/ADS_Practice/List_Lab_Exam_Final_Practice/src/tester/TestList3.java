package tester;


import java.util.List;
import java.util.Scanner;

import com.app.list.LinkedList_3;

public class TestList3 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			LinkedList_3 l1 = new LinkedList_3();
			boolean exit = false;
			do {
				System.out.println("1. Add Sorted\n"+"2. Add All(list)\n"+"3. Remove from index\n"+
			"4. toString\n"+"0. Exit");
				
				try {
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter the elem :");
						int val =  sc.nextInt();
						l1.addSorted(val);
						System.out.println(val+" is added.");
						break;
						
					case 2:
						List<Integer> list = List.of(23,12,78,99,10);
						System.out.println(list);
						l1.addAll(list);
						break;
						
					case 3:
						System.out.println("Enter the index :");
						int ind = sc.nextInt();
						l1.remove(ind);
						System.out.println("Element is removed from index "+ind);
						break;
						
					case 4:
						System.out.println("Linked list : "+l1.toString());
						
						break;
						
					case 0:
						exit = true;
						System.out.println("Exit !!");
						break;
					}
					
				}catch (Exception e) {
					System.out.println(e);
				}
			}while(!exit);
		}

	}

}
