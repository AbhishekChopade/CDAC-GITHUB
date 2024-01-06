package tester;

import java.util.Scanner;
import com.app.stack.*;

public class TestStack {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the stack size : ");
			Stack stack1 = new Stack(sc.nextInt());
			boolean exit = false;
			do {
				System.out.println("1. Push\n"+"2. Pop\n"+"3. GetTop\n"+"4. GetMin\n"+"5. Display\n"+"6. Exit\n"+"Enter choice :");
				try {
					switch(sc.nextInt()) {
					case 1://Push
						System.out.println("Enter the value to be push into stack :");
						stack1.push(sc.nextInt());
						System.out.println("Value is pushed into stack");
						break;
						
					case 2://Pop
						int val = stack1.pop();
						System.out.println("Top value "+val+" is poped from stack");
						break;
						
					case 3://Top
						val = stack1.top();
						System.out.println("Top value "+val);
						break;
						
					case 4://Max
						int max = stack1.getMin();
						System.out.println("Min value from stack is "+max);
						break;
					case 5://Dispaly
						stack1.display();
						break;
					case 6://Exit
						exit = true;
						break;
						
					}
				}catch(Exception e){
						e.printStackTrace();
				}
			}while(!exit);
		}

	}

}
