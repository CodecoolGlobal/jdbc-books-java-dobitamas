package com.codecool.books;

import com.codecool.books.model.Author;

public class Book {
    private Author author;
    private String title;

    public Book(Author author, String title){
        this.setAuthor(author);
        this.setTitle(title);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
