package com.app.recurr;

public class FibbonacciSeries {
	public static void fibbonacciSeries(int a,int b,int n) {
		if(n==0) {
			return ;
		}
		int c = a+b;
		System.out.println(c);
		fibbonacciSeries(b, c, n-1);
		
		
	}
	public static void main(String[] args) {
		int n = 7;
		fibbonacciSeries(0, 1, n-2);

	}

}
