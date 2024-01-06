package com.app.recurr;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int sum = sumOfDigits(n);
		System.out.println(sum);
	}

}
