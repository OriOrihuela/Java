package org.lasencinas;

import java.util.Arrays;
import java.util.List;

public enum Language {
	
	EN ("I","am","angry"), 
	ES ("tengo","hambre"), 
	CA ("tenc", "fam");
	
	List<String> diccionario;

	private Language(String ... palabras) {
		this.diccionario = Arrays.asList(palabras);
	}
	

}
