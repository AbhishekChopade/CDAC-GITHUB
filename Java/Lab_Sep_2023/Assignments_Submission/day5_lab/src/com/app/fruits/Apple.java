package com.app.fruits;

public class Apple extends Fruit{
//	private String color;
//	private double weight;
//	private boolean fresh;
	
	public Apple(String color,double weight,boolean fresh) {
		super("Apple",color,weight,fresh);
	}
	
	@Override
	public String taste() {
		return "sweet n sour";
	}
	
	public void jam() {
		System.out.println(super.getName()+" making jam! ");
	}
	@Override
	public String toString() {
		return "Apple : "+super.toString();
	}
}
