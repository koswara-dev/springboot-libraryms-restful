package com.example.projectlibrary.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectlibrary.model.Book;
import com.example.projectlibrary.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@PostMapping()
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Long id) {
		return bookService.getBookById(id);
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable Long id) {
		return bookService.deleteBook(id);
	}
}
