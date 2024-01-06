package com.app.recurr;

public class SumOfAllDigits {
	public static int sumOfDigits(int n) {
		int rem,sum;
		if(n!=0) {
			rem = n%10;
			sum = rem + sumOfDigits(n/10);
			return sum;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sumOfDigits(12354);
		System.out.println(sum);
	}

}
