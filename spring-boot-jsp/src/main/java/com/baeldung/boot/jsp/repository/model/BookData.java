package com.baeldung.boot.jsp.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="books")
public class BookData {
	@Id
	@Column (name="bk_isbn")
    private String isbn;
	@Column (name="bk_name")
    private String name;
	@Column (name="bk_author")
    private String author;
	
	@Override
	public String toString() {
		return "BookData [isbn=" + isbn + ", name=" + name + ", author=" + author + "]";
	}

	
}