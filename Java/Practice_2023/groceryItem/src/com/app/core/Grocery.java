package com.app.core;

import java.time.LocalDate;

public class Grocery {
	private String groceryName;
	private double pricePerUnit;
	private int stockQuantity;
	private LocalDate listDate;
	private LocalDate updateDate;
	
	public Grocery(String groceryName) {
		this.groceryName = groceryName;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
		this.updateDate = LocalDate.now();
	}
	public Grocery(String groceryName, double pricePerUnit, int stockQuantity, LocalDate listDate) {
		super();
		this.groceryName = groceryName;
		this.pricePerUnit = pricePerUnit;
		this.stockQuantity = stockQuantity;
		this.listDate = listDate;
		this.updateDate = listDate;
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Grocery) {
			Grocery g = (Grocery)obj;
			return groceryName.equals(g.groceryName);
		}
		return false;
	}




	@Override
	public String toString() {
		return "Grocery [groceryName=" + groceryName + ", pricePerUnit=" + pricePerUnit + ", stockQuantity="
				+ stockQuantity + ", listDate=" + listDate + ", updateDate=" + updateDate + "]";
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}


	
	
}
