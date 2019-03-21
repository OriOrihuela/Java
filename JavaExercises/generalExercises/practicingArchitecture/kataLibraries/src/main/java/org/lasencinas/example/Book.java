package org.lasencinas.example;

import org.lasencinas.publicEntity.TownHall;

import java.util.List;

public class Book extends Example {

    /* ---- Properties of the class ---- */
    private List<BookCopy> bookCopyList = null;


    /* ---- Constructor ---- */
    public Book(){}

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


    /* ----  Setters ---- */
    public void setBookCopyList(List<BookCopy> bookCopyList) {
        this.bookCopyList = bookCopyList;
    }


    /* ---- Behaviours ---- */

    @Override
    public String toString() {
        return "bookCopyList: '" + bookCopyList + "'" + "\n" +
                super.toString() + "\n";
    }
}
