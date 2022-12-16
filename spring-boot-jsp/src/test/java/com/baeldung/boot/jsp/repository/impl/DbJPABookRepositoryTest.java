package com.baeldung.boot.jsp.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.model.BookData;

@SpringBootTest
class DbJPABookRepositoryTest {

	@Autowired
	BookRepository bookRepo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindAll() {
		assertEquals(7, bookRepo.findAll().size());
	}

	@Test
	void testFindById() {
		assertFalse(bookRepo.findById("123").isEmpty());
		assertTrue(bookRepo.findById("666").isEmpty());
		assertEquals("123", bookRepo.findById("123").get().getIsbn());
	}

	@Test
	void testAdd() {
		BookData book = new BookData("1", "Test libro", "Test Autor");
		BookData savedBook = bookRepo.add(book);
		assertEquals(book.toString(), savedBook.toString());
	}

}
