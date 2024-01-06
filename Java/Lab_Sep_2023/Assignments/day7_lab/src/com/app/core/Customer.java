package com.app.core;

public class Customer {
	private int cust_Id;
	private String cust_Name;
	private String cust_Address;
	//private static int id_cnt = 0;
	
	public Customer(int id,String name, String address) {
		cust_Id = id;
		cust_Name = name;
		cust_Address = address;
	}
	
	public int getId() {
		return cust_Id;
	}
	public String toString() {
		return "Customer : "+"cust_Id = "+cust_Id+" cust_Name = "+cust_Name+" cust_Address = "+cust_Address;
	}

}
