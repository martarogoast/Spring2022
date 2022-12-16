package com.baeldung.boot.jsp.repository.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.JpaFullRepository;
import com.baeldung.boot.jsp.repository.model.BookData;

@Component
public class DbJPABookRepository implements BookRepository {
	@Autowired
	private JpaFullRepository jpaRepo;
	
	@Override
	public Collection<BookData> findAll() {
		return jpaRepo.findAll();
	}

	@Override
	public Optional<BookData> findById(String isbn) {
		return jpaRepo.findById(isbn);
	}

	@Override
	public BookData add(BookData book) {
		return jpaRepo.save(book);
	}
	
}
