package org.lasencinas.example.copy;

import org.lasencinas.example.Book;
import org.lasencinas.publicEntity.Library;

public class BookCopy extends Copy {

    /* ---- Properties of the class ---- */
    private Book book = null;
    private String edition = null;


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

    public String getEdition() {
        return edition;
    }


    /* ---- Setters ----*/
    public void setBook(Book book) {
        this.book = book;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "book: '" +
                getBook() + "'" + "\n";
    }
}
