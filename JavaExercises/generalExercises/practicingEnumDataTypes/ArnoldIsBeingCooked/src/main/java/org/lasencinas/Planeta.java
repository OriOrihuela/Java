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
    private double masa = 0d;
    private double radio = 0d;
    private final double CONSTANTEGRAVITACIONAL = 6.67300E-11;


    /* ---- Constructors ---- */
    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }


    /* ---- Getters ---- */
    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    public double getCONSTANTEGRAVITACIONAL() {
        return CONSTANTEGRAVITACIONAL;
    }


    /* ---- Behaviours ---- */
    public double gravedadEnLaSuperficie() {
        double constanteGravitacional = getCONSTANTEGRAVITACIONAL();
        double masaDelPlaneta = getMasa();
        double radioDelPlaneta = Math.pow(getRadio(), 2);

        // The formula to calculate the gravity on the surface of a planet.
        double gravedadEnLaSuperficie = constanteGravitacional * masaDelPlaneta / radioDelPlaneta;
        return gravedadEnLaSuperficie;
    }

    public double pesoSuperficie(double peso) {
        double gravedadDelPlaneta = gravedadEnLaSuperficie();

        // The formula to calculate your weight wherever the planet you are.
        double tuPeso = peso  * gravedadDelPlaneta / EARTH.gravedadEnLaSuperficie();
        return tuPeso;
    }

    public static EnumSet<Planeta> getPlanetasTerrestres() {
        /* Set<Planeta> terrestialPlanets = new HashSet<>();
        for (Planeta planeta : Planeta.values()) {
            if (planeta.name().equals(EARTH.name()) || planeta.name().equals(MARS.name()) ||
                    planeta.name().equals(VENUS.name()) || planeta.name().equals(MERCURY.name())) {
                terrestialPlanets.add(planeta);
            }*/

        EnumSet<Planeta> terrestialPlanets = EnumSet.range(MERCURY, MARS);
        return terrestialPlanets;
    }

    public static Set<Planeta> getGigantesGaseosos() {
        /*Set<Planeta> gaseousPlanets = new HashSet<>();
        gaseousPlanets.add(JUPITER);
        gaseousPlanets.add(URANUS);
        gaseousPlanets.add(NEPTUNE);
        gaseousPlanets.add(SATURN);*/

        EnumSet<Planeta> gaseousPlanets = EnumSet.complementOf(getPlanetasTerrestres());
        return gaseousPlanets;
    }
}
