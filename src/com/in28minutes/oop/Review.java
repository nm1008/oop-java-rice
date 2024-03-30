package com.in28minutes.oop;

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("id is - %s, description is - %s, rating is - %s", id, description, rating);
	}
}
