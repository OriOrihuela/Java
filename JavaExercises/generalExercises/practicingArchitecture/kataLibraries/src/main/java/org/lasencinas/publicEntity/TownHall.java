package org.lasencinas.publicEntity;

import org.lasencinas.example.Example;
import org.lasencinas.person.Person;

import java.util.ArrayList;
import java.util.List;

public class TownHall extends PublicEntity {

    /* ---- Properties of the class ---- */
    private Person major = null;
    private List<Example> exampleList = null;
    private List<Library> libraryList = null;


    /* ---- Constructor ---- */
    public TownHall() {
    }

    public TownHall(int entityCode, String entityName, String address) {
        super(entityCode, entityName, address);
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

    public List<Example> getExampleList() {
        return exampleList;
    }


    /* ---- Behaviours ---- */
    public Library createLibrary() {
        Library library = new Library();
        return library;
    }

    public void createLibraryList() {
        this.libraryList = new ArrayList<>();
    }

    public void addLibrary(Library library) {
        getLibraryList().add(library);
    }

    public void createExampleList() {
        this.exampleList = new ArrayList<>();
    }

    public void addExample(Example example) {
        getExampleList().add(example);
    }

    public void addMajor(Person major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "major: '" + getMajor() + '\'' + '\n' +
                "exampleList: '" + getExampleList() + '\'' + '\n' +
                "libraryList: " + getLibraryList() + '\n' +
                super.toString();
    }
}
