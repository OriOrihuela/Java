package org.lasencinas.person;

import org.lasencinas.example.copy.BookCopy;
import org.lasencinas.publicEntity.Library;

public class Member extends Person {

    /* ---- Properties of the class ---- */
    private int memberID = 0;
    private boolean wantsToBeMember = true;
    private Library associatedLibrary = null;
    private BookCopy[] bookCopiesList = null;


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

    public BookCopy[] getBookCopiesList() {
        return bookCopiesList;
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


    /* ---- Behaviours ---- */
    public void addBookCopy(BookCopy bookCopy) {
        for (int index = 0; index < getBookCopiesList().length; index++) {
            if (this.bookCopiesList[index].equals(null)) {
                this.bookCopiesList[index] = bookCopy;
            }
        }
    }
}
