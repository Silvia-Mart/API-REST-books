package com.books.api.repository;

import com.books.api.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findById(long id);
    Book findByAutor(String autor);
}
