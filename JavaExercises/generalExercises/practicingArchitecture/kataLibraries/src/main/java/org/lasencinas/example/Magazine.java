package org.lasencinas.example;

import org.lasencinas.example.copy.Copy;
import org.lasencinas.publicEntity.TownHall;

import java.util.List;

public class Magazine extends Example {

    /* ---- Properties of the class ---- */
    private List<Copy> copyList = null;
    private String year = null;
    private String month = null;
    private int idNumber = 0;


    /* ---- Constructor ---- */
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

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getIdNumber() {
        return idNumber;
    }


    /* ---- Setters ---- */
    public void setCopyList(List<Copy> copyList) {
        this.copyList = copyList;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


    /* ---- Behaviours ---- */
    @Override
    public String toString() {
        return "copyList: '" + getCopyList() + "'" + "\n" +
                super.toString() + "\n";
    }
}
