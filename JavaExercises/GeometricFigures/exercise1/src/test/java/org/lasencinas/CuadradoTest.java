package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.cuadrado.Cuadrado;

public class CuadradoTest {

    private Cuadrado cuadrado = null;
    private Cuadrado cuadrado2 = null;
    private Cuadrado cuadrado3 = null;

    @Before
    public void __init__() {
        cuadrado = new Cuadrado();
        cuadrado2 = new Cuadrado("Cuadrado", 5);
        cuadrado3 = new Cuadrado(10);
    }

    @Test
    public void constructorTest() {
        assertNotNull(cuadrado);
        assertNotNull(cuadrado2);
        assertNotNull(cuadrado3);
    }

    @Test
    public void gettersTest() {
        assertEquals("unknown", cuadrado.getNombre());
        assertEquals("Cuadrado", cuadrado2.getNombre());
        assertEquals(10, cuadrado3.getLado(), 0.01);
    }

    @Test
    public void settersTest() {
        cuadrado.setNombre("Papagallo");
        assertEquals("Papagallo", cuadrado.getNombre());

        cuadrado.setLado(40);
        assertEquals(40, cuadrado.getLado(), 0.01);

        cuadrado2.setLado(20);
        cuadrado2.setNombre("Madafakerr");
        assertEquals("Madafakerr", cuadrado2.getNombre());
        assertEquals(20, cuadrado2.getLado(), 0.01);
    }

    @Test
    public void areaTest() {
        assertEquals(0.0, cuadrado.area(), 0.01);
        assertEquals(25, cuadrado2.area(), 0.01);
        assertEquals(100, cuadrado3.area(), 0.01);
    }
}
