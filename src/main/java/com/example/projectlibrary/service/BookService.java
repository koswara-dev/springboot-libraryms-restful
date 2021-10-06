package com.example.projectlibrary.service;

import java.util.List;

import com.example.projectlibrary.model.Book;

public interface BookService {
	Book saveBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(Long id);
	Book updateBook(Book book);
	String deleteBook(Long id);
}
