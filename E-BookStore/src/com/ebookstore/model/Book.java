package com.ebookstore.model;

public class Book extends Title {

	private String author;

	public Book(String title, String desc, Integer price, String author) {
		super(title, desc, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
