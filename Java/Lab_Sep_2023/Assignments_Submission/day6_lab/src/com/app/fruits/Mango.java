package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango(String color,double weight,boolean fresh) {
		super("Mango",color,weight,fresh);
	}
	
	@Override
	public String taste() {
		return "sweet";
	}
	
	public void pulp() {
		System.out.println(super.getColor()+" color "+super.getName()+" creating pulp! ");
	}
	@Override
	public String toString() {
		return "Mango : "+super.toString();
	}
}
