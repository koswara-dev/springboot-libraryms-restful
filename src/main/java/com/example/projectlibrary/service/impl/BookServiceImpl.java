package com.example.projectlibrary.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.projectlibrary.model.Book;
import com.example.projectlibrary.repository.BookRepository;
import com.example.projectlibrary.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	@Override
	public Book getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	public Book updateBook(Book book) {
		Book existingBook = bookRepository.findById(book.getId()).orElse(null);
		existingBook.setISBN(book.getISBN());
		existingBook.setBookTitle(book.getBookTitle());
		existingBook.setPublicationYear(book.getPublicationYear());
		existingBook.setLanguage(book.getLanguage());
		existingBook.setAuthorName(book.getAuthorName());
		return bookRepository.save(existingBook);
	}
	
	public String deleteBook(Long id) {
		bookRepository.deleteById(id);
		return "Deleted book with id "+id;
	}
	
}
