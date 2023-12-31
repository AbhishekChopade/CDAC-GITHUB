package com.app.merge;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] arr,int left,int right) {
		if(left>=right)
			return;
		
		int mid = (left+right)/2;
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		int[] temp = new int[right-left+1];
		int i = left,j=mid+1,k=0;
		while(i<=mid&&j<=right) {
			if(arr[i]<arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		
		while(i<=mid)
			temp[k++] = arr[i++];
		while(j<=right)
			temp[k++] = arr[j++];
		
		for(i=0;i<temp.length;i++) {
			arr[left+i]=temp[i];
		}
			
	}

	public static void main(String[] args) {
		int[] arr = {7,2,8,3,1,6,9,5,4};
		System.out.println("Before Sort : "+Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("After Sort : "+Arrays.toString(arr));

	}

}
