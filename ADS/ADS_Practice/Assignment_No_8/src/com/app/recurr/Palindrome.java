package com.app.recurr;

import java.util.Scanner;

public class Palindrome {
	static int sum ;
	public static int reverseNum(int n) {
		if(n==0) {
			return sum;
		}else {
		sum = ((sum*10)+(n%10));
		
		return reverseNum(n/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int rev = reverseNum(num);
		if(rev==num)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
		
		sc.close();
	}

}
