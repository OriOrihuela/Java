package com.lasencinas;

public class Bicicleta {

    // Properties of the Class
    private int id; /* Identifier of the bike; number of three digits */

    // Constructor
    public Bicicleta() {}

    public Bicicleta(int id) { this.id = id; }

    // Setters and Getters
            /* ID property --> Setters/Getters */
    public void setId(int number) { this.id = number;}
    public int getId() { return this.id; }
}
