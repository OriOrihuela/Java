package org.lasencinas.example;

import org.lasencinas.publicEntity.Library;

public class Copy {

    /* ---- Properties of the class ---- */
    private Magazine magazine = null;
    private Library libraryWhereBelongs = null;


    /* ---- Constructor ---- */
    public Copy() {

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


    /* ---- Setters ---- */
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public void setLibraryWhereBelongs(Library libraryWhereBelongs) {
        this.libraryWhereBelongs = libraryWhereBelongs;
    }


    /* ---- Behaviours ---- */

    @Override
    public String toString() {
        return "magazine: '" + getMagazine() + "'" + "\n" +
                "libraryWhereBelongs: '" + getLibraryWhereBelongs() + "'" + "\n";
    }
}
