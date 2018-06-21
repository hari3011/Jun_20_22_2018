package com.gbig.lab01;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Library2 {
	private Map<String, Book> books;
	public Library2() {
		books = new HashMap<>();
	}
	public void addBook(String title,double price,String author) {
		Book book = new Book(title, price, author);
		Stream<String> existingId = books
				.keySet()
				.stream()
				.filter(bookId -> bookId.equals(book.getId()));
		if(!existingId.findAny().isPresent())
			books.put(book.getId(), book);
	}

	public Iterator<Book> getCopyOfAllBooks(){
		ArrayList<Book> copyOfBooks = new ArrayList<>();
		books.forEach((bookId,book) -> {
			Book copyOfBook = new Book(book);
			copyOfBooks.add(copyOfBook);
		});
		return copyOfBooks.iterator();
	}

	public String printAllBooks() {
		StringBuilder details = new StringBuilder();
		books.forEach((bookId,book) -> details.append(book.toString()).append(("\n")));
		return details.toString();
	}

	public String printBookDetails(String author,String title) {
		StringBuilder details = new StringBuilder();
		if(title == null && author != null) {
			Book bookNeeded = books
					.values()
					.stream()
					.filter(book -> book.getAuthor().equals(author))
					.findAny().get();

			if(bookNeeded != null) {
				generateBookDetails(details, bookNeeded.getId(),bookNeeded);
				return details.toString();
			}
		}
		else{
			Book bookNeeded = books
					.values()
					.stream()
					.filter(book -> book.getAuthor().equals(author) && book.getTitle().equals(title))
					.findAny().get();

			if(bookNeeded != null) {
				generateBookDetails(details, bookNeeded.getId(),bookNeeded);
				return details.toString();
			}
		}
		return details.toString();
	}
	private void generateBookDetails(StringBuilder details, String bookId, Book book) {
		details.append(bookId);
		details.append("\n");
		details.append(book.getTitle());
		details.append("\n");
		details.append(book.getAuthor());
		details.append("\n");
		details.append(book.getPrice());
	}

	public void removeBook(String title) {
		Book bookToBeRemoved = books
				.values()
				.stream()
				.filter(book -> book.getTitle().equals(title))
				.findAny()
				.get();
		if(bookToBeRemoved != null) {
			books.remove(bookToBeRemoved.getId());
		}
	}
}
