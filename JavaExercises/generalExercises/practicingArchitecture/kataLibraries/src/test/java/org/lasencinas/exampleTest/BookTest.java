package org.lasencinas.exampleTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.example.Book;
import org.lasencinas.example.copy.BookCopy;
import org.lasencinas.publicEntity.TownHall;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

    private Book book = null;

    @Before
    public void __init__() {
        book = new Book("Las Dos Torres", 789, null, null);
    }

    @Test
    public void constructorTest() {
        assertNotNull(book);
    }

    @Test
    public void gettersAndSettersTest() {
        TownHall townHall = new TownHall(001, "Ajuntament de Palma", "C/ Real, 12");
        book.setTownHallWhereBelongs(townHall);

        List<BookCopy> bookCopyList = new ArrayList<>();
        Book book2 = new Book("Las Dos Torres", 789, null, null);
        Book book3 = new Book("Las Dos Torres", 789, null, null);
        Book book4 = new Book("Las Dos Torres", 789, null, null);

        BookCopy bookCopy = new BookCopy(book2);
        BookCopy bookCopy2 = new BookCopy(book2);
        BookCopy bookCopy3 = new BookCopy(book2);

        bookCopyList.add(bookCopy);
        bookCopyList.add(bookCopy2);
        bookCopyList.add(bookCopy3);


        book.setBookCopyList(bookCopyList);
        assertEquals(townHall, book.getTownHallWhereBelongs());
        assertEquals(3, book.getBookCopyList().size());

        System.out.println(book.toString()); // Yet to fix why the toString() method does not work properly :/
    }

    @Test
    public void toStringTest() {
        System.out.println(book.toString());
    }
}
