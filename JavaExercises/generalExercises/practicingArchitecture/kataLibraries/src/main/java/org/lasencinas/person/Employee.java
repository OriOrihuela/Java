package org.lasencinas.person;

import org.lasencinas.publicEntity.Library;

public class Employee extends Person {

    /* ---- Properties of the class ---- */
    private int employeeID = 0;
    private Library idLibrary = null;


    /* ---- Constructor ---- */
    public Employee(String name, String surname, String dni, int employeeID, Library idLibrary) {
        super(name, surname, dni);
        this.employeeID = employeeID;
        this.idLibrary = idLibrary;
    }


    /* ---- Getters ---- */
    public int getEmployeeID() {
        return employeeID;
    }

    public Library getIdLibrary() {
        return idLibrary;
    }


    /* ---- Setters ---- */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setIdLibrary(Library idLibrary) {
        this.idLibrary = idLibrary;
    }
}
