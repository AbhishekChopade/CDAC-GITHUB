package com.cdac.tester;

import java.util.Scanner;

import com.cdac.core.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		Box[] boxes=new Box[sc.nextInt()];
		System.out.println("Name of Box[] class "+boxes.getClass());
		System.out.println("Init def array contents");
		for(Box b : boxes)
			System.out.println(b);//null : def value of ref type var=null
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims : w d h");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		System.out.println("array contents again ");
		for(Box b : boxes) {
			System.out.println(b);//not null(hashCode)
			//display dims n vol
			System.out.println(b.getBoxDetails());
			System.out.println("Volume "+b.getBoxVolume());			
		}	
		
		//Double box width for all boxes having volume > 100.(Can you use for-each & solve this)
		for(Box b:boxes) {
			if(b.getBoxVolume()>100)
				b.setBoxWidth(b.getBoxWidth()*2);
		}
		
		for(Box b : boxes) {
			//System.out.println("The updated details of boxes whose vol is greater than 100 :");
			//display dims n vol
			if(b.getBoxVolume()>100) {
				System.out.println("The updated details of boxes whose vol is greater than 100 :");
				System.out.println(b.getBoxDetails());
				System.out.println("The new volume of boxes whose old volume is greater than 100 :");
			    System.out.println("Volume "+b.getBoxVolume());		
			}
		}	
		
		
		sc.close();
		

	}

}
