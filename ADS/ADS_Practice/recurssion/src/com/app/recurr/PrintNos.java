package com.app.recurr;

public class PrintNos {
	
	public static void printNumNtoOne(int n) {
		if(n==0) {
			return;
		}
		
		printNumNtoOne(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		printNumNtoOne(5);

	}

}
