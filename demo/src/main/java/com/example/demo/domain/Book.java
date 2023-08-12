package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book {
    @ManyToMany
            @JoinTable(name="author_book",joinColumns = @JoinColumn(name="book_Id"),inverseJoinColumns = @JoinColumn(name = "author_Id"))
    Set<Author> authors;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    String isbn;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
