package org.lasencinas.person;

import org.lasencinas.example.copy.BookCopy;
import org.lasencinas.example.copy.Copy;
import org.lasencinas.publicEntity.Library;

import java.util.List;

public class Employee extends Person {

    /* ---- Properties of the class ---- */
    private int employeeID = 0;
    private boolean wantsToBeEmployee = true;
    private Library libraryWhereWorks = null;
    private BookCopy[] bookCopiesList = null;
    private List<Copy> copyList = null;


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

    public BookCopy[] getBookCopiesList() {
        return bookCopiesList;
    }

    public List<Copy> getCopyList() {
        return copyList;
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

    /* ---- Behaviours --- */
    public void addBookCopy(BookCopy bookCopy) {
        for (int index = 0; index < getBookCopiesList().length; index++) {
            if (this.bookCopiesList[index].equals(null)) {
                this.bookCopiesList[index] = bookCopy;
            }
        }
    }

    public void addCopy(Copy copy) {
        getCopyList().add(copy);
    }
}
