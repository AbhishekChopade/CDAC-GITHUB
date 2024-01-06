package com.app.recurr;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return factorial(n-1)*n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println(fact);
	}

}
