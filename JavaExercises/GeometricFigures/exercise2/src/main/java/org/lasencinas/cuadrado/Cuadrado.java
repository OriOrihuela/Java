package org.lasencinas.cuadrado;


import org.lasencinas.draw.Drawable;
import org.lasencinas.figuraGeometrica.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica implements Drawable {

    /* ---- Properties of the class ---- */
    private double lado = 0d;


    /* ---- Constructor ---- */
    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }


    /* ---- Getters ---- */
    public double getLado() {
        return lado;
    }


    /* ---- Setters ---- */
    public void setLado(double lado) {
        this.lado = lado;
    }


    /* ---- Main methods ---- */
    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }

    public void draw() {
        System.out.println("Y así se dibuja un " + this.getNombre() + " to maquinero");
    }
}
