package com.teamsparq.h2demo.repository;

import com.teamsparq.h2demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;


public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitle(String title);

    List<Book> findByPages(Integer pages);

    List<Book> findByAuthor(String author);

    Optional<Book> findById(Integer id);

}
