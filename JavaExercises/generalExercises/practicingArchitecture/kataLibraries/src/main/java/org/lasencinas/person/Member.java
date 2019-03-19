package org.lasencinas.person;

public class Member extends Person {

    /* ---- Properties of the class ---- */
    private int memberID = 0;
    private int idLibrary = 0;


    /* ---- Constructor ---- */
    public Member(String name, String surname, String dni) {
        super(name, surname, dni);
    }


    /* ---- Getters ---- */
    public int getMemberID() {
        return memberID;
    }

    public int getIdLibrary() {
        return idLibrary;
    }


    /* ---- Setters ---- */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setIdLibrary(int idLibrary) {
        this.idLibrary = idLibrary;
    }
}
