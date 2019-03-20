package org.lasencinas;

import java.util.*;

public enum Planeta {

    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    /* ---- Properties of the class ---- */
    private Double masa = 0d;
    private Double radio = 0d;
    private final Double G = 6.67300E-11; // Gravitational Constant

    List<Double> planets;


    /* ---- Constructors ---- */
    Planeta(Double masa, Double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    Planeta(Double... planets1) {
        planets = Arrays.asList(planets1);
    }


    /* ---- Getters ---- */
    public Double getMasa() {
        return masa;
    }

    public Double getRadio() {
        return radio;
    }

    public List<Double> getPlanets() {
        return planets;
    }


    /* ---- Setters ---- */
    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void setPlanets(List<Double> planets) {
        this.planets = planets;
    }


    /* ---- Behaviours ---- */
    public Double pesoSuperficie(Double peso) {
        return peso * 9.8;
    }

    public static Set<Planeta> getPlanetasTerrestres() {
        Set<Planeta> terrestialPlanets = new HashSet<>();
        for (Planeta planeta : Planeta.values()) {
            if (planeta.name() == EARTH.name() && planeta.name() == MARS.name() && planeta.name() == VENUS.name()
                    && planeta.name() == MERCURY.name()) {
                terrestialPlanets.add(planeta);
            }
        }
        return terrestialPlanets;
    }

    public static Set<Planeta> getGigantesGaseosos() {
        Set<Planeta> gaseousPlanets = new HashSet<>();
        gaseousPlanets.add(JUPITER);
        gaseousPlanets.add(URANUS);
        gaseousPlanets.add(NEPTUNE);
        gaseousPlanets.add(SATURN);
        return gaseousPlanets;
    }
}
