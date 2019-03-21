package org.lasencinas.exampleTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.example.Book;
import org.lasencinas.example.Example;
import org.lasencinas.example.Magazine;

public class ExampleTest {

    private Example example = null;
    private Example example2 = null;

    @Before
    public void __init__() {
        example = new Book("El Hobbit", 0123, null, null);
        example2 = new Magazine("Pronto", 456, null, null);
    }

    @Test
    public void constructorTest() {
        assertNotNull(example);
        assertNotNull(example2);
    }

    @Test
    public void gettersAndSettersTest() {
        example.setISBN(999);
        example.setName("El Retorno del Rey");
        assertEquals(999, example.getISBN());
        assertEquals("El Retorno del Rey", example.getName());

        assertEquals(null, example2.getTownHallWhereBelongs());
    }

    @Test
    public void toStringTest() {
        System.out.println(example.toString());
        System.out.println(example2.toString());
    }

}
