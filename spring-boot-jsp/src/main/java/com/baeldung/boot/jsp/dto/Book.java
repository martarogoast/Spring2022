package com.baeldung.boot.jsp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private String isbn;
    private String name;
    private String author;
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Book(String isbn, String name, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}

	public Book() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
}