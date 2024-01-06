 package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static utils.CustomerUtils.populateCustomer;



import static utils.CustomerValidationRules.*;
import static utils.CustomerUtils.findByEmailPassword;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exceptions.CustomerHandlingExceptions;
import custom_ordering.CustomerComparator;

public class CustomerManagement {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		Map<String,Customer> customersMap = populateCustomer();
		boolean exit = false;
		while(!exit) {
			System.out.println("Options :\n"+"1. Sign up (customer registration)\n"+"2. Sign in (login)\n"+"3. Change password\n"+
								"4. Un subscribe customer\n"+"5. Display all customers\n"+"6. Remove specific customer details\n"+
								"7. Sort the customers as per email\n"+"8. Sort the customers as per dob and lastname\n"+
								"9. Remove all those customers whose subscription is pending for last 6 months\n"+"0. Exit\n" );
			try {
			switch(sc.nextInt()) {
				case 1://Sign Up
					System.out.println("Enter an email of a customer :");
					String email = sc.next();
					checkDuplicate(email, customersMap);
					System.out.println("Enter the customer details : firstName, lastName, email, "
							+ "password, register amount, bith date(yyyy-MM-dd), service plan,subscription date(yyyy-MM-dd) ");
					Customer cust = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
							sc.nextDouble(), sc.next(), sc.next(),sc.next(), customersMap);
					customersMap.put(email,cust);
					System.out.println("Customer is added");
					
					break;
					
				case 2://Sign in (login)
					System.out.println("Enter email and password of a customer");
					Customer c1 = findByEmailPassword(sc.next(),sc.next(),customersMap);
					System.out.println("Customer signed in successfully");
					System.out.println(c1);
					break;
					
				case 3://Change password
//					System.out.println("Enter email and password of a customer");
//					c1 = customersMap.get(sc.next());
				
					System.out.println("Enter email and password of a customer");
					c1 = findByEmailPassword(sc.next(),sc.next(),customersMap);
					System.out.println("Customer signed in successfully and now you can change the passowrd");
					System.out.println("Enter the new password :");
					c1.setPassword(sc.next());
					System.out.println("New passowrd is updated successfully");
					break;
					
				case 4://Un subscribe customer
					System.out.println("Enter an email to un-subscribe the customer :");
					email = sc.next();
					if(customersMap.containsKey(email)) {
						c1 = customersMap.remove(email);
						System.out.println("Customer is un-subscribed");
						System.out.println(c1);
					}
					else
						throw new CustomerHandlingExceptions("Customer is not un-subscribed : Invalid email");
					break;
					
				case 5:
					System.out.println("Customer Deatils");
					for(Customer c: customersMap.values()) {
						System.out.println(c);
					}
					break;
					
				case 6://Remove specific customer details
					System.out.println("Enter the service plan of customer :");
					ServicePlan sp = validatePlan(sc.next());
					Iterator<Customer> custItr = customersMap.values().iterator();
					while(custItr.hasNext()) {
						Customer ctr = custItr.next();
						if(ctr.getPlan()==sp)
							custItr.remove();
						
					}
					System.out.println("Customer is removed");
					
					break;
					
				case 7://"Sort the customers as per email\n"
				
//					List<Customer> custList = new ArrayList<>(customersMap.values());
//					Collections.sort(custList);
//					
//					for(Customer c: custList) {
//						System.out.println(c);
//					}
					
					Map<String,Customer> customers = new TreeMap<String, Customer>(customersMap);
					System.out.println("Customer Deatils");
					for(Customer c: customers.values()) {
						System.out.println(c);
					}
					
					break;
					
				
					
				case 8://Sort the customers as per dob and lastname 
					List<Customer> custList = new ArrayList<>(customersMap.values());
					Collections.sort(custList, new CustomerComparator());
					System.out.println("Customer Deatils after sorting as per dob and lastname");
					for(Customer c: custList) {
						System.out.println(c);
					}

					
					break;
					
				case 9://Remove all those customers whose subscription is pending for last 6 months
					System.out.println("Enter email and password of a customer");
					email = sc.next();
					c1 = findByEmailPassword(email,sc.next(),customersMap);
					LocalDate todaysDate = LocalDate.now();
					Period period = Period.between(c1.getLastSubscriptionPaidDate(), todaysDate);
					long months = period.toTotalMonths();
					if(months>6) {
						System.out.println("Customer is removed from the plan due to subscription is pending for last 6 months");
						System.out.println(c1);
						customersMap.remove(email);
					}
					else
						System.out.println("Customer already paid subscription");
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
