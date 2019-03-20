package org.lasencinas.publicEntity;

import org.lasencinas.person.Person;

import java.util.ArrayList;
import java.util.List;

public class TownHall extends PublicEntity {

    /* ---- Properties of the class ---- */
    private Person major = null;
    private List<Library> libraryList = new ArrayList<>();


    /* ---- Constructor ---- */
    public TownHall() {
    }

    public TownHall(int entityCode, String entityName, String address, Person major, List<Library> libraryList) {
        super(entityCode, entityName, address);
        this.major = major;
        this.libraryList = libraryList;
    }


    /* ---- Getters ---- */
    public List<Library> getLibraryList() {
        return libraryList;
    }

    public Person getMajor() {
        return major;
    }

    /* ---- Setters ---- */
    public void setLibraryList(List<Library> libraryList) {
        this.libraryList = libraryList;
    }

    public void setMajor(Person major) {
        this.major = major;
    }

    /* ---- Behaviours ---- */
    public Library createLibrary(PublicEntity publicEntity) {
        Library library = new Library();
        publicEntity = library;
        Library library1 = (Library) publicEntity;
        return library1;
    }

    public void addLibrary(Library library) {
        getLibraryList().add(library);
    }

    @Override
    public String toString() {
        return "major: " + "\n" + getMajor() + "\n"+
                "libraryList: " + getLibraryList() + "\n"
               + super.toString();
    }
}
