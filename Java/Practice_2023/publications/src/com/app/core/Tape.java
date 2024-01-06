package com.app.core;

import java.time.LocalDate;

public class Tape extends Publication {
	
	private int playingTime;
	
	public Tape(String pubTitle, double price, LocalDate publishDate, int rating,int playingTime) {
		super(pubTitle, price, publishDate, rating);
		this.playingTime = playingTime;
	}

	@Override
	public String toString() {
		return "Book ["+super.toString()+"playingTime=" + playingTime + "]";
	}

	
	
	
}
