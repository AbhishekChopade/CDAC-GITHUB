package com.app.recurr;

public class SquareOfNum {
	public static int findSquare(int n) {
		if(n==0)
			return 0 ;
		int sq = findSquare(n-1)+(2*n)-1;
		return sq;
	}
	public static void main(String[] args) {
		int sq = findSquare(2);
		System.out.println(sq);

	}

}
