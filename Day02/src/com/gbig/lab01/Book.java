package com.gbig.lab01;

import java.util.UUID;

public class Book {
	private String id;
	private String title;
	private double price;
	private String author;
	
	
	@Override
	public String toString() {
		return id + ": " + title + "(" + price + "), " + author; 
	}
	public Book(String title, double price, String author) {
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.price = price;
		this.author = author;
	}
	public Book(Book book) {
		this.id = book.getId();
		this.price = book.getPrice();
		this.title = book.getTitle();
		this.author = book.getAuthor();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
