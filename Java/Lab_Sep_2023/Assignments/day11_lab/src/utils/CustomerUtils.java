package utils;

import java.util.ArrayList;
import java.util.List;
import com.app.core.*;
import static java.time.LocalDate.parse;
import com.app.core.ServicePlan;
import custom_exceptions.*;

public class CustomerUtils {
	public static Customer findByEmailPassword(String email,String password,List<Customer> custList) throws CustomerHandlingExceptions {
		
		Customer cust = new Customer(email);
		int index = custList.indexOf(cust);
		
		if (index == -1) // => not found !
			throw new CustomerHandlingExceptions("Invalid email");
		if(!((custList.get(index).getPassword()).equals(password)))
			throw new CustomerHandlingExceptions("Invalid Password");
		else		
		    return custList.get(index);
	}
	
	public static List<Customer> populateCustomer(){
		List<Customer> customerList =  new ArrayList<>();
		customerList.add(new Customer("Ram", "Mane", "ram@gmail", "ram123", 2000, parse("2020-08-20"), ServicePlan.GOLD));
		customerList.add(new Customer("Yash", "Patil", "yash@gmail", "yash123", 1000, parse("2019-12-22"), ServicePlan.SILVER));
		customerList.add(new Customer("Om", "Ankle", "om@gmail", "om123", 2000, parse("2023-12-24"), ServicePlan.GOLD));
		customerList.add(new Customer("Raj", "Shinde", "raj@gmail", "raj123", 10000, parse("2021-04-01"), ServicePlan.PLATINUM));
		customerList.add(new Customer("Pavan", "Rane", "pavan@gmail", "pavan123", 5000, parse("2020-10-21"), ServicePlan.DIAMOND));
		return customerList;
	}
	
}
