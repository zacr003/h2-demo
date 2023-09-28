package com.teamsparq.h2demo.repository;

import com.teamsparq.h2demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
