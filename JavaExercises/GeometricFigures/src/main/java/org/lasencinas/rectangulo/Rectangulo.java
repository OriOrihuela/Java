package org.lasencinas.rectangulo;

public class Rectangulo {

    /* ---- Properties of the class ---- */
    private String nombre = null;
    private double lado = 0d;
    private double base = 0d;


    /* ---- Constructor ---- */
    public Rectangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    public Rectangulo(String nombre, double lado, double base) {
        this.nombre = nombre;
        this.lado = lado;
        this.base = base;
    }


    /* ---- Getters ---- */
    public String getNombre() {
        return nombre;
    }

    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }


    /* ---- Setters ---- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setBase(double base) {
        this.base = base;
    }


    /* ---- Main methods ---- */
}
