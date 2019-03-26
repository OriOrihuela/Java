package org.lasencinas.example.copy;

import org.lasencinas.example.Magazine;
import org.lasencinas.publicEntity.Library;

public class Copy {

    /* ---- Properties of the class ---- */
    private Magazine magazine = null;
    private Library libraryWhereBelongs = null;
    private String date = null;


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


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "magazine: '" + getMagazine() + "'" + "\n" +
                "libraryWhereBelongs: '" + getLibraryWhereBelongs() + "'" + "\n";
    }
}
