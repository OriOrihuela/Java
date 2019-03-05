package org.lasencinas.cuadrado;


public class Cuadrado {

    /* ---- Properties of the class ---- */
    private String nombre = null;
    private double lado = 0d;


    /* ---- Constructor ---- */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }


    /* ---- Getters ---- */
    public String getNombre() {
        return nombre;
    }

    public double getLado() {
        return lado;
    }


    /* ---- Setters ---- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    /* ---- Main methods ---- */
}
