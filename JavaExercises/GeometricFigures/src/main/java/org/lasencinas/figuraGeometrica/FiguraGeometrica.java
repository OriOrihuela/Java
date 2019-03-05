package org.lasencinas.figuraGeometrica;

public abstract class FiguraGeometrica {

    /* ---- Propiedades de la clase ---- */
    private String nombre = null;


    /* ---- Constructor ---- */
    public FiguraGeometrica() {
        this.nombre = "unknown";
    }
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
    public abstract double area();
}
