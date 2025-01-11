package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repository;
	
//	Constructor Injection
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}
	
	public String upsertBook(Book book) {
		
		Integer bookId = book.getBookId();
		
		System.out.println(book);
		
		repository.save(book);
		
		System.out.println(book);
		
		if(bookId==null) {
			return "Record Inserted";
		}
		else {
			return "Record Updated";
		}
		
	}
	
	public List<Book> getAllBooks() {
		
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		repository.deleteById(bookId);
		return "Book Deleted";
	}
	
}
