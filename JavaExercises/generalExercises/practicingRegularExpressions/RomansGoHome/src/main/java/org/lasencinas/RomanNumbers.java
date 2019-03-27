package org.lasencinas;

public enum RomanNumbers {

    /* ---- Enum Data types ---- */
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);


    /* ---- Properties ---- */
    private int value = 0;


    /* ---- Constructor ---- */
    RomanNumbers(int value) {
        this.value = value;
    }


    /* ---- Getters ---- */
    public int getValue() {
        return value;
    }
}
