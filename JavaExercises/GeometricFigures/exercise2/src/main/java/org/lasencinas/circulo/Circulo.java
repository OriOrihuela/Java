package org.lasencinas.circulo;

import org.lasencinas.draw.Drawable;
import org.lasencinas.figuraGeometrica.FiguraGeometrica;

public class Circulo extends FiguraGeometrica implements Drawable {

    /* ---- Properties of the class ---- */
    private double radio = 0d;


    /* ---- Constructor ---- */
    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }


    /* ---- Getters ---- */
    public double getRadio() {
        return radio;
    }


    /* ---- Setters ----- */
    public void setRadio(double radio) {
        this.radio = radio;
    }


    /* ---- Main methods ---- */
    @Override
    public double area() {
        double PI = Math.PI;
        return PI * Math.pow(getRadio(), 2);
    }

    public void draw() {
        System.out.println("Y así se dibuja un " + this.getNombre() + " to maquinero");
    }
}
