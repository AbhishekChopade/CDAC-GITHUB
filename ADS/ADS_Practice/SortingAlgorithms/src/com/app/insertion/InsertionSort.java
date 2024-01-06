package com.app.insertion;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {87,34,12,56,23,77};
		//int j,temp;
		for(int i=1; i<arr.length; i++) {
			
			int temp = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>temp ) {//write j>=0 always  first
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		for(int i : arr) {
			System.out.println(i+", ");
		}
		
		

	}

}
