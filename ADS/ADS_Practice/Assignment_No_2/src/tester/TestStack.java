package tester;

import java.util.Scanner;

import com.app.stack.StackUsingArray;

public class TestStack {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			 StackUsingArray stack = new StackUsingArray();
			 
			 boolean exit = false;
			 while(!exit) {
				  System.out.println("Enter Options :\n"+"1. Push the data on the stack\n"+"2. Pop the data from the stack\n"
						  +"3. Display the stack\n"+"4. Check how many elements are there on the stack\n"
		   				+"5. Check to see if the stack is full?\n"+"6. Check to see if stack is empty\n"+"7. Exit\n"); 
				  
				  switch(sc.nextInt()) {
				  case 1:
			          System.out.println("Enter the data to push: ");
			          int data = sc.nextInt();
			          stack.push(data);
			          break;
			          
			        case 2:
			          int poppedData = stack.pop();
			          if (poppedData != -1) {
			            System.out.println("The popped data is: " + poppedData);
			          }
			          break;
			          
			        case 3:
			          stack.displayStack();
			          break;
			          
			        case 4:
			          System.out.println("The number of elements on the stack is: " + stack.countElements());
			          break;
			          
			        case 5:
			          System.out.println("Is the stack full? " + stack.isStackFull());
			          break;
			          
			        case 6:
			          System.out.println("Is the stack empty? " + stack.isStackEmpty());
			          break;
				  }
			 }

		}

	}

}
