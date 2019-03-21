package org.lasencinas.example.copy;

import org.lasencinas.example.Book;
import org.lasencinas.publicEntity.Library;

public class BookCopy extends Copy {

    /* ---- Properties of the class ---- */
    private Book book = null;


    /* ---- Constructor ---- */
    public BookCopy() {

    }

    public BookCopy(Book book) {
        this.book = book;
    }

    public BookCopy(Library libraryWhereBelongs, Book book) {
        super(libraryWhereBelongs);
        this.book = book;
    }

    /* ---- Getters ---- */
    public Book getBook() {
        return book;
    }


    /* ---- Setters ----*/
    public void setBook(Book book) {
        this.book = book;
    }


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "book: '" +
                getBook() + "'" + "\n";
    }
}
