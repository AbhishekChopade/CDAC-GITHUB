package com.app.quick;

import java.util.Arrays;

public class QuickSort {
	public static int partition(int[] arr,int low,int high) {
		int i = low - 1;
		int pivot = arr[high];
	
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		
		return i;
	}
	public  static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pInd = partition(arr, low, high);
			
			quickSort(arr, 0, pInd-1);
			quickSort(arr, pInd+1, high);
		}
	}
	

	public static void main(String[] args) {
		int[] arr = {7,2,8,3,1,6,9,5,4};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("After Sort : "+Arrays.toString(arr));
		

	}

}
