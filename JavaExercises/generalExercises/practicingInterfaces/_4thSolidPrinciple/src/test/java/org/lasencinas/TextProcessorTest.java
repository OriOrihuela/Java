package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Test;


public class TextProcessorTest {

    @Test
    public void test_simple() {

        TextProcessor procesador = new TextProcessor();

        procesador.addWord("No");
        procesador.addWord("himporta");
        procesador.addWord("la");
        procesador.addWord("hortografia");

        assertEquals("No himporta la hortografia", procesador.joinText());
    }

    @Test
    public void test_con_idioma() {

        TextProcessor procesador = new TextProcessor();

        procesador.addWord("Tengo");
        procesador.addWord("hambre");

        assertEquals("Tengo hambre", procesador.joinText());

        assertTrue(procesador.correct(Language.ES));
    }
}
