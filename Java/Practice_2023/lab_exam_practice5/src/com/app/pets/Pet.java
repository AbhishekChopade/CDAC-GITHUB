package com.app.pets;

public class Pet {
	private int petId;
	private String petName;
	private Category category;
	private double unitPrice;
	private int stocks;
	
	
	public Pet(int petId, String petName, Category category, double unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}


	
	public int getPetId() {
		return petId;
	}


	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}



	public int getStocks() {
		return stocks;
	}



	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	
	
	
}
