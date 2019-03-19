package org.lasencinas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessor {


	private List<String> texto = new ArrayList<>();
	
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}
	
	public boolean correcto (Language language) {
		for (String palabra: texto) {
			if (! language.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
