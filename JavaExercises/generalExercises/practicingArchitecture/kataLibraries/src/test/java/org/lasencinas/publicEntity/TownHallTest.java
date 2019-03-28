package org.lasencinas.publicEntity;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.example.Example;
import org.lasencinas.example.Magazine;
import org.lasencinas.person.Person;


public class TownHallTest {

    private TownHall townHall = null;
    private Person major = null;

    @Before
    public void __init__() {
        major = new Person("Adolfo", "Domínguez", "54632189K");
        townHall = new TownHall(001, "Ajuntament de Palma", "C/ Avenida Real, 12");
    }

    @Test
    public void constructorTest() {
        assertNotNull(townHall);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Ajuntament de Palma", townHall.getEntityName());


        townHall.setEntityName("Bobobó");
        assertEquals("Bobobó", townHall.getEntityName());

        townHall.createLibraryList();
        Library library = townHall.createLibrary();
        townHall.addLibrary(library);
        assertEquals(1, townHall.getLibraryList().size());

        townHall.addMajor(major);
        assertEquals(major, townHall.getMajor());

        townHall.createExampleList();
        Example example = new Magazine();
        townHall.addExample(example);
        assertNotNull(townHall.getExampleList());
    }

    @Test
    public void toStringTest() {
        townHall.createExampleList();
        Example example = new Magazine();
        townHall.addExample(example);

        townHall.createLibraryList();
        Library library = townHall.createLibrary();
        townHall.addLibrary(library);

        townHall.addMajor(major);

        System.out.println(townHall.toString());
    }

    @Test
    public void createAndAddLibraryTest() {
        Library library = townHall.createLibrary();
        townHall.createLibraryList();
        townHall.addLibrary(library);
        assertNotNull(townHall.getLibraryList());
    }
}
