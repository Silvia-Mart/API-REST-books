package com.books.api.controller;

import com.books.api.models.Book;
import com.books.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> listarLivros ()
    {
        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    public Book listarLivroUnico(@PathVariable(value = "id") long id)
    {
        return bookRepository.findById(id);
    }

    @GetMapping("/books/autor/{autor}")
    @Transactional
    public Book listarLivrosAutor(@PathVariable(value = "autor")String autor)
    {
     return bookRepository.findByAutor(autor);
    }

    @PostMapping("/books")
    public Book salvarLivros(@RequestBody @Validated Book book)
    {
        return bookRepository.save(book);
    }

    @PutMapping("/books")
    public Book atualizarLivros(@RequestBody @Validated Book book)
    {
        return bookRepository.save(book);
    }

    @DeleteMapping("/books/{id}")
    public void deletarLivros(@PathVariable(value = "id")long id)
    {
        Book book = bookRepository.findById(id);
        bookRepository.delete(book);
    }
}
