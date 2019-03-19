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
        publicEntity = new PublicEntity(001, "Consell Balear", "C/ Matamusinos, 6");
        publicEntity2 = new PublicEntity(002, "Parlamento", "Avenida Real, 12");
    }

    @Test
    public void constructorTest() {
        assertNotNull(publicEntity);
        assertNotNull(publicEntity2);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Consell Balear", publicEntity.getEntityName());
        assertEquals(001, publicEntity.getEntityCode());
        assertEquals("Avenida Real, 12", publicEntity2.getAddress());
    }

    @Test
    public void toStringTest() {
        System.out.println(publicEntity.toString());
    }

    @Test
    public void showLibraryTest() {
        Person director = new Person("Adolfo", "Domínguez", "12354698P");
        TownHall townHall = new TownHall("Ajuntament de Palma", null);
        Library library = new Library(003, "Cara", "Pito", director, townHall);
        PublicEntity.showLibrary(library);
    }
}
