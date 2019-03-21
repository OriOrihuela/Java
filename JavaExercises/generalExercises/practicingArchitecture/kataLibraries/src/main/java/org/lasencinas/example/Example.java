package org.lasencinas.example;

import org.lasencinas.publicEntity.TownHall;

public abstract class Example {

    /* ---- Properties of the class ---- */
    private String name = null;
    private int ISBN = 0;
    private TownHall townHallWhereBelongs = null;


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


    /* ---- Behaviours ---- */

    @Override
    public String toString() {
        return "name: '" + getName() + '\'' + '\n' +
                "ISBN: '" + getISBN() + '\'' + '\n' +
                "townHallWhereBelongs: '" + getTownHallWhereBelongs() + '\'' + '\n';
    }
}
