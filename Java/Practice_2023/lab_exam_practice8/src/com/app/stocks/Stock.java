package com.app.stocks;

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable{
	private String stockId;
	private String stockName;
	private String companyName;
	private double stockPrice;
	private LocalDate closingDate;
	private int stocksQuantity;
	
	
	

	public Stock(String stockId, String stockName, String companyName, double stockPrice, LocalDate closingDate,
			int stocksQuantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.companyName = companyName;
		this.stockPrice = stockPrice;
		this.closingDate = closingDate;
		this.stocksQuantity = stocksQuantity;
	}
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", companyName=" + companyName
				+ ", stockPrice=" + stockPrice + ", closingDate=" + closingDate + ", stocksQuantity=" + stocksQuantity + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getStockId() {
		return stockId;
	}

	public int getQuantity() {
		return stocksQuantity;
	}

	public void setQuantity(int quantity) {
		this.stocksQuantity = quantity;
	}

	
	
	
}
