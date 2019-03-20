package org.lasencinas;

import java.util.Arrays;
import java.util.List;

public enum Planeta {

    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    /* ---- Properties of the class ---- */
    private Double masa = 0d;
    private Double radio = 0d;


    /* ---- Constructors ---- */
    Planeta(Double masa, Double radio) {
        this.masa = masa;
        this.radio = radio;
    }


    /* ---- Getters ---- */
    public Double getMasa() {
        return masa;
    }

    public Double getRadio() {
        return radio;
    }


    /* ---- Setters ---- */
    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    /* ---- Behaviours ---- */
    public Double pesoSuperficie(Double peso) {

    }
}
