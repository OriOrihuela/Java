package org.lasencinas.example;

import org.lasencinas.publicEntity.TownHall;

public abstract class Example {

    /* ---- Properties of the class ---- */
    private String name = null;
    private int ISBN = 0;
    private TownHall townHallWhereBelongs = null;
    private String editorial = null;
    private String title = null;


    /* ---- Constructor ---- */
    public Example(){}

    public Example(String name, int ISBN, TownHall townHallWhereBelongs) {
        this.name = name;
        this.ISBN = ISBN;
        this.townHallWhereBelongs = townHallWhereBelongs;
    }

    /* ---- Getters ---- */
    public TownHall getTownHallWhereBelongs() {
        return townHallWhereBelongs;
    }

    public String getName() {
        return name;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTitle() {
        return title;
    }


    /* ---- Setters ---- */
    public void setTownHallWhereBelongs(TownHall townHallWhereBelongs) {
        this.townHallWhereBelongs = townHallWhereBelongs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "name: '" + getName() + '\'' + '\n' +
                "ISBN: '" + getISBN() + '\'' + '\n' +
                "townHallWhereBelongs: '" + getTownHallWhereBelongs() + '\'' + '\n';
    }
}
