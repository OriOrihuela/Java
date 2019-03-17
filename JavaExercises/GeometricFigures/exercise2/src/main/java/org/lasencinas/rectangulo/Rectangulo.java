package org.lasencinas.rectangulo;

import org.lasencinas.figuraGeometrica.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    /* ---- Properties of the class ---- */
    private double lado = 0d;
    private double base = 0d;


    /* ---- Constructor ---- */
    public Rectangulo() {
        super();
    }

    public Rectangulo(double lado, double base) {
        super();
        this.lado = lado;
        this.base = base;
    }

    public Rectangulo(String nombre, double lado, double base) {
        super(nombre);
        this.lado = lado;
        this.base = base;
    }


    /* ---- Getters ---- */
    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }


    /* ---- Setters ---- */
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setBase(double base) {
        this.base = base;
    }


    /* ---- Main methods ---- */
    @Override
    public double area() {
        return getBase() * getLado();
    }
}
