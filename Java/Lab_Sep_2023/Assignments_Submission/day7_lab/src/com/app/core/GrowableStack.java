package com.app.core;

public class GrowableStack implements Stack {
	int top = -1;

	Customer[] custArr = new Customer[STACK_SIZE];
	@Override
	public void push(Customer c) {
		if(top<STACK_SIZE-1) {
			custArr[++top]= c;
	    	System.out.println("Customer added into GrowableStack");
		}
		else{
			int size = 2*STACK_SIZE;
			Customer[] newArray = new Customer[size];
			for(int i=0;i<custArr.length;i++) {
				newArray[i] = custArr[i];
			}
			custArr = newArray;
			custArr[++top]= c;
			System.out.println("Customer added into GrowableStack");
		}
//			
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
	
	public void displayGrowableStack() {
		for(Customer c: custArr) {
			if(c!=null)
				System.out.println(c);
		}
	}
}
