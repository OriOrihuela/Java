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
}
