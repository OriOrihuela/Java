package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.person.Person;
import org.lasencinas.publicEntity.Library;
import org.lasencinas.publicEntity.PublicEntity;
import org.lasencinas.publicEntity.TownHall;

public class PublicEntityTest {

    private PublicEntity publicEntity = null;
    private PublicEntity publicEntity2 = null;

    @Before
    public void __init__() {
        publicEntity = new Library(001, "Consell Balear", "C/ Matamusinos, 6");
    }

    @Test
    public void constructorTest() {
        assertNotNull(publicEntity);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Consell Balear", publicEntity.getEntityName());
        assertEquals(001, publicEntity.getEntityCode());
    }

    @Test
    public void toStringTest() {
        System.out.println(publicEntity.toString());
    }

    @Test
    public void showLibraryTest() {
        Person director = new Person("Adolfo", "Domínguez", "12354698P");
        TownHall townHall = new TownHall();
        Library library = new Library(003, "Cara", "Pito", director, townHall);
        PublicEntity.showLibrary(library);
    }
}
