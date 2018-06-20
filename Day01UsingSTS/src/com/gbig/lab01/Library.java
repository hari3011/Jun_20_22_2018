package com.gbig.lab01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Library {
	private Map<String, Book> books;
	public Library() {
		books = new HashMap<>();
	}
	public void addBook(String title,double price,String author) {
		Book book = new Book(title, price, author);
		if(books.get(book.getId()) == null)
			books.put(book.getId(), book);
	}
	
	public Iterator<Book> getCopyOfAllBooks(){
		ArrayList<Book> copyOfBooks = new ArrayList<>();
		Set<String> bookIds = books.keySet();
		for (String bookId : bookIds) {
			Book book = books.get(bookId);
			Book copyOfBook = new Book(book);
			copyOfBooks.add(copyOfBook);
		}
		return copyOfBooks.iterator();
	}
	
	public String printAllBooks() {
		StringBuilder details = new StringBuilder();
		Set<String> bookIds = books.keySet();
		for (String bookId : bookIds) {
			Book book = books.get(bookId);
			details.append(book.toString());
			details.append("\n");
		}
		return details.toString();
	}
	
	public String printBookDetails(String author,String title) {
		StringBuilder details = new StringBuilder();
		Set<String> bookIds = books.keySet();
		for (String bookId : bookIds) {
			Book book = books.get(bookId);
			if(title == null && book.getAuthor().equals(author)) {
				generateBookDetails(details, bookId, book);
				break;
			}
			else if(title.equals(book.getTitle()) && book.getAuthor().equals(author)) {
				generateBookDetails(details, bookId, book);
				break;
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
		Set<String> bookIds = books.keySet();
		String bookIdToBeRemoved = null;
		for (String bookId : bookIds) {
			Book book = books.get(bookId);
			if(book.getTitle().equals(title)) {
				bookIdToBeRemoved = bookId;
				break;
			}
		}
		if(bookIdToBeRemoved != null) {
			books.remove(bookIdToBeRemoved);
		}
	}
}
