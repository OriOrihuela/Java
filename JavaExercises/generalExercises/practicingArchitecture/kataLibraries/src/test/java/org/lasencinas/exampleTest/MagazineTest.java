package org.lasencinas.exampleTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.example.Magazine;
import org.lasencinas.example.copy.Copy;
import org.lasencinas.publicEntity.TownHall;

import java.util.ArrayList;
import java.util.List;

public class MagazineTest {

    private Magazine magazine = null;


    @Before
    public void __init__() {
        magazine = new Magazine("Pronto", 236, null, null);
    }

    @Test
    public void constructorTest() {
        assertNotNull(magazine);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Pronto", magazine.getName());
        assertEquals(236, magazine.getISBN());
        assertEquals(null, magazine.getTownHallWhereBelongs());

        TownHall townHall = new TownHall();
        List<Copy> copyList = new ArrayList<>();

        magazine.setCopyList(copyList);
        magazine.setTownHallWhereBelongs(townHall);
        assertNotNull(magazine.getTownHallWhereBelongs());
        assertNotNull(magazine.getCopyList());
    }

    @Test
    public void toStringTest() {
        TownHall townHall = new TownHall();
        List<Copy> copyList = new ArrayList<>();

        magazine.setCopyList(copyList);
        magazine.setTownHallWhereBelongs(townHall);
        System.out.println(magazine);
    }
}
