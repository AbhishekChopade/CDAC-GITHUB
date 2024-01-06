package com.app.arr;

	


public class Array {
	private int arr[];
	private int size;
	private int i = -1;
	
	public Array(int s) {
		size = s;
		arr = new int[size];
	}
	
	public boolean isFull() {
		return (i==size-1);
	}
	public boolean isEmpty() {
		return i==-1;
	}
	public void addElem(int a) {
		if(isFull())
			throw new RuntimeException("Array is full") ;
			
		arr[++i] = a;
	}
	
	public void display() {
		if(isEmpty())
			throw new RuntimeException("Array is empty") ;
		
		for(int j:arr) {
			System.out.print(j+", ");
		}
		System.out.println();
	}
	
	public void reverse() {
		if(isEmpty())
			throw new RuntimeException("Array is empty") ;
		int i = 0;
		int j = size-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public int replace(int pos,int elem) {
		if(pos<0 || pos>=size)
			throw new RuntimeException("Invalid postiton") ;
		arr[pos] = elem;
		return arr[pos];
	}
	
	public int getSum() {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
	public int getMax() {
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	
	public double getAvg() {
		int sum = getSum();
		
		
		double avg = sum/size;
		
		return avg;
	}
	
	public void displayEvenAndOdd() {
		System.out.println("Even numbers :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		System.out.println("Odd numbers :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+", ");
		}
		
		
	}
	
	
}
