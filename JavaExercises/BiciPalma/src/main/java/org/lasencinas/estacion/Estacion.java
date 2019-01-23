package org.lasencinas.estacion;

import org.lasencinas.bicicleta.Bicicleta;

public class Estacion {

    // Properties of the class
    private int id;                 /* Identifier of the station */
    private String direction;       /* Direction of the station */
    private int numberAnchorages;   /* Number of anchorages in station */
    private Bicicleta[] anchorages; /* Array of the different bikes stored in the station */

    // Constructor
    public Estacion() {}

    public Estacion(int id, String direction, int anchorages) {
        this.id = id;
        this.direction = direction;
        this.numberAnchorages = anchorages;
        this.anchorages = new Bicicleta[anchorages];
    }

    // Setters adn getters of all properties

    /* id property */
    public int getId() { return this.id; }

    /* direction property */
    public String getDirection() { return this.direction; }

    /* numberAnchorages property */
    public  int getNumberAnchorages() { return this.numberAnchorages; }
}
