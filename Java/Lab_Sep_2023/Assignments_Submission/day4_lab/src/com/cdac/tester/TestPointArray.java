package com.cdac.tester;
import java.util.Scanner;
import com.cdac.core.*;

public class TestPointArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points to make : ");
		Point2D[] points = new Point2D[sc.nextInt()];
		int cnt=0;
		boolean flag = true;
		//int choice;
		while(flag) {
			System.out.println("----------------------------------------");
			System.out.println("Enter the following choices :");
			System.out.println("1. Plot a point");
			System.out.println("2. Display x,y co-ordinates of all the points");
			System.out.println("3. Check the points are same or not");
			System.out.println("0. Exit");
			System.out.println("----------------------------------------");
			System.out.println();
			switch(sc.nextInt())
			{
			case 1://Plot a point
				
				//check first boundry condition
				int i;
				if(cnt<points.length) {
					//Inputs : array index, x  ,y co-ordinates
					 System.out.println("Enter the index = ");
					 i = sc.nextInt();
					 //System.out.println(points[i]);//!=null);
					 if(points[i]==null && i>=0 && i<points.length) {
						System.out.println("Enter x & y co-ordinates of a point :");
					    points[i] = new Point2D(sc.nextInt(),sc.nextInt());
					    cnt++;
					    System.out.println("Point is plotted");
					}
				    else {
				    	System.out.println("Invalid Index");
				    }
				}
				else
					System.out.println("Point Array is full ");
				
				break;
				
			case 2://Display x,y co-ordinates of all the points
				
				for(Point2D p:points) {
					if(p!=null) {
						System.out.println("Points x & y co-ordinates :");
						System.out.println(p.show());
					}
				}
				break;
				
			case 3://Check the points are same or not
				System.out.println("Enter two indices :");
				int j = sc.nextInt();
				int k = sc.nextInt();
				if(j<points.length && k<points.length && j>=0 && k>=0) {
					if(points[j].isEqual(points[k]))
						System.out.println("Points are same");
					else
					{
						System.out.println("Points are different ");
						System.out.println("Distance between two points = ");
						System.out.print(points[j].calculateDistance(points[k]));
						System.out.println();
					}
				}
				else
					System.out.println("Invalid Index");
				break;
			case 0://exit
				flag = false;
				break;
			
			
			}
			
				
			
		}
		
		
		sc.close();
	}

}
