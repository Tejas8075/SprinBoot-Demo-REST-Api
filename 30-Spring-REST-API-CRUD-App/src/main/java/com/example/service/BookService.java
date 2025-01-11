package com.example.service;

import java.util.List;

import com.example.entity.Book;

public interface BookService {

//	String is taken as return type because we have to return String as an Output when our operation is completed
	
//	upsert = insert + update using save()
	public String upsertBook(Book book);
	
//	retrieve
	public List<Book> getAllBooks();
	
//	update
//	public String updateBook(Book book);
	
//	delete
	public String deleteBook(Integer bookId);
	
}
