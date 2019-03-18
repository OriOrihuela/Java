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
}
