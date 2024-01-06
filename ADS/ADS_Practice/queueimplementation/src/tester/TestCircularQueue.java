package tester;

import java.util.Scanner;

import com.app.queue.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of queue : ");
			CircularQueue cq = new CircularQueue(sc.nextInt());
			boolean exit =false;
			
			while(!exit){
				System.out.println("Enter Options :\n"+"1. Enqueue\n"+"2. Dequeue\n"+"3. Peek\n"+"4. Display Queue\n"+ "0. Exit\n");
				
				try {
					switch(sc.nextInt()) {
					case 1://Enqueue
						System.out.println("Enter the data element");
						cq.add(sc.nextInt());
						System.out.println("Element is added in queue");
						break;
						
					case 2://Dequeue
						int val = cq.remove();
						System.out.println(val +" is removed from queue");
						
						break;
						
					case 3:
						val = cq.peek();
						System.out.println(val +" is peeked from queue");
						break;
						
					case 4:
						System.out.println("All elements in the queue ");
						cq.display();
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
