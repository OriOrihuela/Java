package org.lasencinas.elipse;

import org.lasencinas.draw.Drawable;
import org.lasencinas.figuraGeometrica.FiguraGeometrica;

public class Elipse extends FiguraGeometrica implements Drawable {

    /* ---- Properties of the class ---- */
    private double ejeMayor = 0d;
    private double ejeMenor = 0d;


    /* ---- Constructor ---- */
    public Elipse() {
        super();
    }

    public Elipse(double ejeMayor, double ejeMenor) {
        super();
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public Elipse(String nombre, double ejeMayor, double ejeMenor) {
        super(nombre);
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }


    /* ---- Getters ---- */
    public double getEjeMayor() {
        return ejeMayor;
    }

    public double getEjeMenor() {
        return ejeMenor;
    }


    /* ---- Setters ---- */
    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public void setEjeMenor(double ejeMenor) {
        this.ejeMenor = ejeMenor;
    }


    /* ---- Main methods ---- */
    @Override
    public double area() {
        double PI = Math.PI;
        return PI * getEjeMayor() * getEjeMenor();
    }

    public void draw() {
        System.out.println("Y así se dibuja una " + this.getNombre() + " to maquinera");
    }

    public void applyTheme() {
        System.out.println("Dándole un toque Fucsia a la " + this.getNombre() + ", ¡hacemos que luzca hermosa!");
    }
}
