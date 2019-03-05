package org.lasencinas.elipse;

public class Elipse {

    /* ---- Properties of the class ---- */
    private String nombre = null;
    private double ejeMayor = 0d;
    private double ejeMenor = 0d;


    /* ---- Constructor ---- */
    public Elipse(double ejeMayor, double ejeMenor) {
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public Elipse(String nombre, double ejeMayor, double ejeMenor) {
        this.nombre = nombre;
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }


    /* ---- Getters ---- */
    public String getNombre() {
        return nombre;
    }

    public double getEjeMayor() {
        return ejeMayor;
    }

    public double getEjeMenor() {
        return ejeMenor;
    }


    /* ---- Setters ---- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public void setEjeMenor(double ejeMenor) {
        this.ejeMenor = ejeMenor;
    }


    /* ---- Main methods ---- */
}
