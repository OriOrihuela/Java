package org.lasencinas.person;

import org.lasencinas.publicEntity.Library;

public class Member extends Person {

    /* ---- Properties of the class ---- */
    private int memberID = 0;
    private boolean wantsToBeMember = true;
    private Library associatedLibrary = null;


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

    public boolean wantsToBeMember() {
        return wantsToBeMember;
    }

    public Library getAssociatedLibrary() {
        return associatedLibrary;
    }


    /* ---- Setters ---- */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setWantsToBeMember(boolean wantsToBeMember) {
        this.wantsToBeMember = wantsToBeMember;
    }

    public void setAssociatedLibrary(Library associatedLibrary) {
        this.associatedLibrary = associatedLibrary;
    }
}
