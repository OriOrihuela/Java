package org.lasencinas.person;

public class Member extends Person {

    /* ---- Properties of the class ---- */
    private int memberID = 0;
    private int idLibrary = 0;
    private boolean wantsToBeMember = true;


    /* ---- Constructor ---- */
    public Member() {

    }
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

    public boolean wantsToBeMember() {
        return wantsToBeMember;
    }

    /* ---- Setters ---- */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setIdLibrary(int idLibrary) {
        this.idLibrary = idLibrary;
    }

    public void setWantsToBeMember(boolean wantsToBeMember) {
        this.wantsToBeMember = wantsToBeMember;
    }
}
