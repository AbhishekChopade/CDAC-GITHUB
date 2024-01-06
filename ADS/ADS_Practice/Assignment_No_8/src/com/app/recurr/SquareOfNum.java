package com.app.recurr;

import java.util.Scanner;

public class SquareOfNum {
	public static int findSquare(int n) {
		if(n==0)
			return 0 ;
		int sq = findSquare(n-1)+(2*n)-1;
		return sq;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int sq = findSquare(n);
		System.out.println(sq);

	}

}
