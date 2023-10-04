package com.teamsparq.h2demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Integer pages;

    private String author;

    protected Book() {}

    public Book(Integer id, String title, Integer pages, String author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format(
                "Book :[id=%d, title='%s', pages='%d', author='%s]",
                id, title, pages, author);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
