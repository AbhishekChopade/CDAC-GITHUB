package com.app.core;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getRegistrationAmount()>o2.getRegistrationAmount())
			return -1;
		if(o1.getRegistrationAmount()<o2.getRegistrationAmount())
			return 1;
		return 0;
		
	}
	

}
