package tester;

import java.util.Scanner;

import com.app.queue.CircularQueue;

import exceptions.QueueHandlingException;

public class TestCircularQueue {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the count of queue : ");
			CircularQueue cq = new CircularQueue(sc.nextInt());
			boolean exit =false;
			
			do{
				System.out.println("Enter Options :\n"+"1. Add\n"+"2. Remove\n"+"3. Size\n"+
						"4. Display all\n"+"5. Exit\n");
				
				try {
					switch(sc.nextInt()) {
					case 1://Enqueue
						System.out.println("Enter the element");
						boolean flag = cq.add(sc.next());
						if(flag)
							System.out.println("Element is added in queue");
						else
							throw new QueueHandlingException("Queue is full");
						break;
						
					case 2://Dequeue
						String val = cq.remove();
						if(val!=null)
							System.out.println(val +" is removed from circular queue");
						else
							throw new QueueHandlingException("Queue is empty");
						break;
						
					case 3:
						int cnt = cq.size();
						if(cnt!=0)
							System.out.println("Count of elements in a circular queue : "+cnt);
						else
							throw new QueueHandlingException("Queue is empty");
						break;
						
					case 4://toString
						System.out.println("All elements in the circular queue : ");
						String allElements = cq.toString();
						if(allElements!=" ")
							System.out.println(allElements);
						else
							throw new QueueHandlingException("Queue is empty");
						System.out.println("using display");
						cq.Display();
						break;
						
					case 5://Exit
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
