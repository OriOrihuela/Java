package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.elipse.Elipse;

public class ElipseTest {

    private Elipse elipse = null;
    private Elipse elipse2 = null;
    private Elipse elipse3 = null;

    @Before
    public void __init__() {
        elipse = new Elipse();
        elipse2 = new Elipse("Elipse", 50, 30);
        elipse3 = new Elipse(10, 5);
    }

    @Test
    public void constructorTest() {
        assertNotNull(elipse);
        assertNotNull(elipse2);
        assertNotNull(elipse3);
    }

    @Test
    public void gettersTest() {
        assertEquals("unknown", elipse.getNombre());
        assertEquals("Elipse", elipse2.getNombre());
        assertEquals(50, elipse2.getEjeMayor(), 0.01);
        assertEquals(5, elipse3.getEjeMenor(), 0.01);
    }

    @Test
    public void settersTest() {
        elipse.setNombre("Papagallo");
        assertEquals("Papagallo", elipse.getNombre());

        elipse.setEjeMayor(40);
        assertEquals(40, elipse.getEjeMayor(), 0.01);

        elipse2.setEjeMenor(20);
        elipse2.setNombre("Madafakerr");
        assertEquals("Madafakerr", elipse2.getNombre());
        assertEquals(20, elipse2.getEjeMenor(), 0.01);
    }

    @Test
    public void areaTest() {
        assertEquals(0.0, elipse.area(), 0.01);
        assertEquals(4712.388, elipse2.area(), 0.01);
        assertEquals(157.079, elipse3.area(), 0.01);
    }
}
