package com.teamsparq.h2demo.repository;

import com.teamsparq.h2demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);

    List<Book> findByPages(Integer pages);

    List<Book> findByAuthor(String author);

    Book findById(long id);
}
