package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.rectangulo.Rectangulo;

public class RectanguloTest {

    private Rectangulo rectangulo = null;
    private Rectangulo rectangulo2 = null;
    private Rectangulo rectangulo3 = null;

    @Before
    public void __init__() {
        rectangulo = new Rectangulo();
        rectangulo2 = new Rectangulo("Rectangulo", 50, 30);
        rectangulo3 = new Rectangulo(10, 5);
    }

    @Test
    public void constructorTest() {
        assertNotNull(rectangulo);
        assertNotNull(rectangulo2);
        assertNotNull(rectangulo3);
    }

    @Test
    public void gettersTest() {
        assertEquals("unknown", rectangulo.getNombre());
        assertEquals("Rectangulo", rectangulo2.getNombre());
        assertEquals(50, rectangulo2.getLado(), 0.01);
        assertEquals(5, rectangulo3.getBase(), 0.01);
    }

    @Test
    public void settersTest() {
        rectangulo.setNombre("Papagallo");
        assertEquals("Papagallo", rectangulo.getNombre());

        rectangulo.setLado(40);
        assertEquals(40, rectangulo.getLado(), 0.01);

        rectangulo2.setBase(20);
        rectangulo2.setNombre("Madafakerr");
        assertEquals("Madafakerr", rectangulo2.getNombre());
        assertEquals(20, rectangulo2.getBase(), 0.01);
    }

    @Test
    public void areaTest() {
        assertEquals(0.0, rectangulo.area(), 0.01);
        assertEquals(1500, rectangulo2.area(), 0.01);
        assertEquals(50, rectangulo3.area(), 0.01);
    }
}
