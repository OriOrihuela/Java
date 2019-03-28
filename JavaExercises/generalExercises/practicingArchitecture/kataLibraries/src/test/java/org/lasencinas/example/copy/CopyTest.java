package org.lasencinas.example.copy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.example.Magazine;
import org.lasencinas.publicEntity.Library;


public class CopyTest {

    private Copy copy = null;

    @Before
    public void __init__() {
        copy = new Copy(null, null);
    }

    @Test
    public void constructorTest() {
        assertNotNull(copy);
    }

    @Test
    public void gettersAndSettersTest() {
        Magazine magazine = new Magazine();
        Library library = new Library(998, "Biblioteca Nacional", "Avenida Papaya, 5");
        Copy copy = new Copy(magazine, library);

        assertNotNull(copy.getLibraryWhereBelongs());
        assertNotNull(copy.getMagazine());

        Magazine magazine1 = new Magazine();
        Library library1 = new Library();
        copy.setMagazine(magazine1);
        copy.setLibraryWhereBelongs(library1);
        assertEquals(magazine1, copy.getMagazine());
        assertEquals(library1, copy.getLibraryWhereBelongs());
    }

    @Test
    public void toStringTest() {
        System.out.println(copy.toString());
    }
}
