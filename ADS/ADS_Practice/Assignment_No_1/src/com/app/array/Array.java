package com.app.array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			 
			System.out.println("Enter the count of elements: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
	     
			boolean exit = false;
			
			System.out.println("Enter the elements of the array: ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			while(!exit) {
				
				System.out.println("Enter Options :\n"+"1. Display the array\n"+"2. Reverse the array\n"
				+"3. Replace the nth element from the array and print\n"+"4. Find the addition of all elements of the array\n"
				+"5. Find the maximum number from the array\n"+"6. Print the average of all the elements from the array\n"
				+"7. Display the even and odd number from the array separately\n"+"0. Exit\n");
				
				switch (sc.nextInt()) {
				case 1:
					displayArray(arr);
					break;
					
				case 2:
					reverseArray(arr);
					displayArray(arr);
					break;
					
				case 3:
					System.out.println("Enter the index of the element to be replaced: ");
					int index = sc.nextInt();
					System.out.println("Enter the new element: ");
					int newValue = sc.nextInt();
					replaceElement(arr, index, newValue);
					displayArray(arr);
					break;
					
				case 4:
					int sum = findSum(arr);
					System.out.println("The sum of all elements of the array is: " + sum);
					break;
					
				case 5:
					int max = findMax(arr);
					System.out.println("The maximum element in the array is: " + max);
					break;
					
				case 6:
					float average = findAverage(arr);
					System.out.println("The average of all elements of the array is: " + average);
					break;
					
				case 7:
					displayEvenOddNumbers(arr);
					break;
					
				case 0 : 
					exit = true;
					System.out.println("Exit!!!!!");
					break;
				}
			}
		}
	}

	
	public static void displayArray(int[] arr) {
		System.out.println("The array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	

	public static void reverseArray(int[] arr)
 
	{
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


	public static void replaceElement(int[] arr, int index, int newValue) {
	    arr[index] = newValue;
	}

	public static int findSum(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum;
	}

	public static int findMax(int[] arr) {
	    int max = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    return max;
	}


	public static float findAverage(int[] arr) {
	    int sum = findSum(arr);
	    float average = (float) sum / arr.length;
	    return average;
	}
	
	
	public static void displayEvenOddNumbers(int[] arr) {
	    System.out.println("Even numbers: ");
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] % 2 == 0) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    System.out.println();
	
	    System.out.println("Odd numbers: ");
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] % 2 != 0) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    System.out.println();

	}

}

