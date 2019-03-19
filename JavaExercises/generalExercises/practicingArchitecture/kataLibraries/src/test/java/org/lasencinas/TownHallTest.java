package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lasencinas.publicEntity.Library;
import org.lasencinas.publicEntity.PublicEntity;
import org.lasencinas.publicEntity.TownHall;

import java.util.ArrayList;
import java.util.List;

public class TownHallTest {

    private TownHall townHall = null;

    @Before
    public void __init__() {
        townHall = new TownHall("Ajuntament de Palma", null);

    }

    @Test
    public void constructorTest() {
        assertNotNull(townHall);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Ajuntament de Palma", townHall.getName());
        assertEquals(null, townHall.getLibraryList());

        townHall.setName("Bobobó");
        assertEquals("Bobobó", townHall.getName());

        Library library = new Library(001, "Biblioteca Can Sales", "C/ Pere, 12");
        List<Library> libraryList = new ArrayList<>();

        townHall.setLibraryList(libraryList);
        townHall.addLibrary(library);
        assertEquals(1, townHall.getLibraryList().size());
    }

    @Test
    public void toStringTest() {
        Library library = new Library(001, "Biblioteca Can Sales", "C/ Pere, 12");
        Library library2 = new Library(203, "Biblioteca Nacional", "Avenida Real");
        List<Library> libraryList = new ArrayList<>();
        townHall.setLibraryList(libraryList);
        townHall.addLibrary(library);
        townHall.addLibrary(library2);
        System.out.println(townHall.toString());
    }
}
