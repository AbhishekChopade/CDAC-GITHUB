package com.app.fruits;

public class Fruit {
	//data members
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	
	public Fruit(String name,String color, double weight, boolean fresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = fresh;
	}

	public String taste() {
		return "no specific taste";
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getFresh() {
		return fresh;
	}
	
	public void setFruitStale() {
		this.fresh = false;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "Fruit : "+"name = "+name+", color = "+color+", weight = "+weight;
	}
	
	
}
