package com.example.projectlibrary.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="books")
public class Book {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	@Column()
	private String isbn;
	@Column()
	private String bookTitle;
	@Column()
	private int publicationYear;
	@Column()
	private String language;
	@Column()
	private String authorName;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getISBN() {
		return isbn;
	}
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
