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
		customerList.add(new Customer("Ram", "Mane", "ram@gmail", "ram123", 2000, parse("2015-08-20"), ServicePlan.GOLD,parse("2023-02-13")));
		customerList.add(new Customer("Yash", "Patil", "yash@gmail", "yash123", 1000, parse("2019-12-22"), ServicePlan.SILVER,parse("2023-06-30")));
		customerList.add(new Customer("Om", "Ankle", "om@gmail", "om123", 2000, parse("2017-12-24"), ServicePlan.GOLD,parse("2023-08-15")));
		customerList.add(new Customer("Raj", "Shinde", "raj@gmail", "raj123", 10000, parse("2014-04-01"), ServicePlan.PLATINUM,parse("2023-03-06")));
		customerList.add(new Customer("Pavan", "Rane", "pavan@gmail", "pavan123", 5000, parse("2016-10-21"), ServicePlan.DIAMOND,parse("2023-09-17")));
		customerList.add(new Customer("Vidit", "Sagare", "vidit@gmail", "vidit123", 10000, parse("2016-10-21"), ServicePlan.PLATINUM,parse("2023-10-01")));
		customerList.add(new Customer("Rohit", "Kore", "rohit@gmail", "pavan123", 5000, parse("2018-01-01"), ServicePlan.DIAMOND,parse("2023-05-29")));
		return customerList;
	}
	
}
