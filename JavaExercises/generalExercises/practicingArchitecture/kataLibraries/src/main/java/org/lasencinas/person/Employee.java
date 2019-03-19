package org.lasencinas.person;

public class Employee extends Person {

    /* ---- Properties of the class ---- */
    private int employeeID = 0;
    private int idLibrary = 0;


    /* ---- Constructor ---- */
    public Employee() {}

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
