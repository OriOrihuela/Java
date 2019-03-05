package org.lasencinas.circulo;

public class Circulo {

    /* ---- Properties of the class ---- */
    private String nombre = null;
    private double radio = 0d;


    /* ---- Constructor ---- */
    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }


    /* ---- Getters ---- */
    public String getNombre() {
        return nombre;
    }

    public double getRadio() {
        return radio;
    }


    /* ---- Setters ----- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    /* ---- Main methods ---- */
}
