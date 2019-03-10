package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testAll() {
        Employee emp = new Employee();
        emp.setName("John Jacobs");
        String empName = emp.getName();
        assertEquals("John Jacobs", emp.getName());
        System.out.println("Employee Name: " + empName);
    }
}
