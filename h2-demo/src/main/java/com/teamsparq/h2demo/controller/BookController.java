package com.teamsparq.h2demo.controller;

import com.teamsparq.h2demo.entity.Book;
import com.teamsparq.h2demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/")
    public List<Book> findAllBooks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping("/{id}")
    Book newBook(@RequestBody Book newBook) {
        return repository.save(newBook);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    Optional<Book> updateBook(@RequestBody Book newBook, @PathVariable Integer id) {
        return Optional.of(repository.findById(id)
                .map(book -> {
                    book.setTitle(newBook.getTitle());
                    book.setAuthor(newBook.getAuthor());
                    book.setPages(newBook.getPages());
                    return repository.save(newBook);
                })
                .orElseGet(() -> {
                    newBook.setId(id);
                    return repository.save(newBook);
                }));
        }

    @DeleteMapping("/{id}")
    void deleteBook(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    }



