package org.lasencinas;

import java.util.Arrays;
import java.util.List;

public enum Language {

    EN("I", "am", "hungry"),
    ES("tengo", "hambre"),
    CA("tenc", "fam");

    List<String> diccionario;

    Language(String... palabras) {
        this.diccionario = Arrays.asList(palabras);
    }
}