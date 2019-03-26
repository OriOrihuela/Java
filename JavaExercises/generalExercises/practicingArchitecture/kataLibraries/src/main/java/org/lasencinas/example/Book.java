package org.lasencinas.example;

import org.lasencinas.example.copy.BookCopy;
import org.lasencinas.publicEntity.TownHall;

import java.util.List;

public class Book extends Example {

    /* ---- Properties of the class ---- */
    private List<BookCopy> bookCopyList = null;
    private String author = null;


    /* ---- Constructor ---- */
    public Book() {
    }

    public Book(List<BookCopy> bookCopyList) {
        this.bookCopyList = bookCopyList;
    }

    public Book(String name, int ISBN, TownHall townHallWhereBelongs, List<BookCopy> bookCopyList) {
        super(name, ISBN, townHallWhereBelongs);
        this.bookCopyList = bookCopyList;
    }


    /* ---- Getters ---- */
    public List<BookCopy> getBookCopyList() {
        return bookCopyList;
    }

    public String getAuthor() {
        return author;
    }


    /* ----  Setters ---- */
    public void setBookCopyList(List<BookCopy> bookCopyList) {
        this.bookCopyList = bookCopyList;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "bookCopyList: " + getBookCopyList() + "\n" +
                super.toString() + "\n";
    }
}
