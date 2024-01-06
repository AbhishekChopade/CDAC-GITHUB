package tester;

import java.util.Scanner;

import com.app.queue.CircularQueue;

public class TestQueue {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the count of queue : ");
			CircularQueue cq = new CircularQueue(sc.nextInt());
			boolean exit =false;
			
			while(!exit){
				System.out.println("Enter Options :\n"+"1. Enqueue the data in the circular queue\n"+"2. Remove the data from the circular queue\n"+"3. Access the data from the circular queue\n"+
						"4. Show the queue\n"+ "5. Check how many elements are there in the circular queue\n"
						+"6. Check to see if the circular queue is full?\n"+"7. Check to see if circular queue is empty\n"+"0. Exit\n");
				
				try {
					switch(sc.nextInt()) {
					case 1://Enqueue
						System.out.println("Enter the data element");
						cq.enQueue(sc.nextInt());
						System.out.println("Element is added in queue");
						break;
						
					case 2://Dequeue
						int val = cq.deQueue();
						System.out.println(val +" is removed from circular queue");
						
						break;
						
					case 3://Peek
						val = cq.peek();
						System.out.println(val +" is accesed from circular queue");
						break;
						
					case 4:
						System.out.println("All elements in the circular queue : ");
						cq.display();
						break;
						
					case 5:
						int cnt = cq.getCount();
						System.out.println("Count of elements in a circular queue : "+cnt);
						break;
						
					case 6:
						 System.out.println("Is the circular queue full? " + cq.isFull());
						break;
						
					case 7:
						  System.out.println("Is the circular queue empty? " + cq.isEmpty());
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
