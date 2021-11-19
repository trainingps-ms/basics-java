package com.lms.entity;

import java.util.List;

public class Library {
	int id;
	String name;
	String category;
	List<Book> books;
	
	public boolean addBook(Book book) {
		return books.add(book);
	}
}
