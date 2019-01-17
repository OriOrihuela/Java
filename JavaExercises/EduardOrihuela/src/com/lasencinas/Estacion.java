package com.lasencinas;

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
    public int getId() { return this.id; }
    public String getDirection() { return this.direction;}
    public  int getNumberAnchorages() { return this.numberAnchorages;}
}
