package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.person.Person;
import org.lasencinas.publicEntity.Library;
import org.lasencinas.publicEntity.TownHall;

import java.util.ArrayList;
import java.util.List;

public class TownHallTest {

    private TownHall townHall = null;
    private Person major = null;
    private List<Library> libraryList = null;

    @Before
    public void __init__() {
        major = new Person("Adolfo", "Domínguez", "54632189K");
        libraryList = new ArrayList<>();
        townHall = new TownHall(001, "Ajuntament de Palma", "C/ Matamusinos,7", major,
                libraryList);
    }

    @Test
    public void constructorTest() {
        assertNotNull(townHall);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Ajuntament de Palma", townHall.getEntityName());
        assertNotNull(townHall.getLibraryList());

        townHall.setEntityName("Bobobó");
        assertEquals("Bobobó", townHall.getEntityName());

        Library library = new Library(001, "Biblioteca Can Sales", "C/ Pere, 12");
        List<Library> libraryList1 = new ArrayList<>();

        townHall.setLibraryList(libraryList1);
        townHall.addLibrary(library);
        assertEquals(1, townHall.getLibraryList().size());
    }

    @Test
    public void toStringTest() {
        Library library = new Library(001, "Biblioteca Can Sales", "C/ Pere, 12");
        Library library2 = new Library(203, "Biblioteca Nacional", "Avenida Real");
        townHall.setLibraryList(libraryList);
        townHall.addLibrary(library);
        townHall.addLibrary(library2);
        System.out.println(townHall.toString());
    }
}
