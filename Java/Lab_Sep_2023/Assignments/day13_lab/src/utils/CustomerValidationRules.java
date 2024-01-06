package utils;
import com.app.core.*;
import custom_exceptions.CustomerHandlingExceptions;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class CustomerValidationRules {
	
//	public static void checkDuplicateCustomer(String email,List<Customer> cust)throws CustomerHandlingExceptions {
//		Customer c1 = new Customer(email);
//		if(cust.contains(c1))
//			throw new CustomerHandlingExceptions("Customer cannot added due to duplicate email");
//		System.out.println("No duplicates");
//	}
	
	public static void checkDuplicate(String email,Map<String,Customer> cust) throws CustomerHandlingExceptions {
		if(cust.containsKey(email))
			throw new CustomerHandlingExceptions("Duplicate email is generated customer is already added");
		System.out.println("No Duplicates!!!");
	}
	
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	public static double validateRegAmount(double amount,ServicePlan plan)throws CustomerHandlingExceptions {
		
		if(plan.getCharges()==amount)
			return amount;
		else
			throw new CustomerHandlingExceptions("Registered amount doesn't match with "+plan.name()+" plans charges "+plan.getCharges());
			
		
	}
	
	public static Customer validateAll(String firstName, String lastName, String custEmail, String custPass,
			double amount, String dateOfBirth, String plan,String subScriptionDate,Map<String,Customer> custMap) 
					throws CustomerHandlingExceptions,IllegalArgumentException 
	{
		checkDuplicate(custEmail, custMap);
		ServicePlan sPlan = validatePlan(plan);
		double registrationAmount = validateRegAmount(amount,sPlan);
		LocalDate bDate = LocalDate.parse(dateOfBirth);
		LocalDate subDate = LocalDate.parse(subScriptionDate);
		return new Customer(firstName, lastName, custEmail, custPass, registrationAmount, bDate, sPlan,subDate);
	}
}
