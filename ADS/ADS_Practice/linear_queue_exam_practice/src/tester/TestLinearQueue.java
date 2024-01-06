package tester;

import java.util.Scanner;

import com.app.queue.LinearQueue;

public class TestLinearQueue {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size : ");
			LinearQueue lq = new LinearQueue(sc.nextInt());
			boolean exit =false;
			
			while(!exit){
				System.out.println("Enter Options :\n"+"1.Enqueue\n"+"2. Dequeue\n"+"3. Peek\n"+
									"4. Display\n"+ "5. GetCount\n"
									+"6.isFull?\n"+"7. isEmpty\n"+"0. Exit\n");
				
				try {
					switch(sc.nextInt()) {
					case 1://Enqueue
						System.out.println("Enter the data element");
						lq.enQueue(sc.nextInt());
						System.out.println("Element is added in queue");
						break;
						
					case 2://Dequeue
						int val = lq.deQueue();
						System.out.println(val +" is removed from queue");
						
						break;
						
					case 3://Peek
						val = lq.peek();
						System.out.println(val +" is accesed from queue");
						break;
						
					case 4:
						System.out.println("All elements in the queue : ");
						lq.display();
						break;
						
					case 5:
						int cnt = lq.getCount();
						System.out.println("Count of elements in a queue : "+cnt);
						break;
						
					case 6:
						 System.out.println("Is the queue full? " + lq.isFull());
						break;
						
					case 7:
						  System.out.println("Is the queue empty? " + lq.isEmpty());
						break;
						
					case 0://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
						
					}
				}catch (Exception e) {
					//e.printStackTrace();
					System.out.println(e);
				}
			}
		}

	}

}
