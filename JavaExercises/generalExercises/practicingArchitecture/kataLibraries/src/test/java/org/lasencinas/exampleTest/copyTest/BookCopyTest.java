package org.lasencinas.exampleTest.copyTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.example.Book;
import org.lasencinas.example.copy.BookCopy;
import org.lasencinas.publicEntity.Library;

public class BookCopyTest {

    private BookCopy bookCopy = null;

    @Before
    public void __init__() {
        Library library = new Library();
        Book book = new Book();
        bookCopy = new BookCopy(library, book);
    }

    @Test
    public void constructorTest() {
        assertNotNull(bookCopy);
    }

    @Test
    public void gettersAndSettersTest() {
        Book book2 = new Book();
        Library library2 = new Library();
        bookCopy.setBook(book2);
        bookCopy.setLibraryWhereBelongs(library2);
        assertEquals(book2, bookCopy.getBook());
        assertEquals(library2, bookCopy.getLibraryWhereBelongs());
    }

    @Test
    public void toStringTest() {
        System.out.println(bookCopy.toString());
    }
}
