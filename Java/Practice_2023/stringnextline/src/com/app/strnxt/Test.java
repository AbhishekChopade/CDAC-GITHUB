package com.app.strnxt;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string1 and sring2");
//		
//		String s2 = sc.next();
//		String s1 = sc.nextLine();
//		System.out.println(s1);
//		System.out.println(s2);
		
//		System.out.println("Enter  str1 and str2 ");
//		String1 string = new String1(sc.nextLine(), sc.nextInt(),sc.next());
//		System.out.println(string);
		int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length+1];
        arr2[0] = 1;
        System.out.println(Arrays.toString(arr2));
	}
}
