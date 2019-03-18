package org.lasencinas.person;

import org.lasencinas.publicEntity.Library;

public class Employee extends Person {

    /* ---- Properties of the class ---- */
    private int employeeID = 0;
    private int idLibrary = null;


    /* ---- Constructor ---- */
    public Employee(String name, String surname, String dni) {
        super(name, surname, dni);
    }


    /* ---- Getters ---- */
    public int getEmployeeID() {
        return employeeID;
    }

    public int getIdLibrary() {
        return idLibrary;
    }


    /* ---- Setters ---- */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setIdLibrary(int idLibrary) {
        this.idLibrary = idLibrary;
    }
}
