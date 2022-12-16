package com.baeldung.boot.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.boot.jsp.repository.model.BookData;

/**
 * Interfaz que, al extender de JpaRepository, resuelve los métodos
 * @author Marta Rodriguez
 *
 */
public interface JpaFullRepository extends JpaRepository<BookData, String>{
	
}
