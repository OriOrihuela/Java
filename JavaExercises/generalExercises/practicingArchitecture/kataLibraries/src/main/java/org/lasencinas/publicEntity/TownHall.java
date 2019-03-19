package org.lasencinas.publicEntity;

import java.util.ArrayList;
import java.util.List;

public class TownHall {

    /* ---- Properties of the class ---- */
    private String name = null;
    private List<Library> libraryList = new ArrayList<>();


    /* ---- Constructor ---- */
    public TownHall(String name, List<Library> libraryList) {
        this.name = name;
        this.libraryList = libraryList;
    }

    /* ---- Getters ---- */
    public String getName() {
        return name;
    }

    public List<Library> getLibraryList() {
        return libraryList;
    }


    /* ---- Setters ---- */
    public void setName(String name) {
        this.name = name;
    }

    public void setLibraryList(List<Library> libraryList) {
        this.libraryList = libraryList;
    }


    /* ---- Behaviours ---- */
    public Library createLibrary(PublicEntity publicEntity) {
        Library library = new Library();
        publicEntity = library;
        Library library1 = (Library)publicEntity;
        return library1;
    }

    public void addLibrary(Library library) {
        getLibraryList().add(library);
    }

    @Override
    public String toString() {
        return "name: '" + getName() + '\'' +
                ", libraryList: " + getLibraryList();
    }
}
