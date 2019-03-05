package org.lasencinas.figuraGeometrica;

public class FiguraGeometrica {

    /* ---- Propiedades de la clase ---- */
    private String nombre = null;


    /* ---- Constructor ---- */
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }


    /* ---- Getters ----- */
    public String getNombre() {
        return nombre;
    }


    /* ---- Setters ---- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /* ---- Main behaviours ---- */
    public double area() {
        return 0;
    }
}
