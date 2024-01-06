package tester;
import com.app.core.*;
import java.util.Scanner;

public class TestStack {
	static Stack stack;
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//FixedStack[] fixed = new FixedStack[STACK_SIZE];
		
		//FixedStack[] fixed = new FixedStack[sc.nextInt()];
		
		//int cnt =0;
		boolean exit = false;
		while(!exit) {
			System.out.println("1. Choose Fixed Stack\n"+"2. Choose Growable Stack\n"+"3. Push Data\n"+
		                       "4. Pop data & display the same\n"+"5. Display all customer details\n"+"6. Exit");
			System.out.println("Choose");
			switch(sc.nextInt()) 
			{
			case 1://Choose Fixed Stack
			
				if(stack==null) {
					stack = new FixedStack();
					System.out.println("FixedStack is chosen");
					System.out.println("You cannot chose another stack so skip option 2");
				}
				else
					System.out.println("Stack is already chosen");
				break;
				
			case 2://Choose Growable Stack
				if(stack==null) {
					stack = new GrowableStack();
					System.out.println("GrowableStack is chosen");
					System.out.println("You cannot chose another stack so skip option 1");
				}
				else
					System.out.println("Stack is already chosen");
				break;
				
			case 3://Push Data
				if(stack instanceof FixedStack) {
					System.out.println("Enter id,name and address of a customer : ");
					Customer cust = new Customer(sc.nextInt(),sc.next(),sc.next());
					stack.push(cust);
					//System.out.println("Customer added into FixedStack");
				}else if(stack instanceof GrowableStack) {
					System.out.println("Enter id,name and address of a customer : ");
					Customer cust = new Customer(sc.nextInt(),sc.next(),sc.next());
					stack.push(cust);
					//System.out.println("Customer added into GrowableStack");
				}
				else
					System.out.println("NO stack chosen !!!");
				break;
				
			case 4://Pop Data
				System.out.println("Customer deleted from the Stack is :");
				System.out.println(stack.pop());
				break;
			
			case 5://Display all customer details
				if(stack instanceof FixedStack) {
					System.out.println("Customer details from FixedStack :");
					FixedStack s = (FixedStack)stack;
					s.displayFixedStack();
				}
				else if(stack instanceof GrowableStack) {
					System.out.println("Customer details from GrowableStack :");
					GrowableStack g = (GrowableStack)stack;
					g.displayGrowableStack();
				}
				break;
				
			case 6:
				exit = true;
				System.out.println("Exit!!!!!!");
				break;
			default:
				System.out.println("Invalid Choice!!!!!");
				break;
			}
		}
		sc.close();
	}

}
