package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static utils.CustomerUtils.populateCustomer;



import static utils.CustomerValidationRules.*;
import static utils.CustomerUtils.findByEmailPassword;

import com.app.core.Customer;
import com.app.core.CustomerComparator;
import com.app.core.ServicePlan;

import custom_exceptions.CustomerHandlingExceptions;

public class CustomerManagement {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		List<Customer> customers = populateCustomer();
		boolean exit = false;
		while(!exit) {
			System.out.println("Options :\n"+"1. Sign up (customer registration)\n"+"2. Sign in (login)\n"+"3. Change password\n"+
								"4. Un subscribe customer\n"+"5. Display all customers\n"+"6. Remove specific customer details\n"+
								"7. Sort the customers in asc as per email\n"+"8. Sort the customers in desc as per regAmt\n"+"0. Exit\n" );
			try {
			switch(sc.nextInt()) {
				case 1://Sign Up
					
					System.out.println("Enter the customer details : firstName, lastName, email, "
							+ "password, register amount, bith date(yyyy-MM-dd), service plan ");
					Customer cust = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
							sc.nextDouble(), sc.next(), sc.next(), customers);
					//Customer cust = validateAll("abc", "xyz", "abc@gmail", "abc123", 2000.0, "2000-01-21", "gold",customers);
					System.out.println("Customer is added");
					customers.add(cust);
					break;
					
				case 2://Sign in (login)
					System.out.println("Enter email and password of a customer");
					Customer c1 = findByEmailPassword(sc.next(),sc.next(),customers);
					System.out.println("Customer signed in successfully");
					System.out.println(c1);
					break;
					
				case 3://Change password
					System.out.println("Enter email and password of a customer");
					c1 = findByEmailPassword(sc.next(),sc.next(),customers);
					System.out.println("Customer signed in successfully and now you can change the passowrd");
					System.out.println("Enter the new password :");
					c1.setPassword(sc.next());
					System.out.println("New passowrd is updated successfully");
					break;
					
				case 4://Un subscribe customer
					System.out.println("Enter an email to un-subscribe the customer :");
					c1 = new Customer(sc.next());
					if(customers.remove(c1))
						System.out.println("Customer is un-subscribed");
					else
						throw new CustomerHandlingExceptions("Customer is not un-subscribed : Invalid email");
					break;
					
				case 5:
					System.out.println("Customer Deatils");
					for(Customer c: customers) {
						System.out.println(c);
					}
					break;
					
				case 6:
					System.out.println("Enter the service plan of customer :");
					ServicePlan sp = validatePlan(sc.next());
					Iterator<Customer> custItr = customers.iterator();
					while(custItr.hasNext()) {
						Customer ctr = custItr.next();
						if(ctr.getPlan()==sp)
							custItr.remove();
						
					}
					System.out.println("Customer is removed");
					
					break;
					
				case 7://"Sort the customers in asc as per email\n"
					Collections.sort(customers);
					System.out.println("Customer Deatils after sorting by asc as per email");
					for(Customer c: customers) {
						System.out.println(c);
					}
					break;
					
				case 8://Sort the customers in desc as per regAmt
					Collections.sort(customers, new CustomerComparator());
					System.out.println("Customer Deatils after sorting by desc as per regAmt");
					for(Customer c: customers) {
						System.out.println(c);
					}
					break;
				
				case 0:
					exit =true;
					System.out.println("Exit!!!!");
					break;
			}
			}catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		}
		
		
		}
	}

}
