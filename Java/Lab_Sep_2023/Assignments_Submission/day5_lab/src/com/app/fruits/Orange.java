package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange(String color,double weight,boolean fresh) {
		super("Orange",color,weight,fresh);
	}
	
	@Override
	public String taste() {
		return "sour";
	}
	
	public void juice() {
		System.out.println(super.getName()+" of weight "+super.getWeight()+"g extracting juice!");
	}
	@Override
	public String toString() {
		return "Orange : "+super.toString();
	}
}
