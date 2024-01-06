package com.app.core;

public class FixedStack implements Stack {
	int top = -1;

	Customer[] custArr = new Customer[STACK_SIZE];
	@Override
	public void push(Customer c) {
		if(top<STACK_SIZE-1) {
			custArr[++top]= c;
	    	System.out.println("Customer added into FixedStack");
		}
		else
			System.out.println("FixedStack is full");
	}
	
	public Customer pop() {
		if(top>=0) {
			Customer cust = custArr[top];
			custArr[top--] = null;
			
			return cust;
		}
		else
		{	System.out.println("NO stack chosen !!!");
			return null;
		}
		
		
	}
	
	public void displayFixedStack() {
		for(Customer c: custArr) {
			if(c!=null)
				System.out.println(c);
		}
	}
}
