package com.app.core;

import java.time.LocalDate;

public class Book extends Publication {
	
	private int pageCount;
	
	public Book(String pubTitle, double price, LocalDate publishDate, int rating,int pageCount) {
		super(pubTitle, price, publishDate, rating);
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book ["+super.toString()+"pageCount=" + pageCount + "]";
	}

	
	
	
}
