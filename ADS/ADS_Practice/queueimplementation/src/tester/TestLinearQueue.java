package tester;

import java.util.Scanner;

import com.app.queue.LinearQueue;

public class TestLinearQueue {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of queue : ");
			LinearQueue lq = new LinearQueue(sc.nextInt());
			boolean exit =false;
			
			while(!exit){
				System.out.println("Enter Options : 1. Enqueue\n, 2. Dequeue\n, 3.Peek\n,  0.Exit\n");
				
				try {
					switch(sc.nextInt()) {
					case 1://Enqueue
						System.out.println("Enter the data element");
						lq.add(sc.nextInt());
						System.out.println("Element is added in queue");
						break;
						
					case 2://Dequeue
						int val = lq.remove();
						System.out.println(val +" is removed from queue");
						
						break;
						
					case 3:
						val = lq.peek();
						System.out.println(val +" is peeked from queue");
						break;
						
					case 0://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
						
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
