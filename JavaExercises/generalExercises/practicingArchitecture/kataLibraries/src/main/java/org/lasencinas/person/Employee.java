package org.lasencinas.person;

import org.lasencinas.publicEntity.Library;

public class Employee extends Person {

    /* ---- Properties of the class ---- */
    private int employeeID = 0;
    private boolean wantsToBeEmployee = true;
    private Library libraryWhereWorks = null;


    /* ---- Constructor ---- */
    public Employee() {}

    public Employee(String name, String surname, String dni) {
        super(name, surname, dni);
    }


    /* ---- Getters ---- */
    public int getEmployeeID() {
        return employeeID;
    }

    public boolean wantsToBeEmployee() {
        return wantsToBeEmployee;
    }

    public Library getLibraryWhereWorks() {
        return libraryWhereWorks;
    }


    /* ---- Setters ---- */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setWantsToBeEmployee(boolean wantsToBeEmployee) {
        this.wantsToBeEmployee = wantsToBeEmployee;
    }

    public void setLibraryWhereWorks(Library libraryWhereWorks) {
        this.libraryWhereWorks = libraryWhereWorks;
    }
}
