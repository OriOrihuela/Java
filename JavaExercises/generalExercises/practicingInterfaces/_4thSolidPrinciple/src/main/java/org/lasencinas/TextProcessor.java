package org.lasencinas;

import org.lasencinas.interfaces.Checkeable;
import org.lasencinas.interfaces.Processable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessor implements Checkeable, Processable {

    /* ---- Properties of the class ---- */
    private List<String> texto = new ArrayList<>();


    /* ---- Getters ---- */
    public List<String> getTexto() {
        return texto;
    }


    /* ---- Setters ---- */
    public void setTexto(List<String> texto) {
        this.texto = texto;
    }

    public void addWord(String word) {
        texto.add(word);
    }

    public String joinText() {
        return texto.stream().collect(Collectors.joining(" "));
    }

    public boolean correct(Language language) {
        for (String palabra : texto) {
            if (!language.diccionario.contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
