package com.in28minutes.oop;

import java.util.ArrayList;

public class Book {
	private int bookId;
	private String bookName;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<Review>();

	public Book(int bookId, String bookName, String author, Review rating) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public void addReview(Review rating) {
		this.reviews.add(rating);
	}

	@Override
	public String toString() {
		return String.format("bookId is - %s, bookName is - %s, author is - %s, Reviews - [%s]", bookId, bookName,
				author, reviews);
	}

}
