package com.app.core;

import java.time.LocalDate;

public class Publication {
	
	private int pubId;
	private String pubTitle;
	private double price;
	private LocalDate publishDate;
	private int rating;
	private static int idGenerator;
	static {
		idGenerator = 100;
	}
	
	public Publication(String pubTitle, double price, LocalDate publishDate, int rating) {
		super();
		this.pubId = ++idGenerator;
		this.pubTitle = pubTitle;
		this.price = price;
		this.publishDate = publishDate;
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public int getPubId() {
		return pubId;
	}

	@Override
	public String toString() {
		return "Publication [pubId=" + pubId + ", pubTitle=" + pubTitle + ", price=" + price + ", publishDate="
				+ publishDate + ", rating=" + rating + "]";
	}

	public String getPubTitle() {
		return pubTitle;
	}
	
	

}
