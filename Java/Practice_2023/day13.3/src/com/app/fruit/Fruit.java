package com.app.fruit;

public abstract class Fruit {
	private String name;
	//private double price;
	public Fruit(String name) {
		super();
		this.name=name;
	}

	

	public String getName() {
		return name;
	}


	public abstract String taste();

}
