package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.person.Person;

public class PersonTest {

    private Person person = null;
    private Person person2 = null;
    private Person person3 = null;

    @Before
    public void __init__() {
        person = new Person("Marta", "Croft", "45678921X");
        person2 = new Person("Pepe", "Viyuela", "12345678K");
        person3 = new Person("Robert", "Baratheon", "45632198H");
    }

    @Test
    public void constructorTest() {
        assertNotNull(person);
        assertNotNull(person2);
        assertNotNull(person3);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Marta", person.getName());
        assertEquals("Pepe", person2.getName());
        assertEquals("Robert", person3.getName());

        person.setDni("12345678Z");
        assertEquals("12345678Z", person.getDni());

        person3.setBirth("02/08/1993");
        assertEquals("02/08/1993", person3.getBirth());
    }

    @Test
    public void validateDNITest(){

        // It will print that the DNI corresponds to ... person.
        person.validateDNI("45678921X");

        // It will print that the DNI is invalid.
        person2.validateDNI("123");
    }
}
