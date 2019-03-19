package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Test;


public class TextProcessorTest {

    @Test
    public void test_simple() {

        TextProcessor procesador = new TextProcessor();

        procesador.nueva("No");
        procesador.nueva("himporta");
        procesador.nueva("la");
        procesador.nueva("hortografia");

        assertEquals("No himporta la hortografia", procesador.texto());
    }

    @Test
    public void test_con_idioma() {

        TextProcessor procesador = new TextProcessor();

        procesador.nueva("Tengo");
        procesador.nueva("hambre");

        assertEquals("Tengo hambre", procesador.texto());

        assertTrue(procesador.correcto(Language.ES));
    }
}
