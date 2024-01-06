package com.cdac.core;

public class Point2D
{
	private int x;
	private int y;
	
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String show()
	{
		return "x = "+this.x+" "+"y = "+this.y;
	}
	
	public boolean isEqual(Point2D p)
	{
		if(this.x == p.x && this.y==p.y)
			return true;
		else
			return false;
	}
	
	public double calculateDistance(Point2D p)
	{
		return  Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
	}
	
}
