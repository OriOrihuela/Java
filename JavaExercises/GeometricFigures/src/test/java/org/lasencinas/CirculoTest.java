package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.circulo.Circulo;

public class CirculoTest {

    private Circulo circulo = null;
    private Circulo circulo2 = null;
    private Circulo circulo3 = null;

    @Before
    public void __init__() {
        circulo = new Circulo();
        circulo2 = new Circulo("Círculo", 5);
        circulo3 = new Circulo(10);
    }

    @Test
    public void constructorTest() {
        assertNotNull(circulo);
        assertNotNull(circulo2);
        assertNotNull(circulo3);
    }

    @Test
    public void gettersTest() {
        assertEquals("unknown", circulo.getNombre());
        assertEquals("Círculo", circulo2.getNombre());
        assertEquals(10, circulo3.getRadio(), 0.01);
    }

    @Test
    public void settersTest() {
        circulo.setNombre("Papagallo");
        assertEquals("Papagallo", circulo.getNombre());

        circulo.setRadio(40);
        assertEquals(40, circulo.getRadio(), 0.01);

        circulo2.setRadio(20);
        circulo2.setNombre("Madafakerr");
        assertEquals("Madafakerr", circulo2.getNombre());
        assertEquals(20, circulo2.getRadio(), 0.01);
    }

    @Test
    public void areaTest() {
        assertEquals(0.0, circulo.area(), 0.01);
        assertEquals(78.539, circulo2.area(), 0.01);
        assertEquals(314.159, circulo3.area(), 0.01);
    }
}
