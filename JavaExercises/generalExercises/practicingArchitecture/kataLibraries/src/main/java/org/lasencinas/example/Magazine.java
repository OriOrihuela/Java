package org.lasencinas.example;

import org.lasencinas.publicEntity.TownHall;

import java.util.List;

public class Magazine extends Example {

    /* ---- Properties of the class ---- */
    private List<Copy> copyList = null;


    /* ---- Cosntructor ---- */
    public Magazine() {

    }

    public Magazine(List<Copy> copyList) {
        this.copyList = copyList;
    }

    public Magazine(String name, int ISBN, TownHall townHallWhereBelongs, List<Copy> copyList) {
        super(name, ISBN, townHallWhereBelongs);
        this.copyList = copyList;
    }


    /* ---- Getters ---- */
    public List<Copy> getCopyList() {
        return copyList;
    }


    /* ---- Setters ---- */
    public void setCopyList(List<Copy> copyList) {
        this.copyList = copyList;
    }


    /* ---- Behaviours ---- */

    @Override
    public String toString() {
        return "copyList: '" + getCopyList() + "'" + "\n" +
                super.toString() + "\n";
    }
}
