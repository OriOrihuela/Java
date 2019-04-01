package org.lasencinas.example.copy;

import org.lasencinas.example.Magazine;
import org.lasencinas.person.Employee;
import org.lasencinas.person.Member;
import org.lasencinas.publicEntity.Library;

public class Copy {

    /* ---- Properties of the class ---- */
    private Magazine magazine = null;
    private Library libraryWhereBelongs = null;
    private String date = null;
    private boolean borrowed = false;
    private Member memberWhoOwnsIt = null;
    private Employee employeeWhoOwnsIt = null;


    /* ---- Constructor ---- */
    public Copy() {

    }

    public Copy(Library libraryWhereBelongs) {
        this.libraryWhereBelongs = libraryWhereBelongs;
    }

    public Copy(Magazine magazine, Library libraryWhereBelongs) {
        this.magazine = magazine;
        this.libraryWhereBelongs = libraryWhereBelongs;
    }


    /* ---- Getters ---- */
    public Magazine getMagazine() {
        return magazine;
    }

    public Library getLibraryWhereBelongs() {
        return libraryWhereBelongs;
    }

    public String getDate() {
        return date;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public Member getMemberWhoOwnsIt() {
        return memberWhoOwnsIt;
    }

    public Employee getEmployeeWhoOwnsIt() {
        return employeeWhoOwnsIt;
    }


    /* ---- Setters ---- */
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public void setLibraryWhereBelongs(Library libraryWhereBelongs) {
        this.libraryWhereBelongs = libraryWhereBelongs;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setMemberWhoOwnsIt(Member memberWhoOwnsIt) {
        this.memberWhoOwnsIt = memberWhoOwnsIt;
    }

    public void setEmployeeWhoOwnsIt(Employee employeeWhoOwnsIt) {
        this.employeeWhoOwnsIt = employeeWhoOwnsIt;
    }


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "magazine: '" + getMagazine() + "'" + "\n" +
                "libraryWhereBelongs: '" + getLibraryWhereBelongs() + "'" + "\n";
    }
}
