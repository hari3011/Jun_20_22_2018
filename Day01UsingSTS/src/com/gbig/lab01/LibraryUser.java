package com.gbig.lab01;

import java.util.Iterator;

public class LibraryUser {

	public static void main(String[] args) {
		Library library = new Library();
		library.addBook("Ajax Hacks", 100, "Bruce Perry");
		library.addBook("Practical ExtJS4", 200, "Prabhu");
		library.addBook("Thinking in Java", 100, "Bruce Eckel");
		
		library.removeBook("Ajax Hacks");
		
		String details = library.printAllBooks();
		System.out.println(details);
		
		Iterator<Book> copy = library.getCopyOfAllBooks();
		while(copy.hasNext()) {
			System.out.println(copy.next());
		}
	}

}
