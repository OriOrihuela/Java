package org.lasencinas.person;

public class Employee extends Person {

    /* ---- Properties of the class ---- */
    private int employeeID = 0;
    private int idLibrary = 0;
    private boolean wantsToBeEmployee = true;


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

    public boolean wantsToBeEmployee() {
        return wantsToBeEmployee;
    }

    /* ---- Setters ---- */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setIdLibrary(int idLibrary) {
        this.idLibrary = idLibrary;
    }

    public void setWantsToBeEmployee(boolean wantsToBeEmployee) {
        this.wantsToBeEmployee = wantsToBeEmployee;
    }
}
