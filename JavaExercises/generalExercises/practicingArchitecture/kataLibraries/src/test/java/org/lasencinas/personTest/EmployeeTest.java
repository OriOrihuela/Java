package org.lasencinas.personTest;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.person.Employee;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee = null;
    private Employee employee2 = null;
    private Employee employee3 = null;

    @Before
    public void __init__() {
        employee = new Employee("Marta", "Croft", "45678921X");
        employee2 = new Employee("Pepe", "Viyuela", "12345678K");
        employee3 = new Employee("Robert", "Baratheon", "45632198H");
    }

    @Test
    public void constructorTest() {
        assertNotNull(employee);
        assertNotNull(employee2);
        assertNotNull(employee3);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals("Marta", employee.getName());
        assertEquals("Pepe", employee2.getName());
        assertEquals("Robert", employee3.getName());

        employee.setDni("12345678Z");
        assertEquals("12345678Z", employee.getDni());

        employee3.setBirth("02/08/1993");
        assertEquals("02/08/1993", employee3.getBirth());

        employee2.setEmployeeID(020);
        assertEquals(020, employee2.getEmployeeID());
    }
}