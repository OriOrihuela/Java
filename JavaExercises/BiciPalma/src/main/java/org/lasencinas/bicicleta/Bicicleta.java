package org.lasencinas.bicicleta;

public class Bicicleta {

    // Properties:
    private int id = 0; /* Identifier of the bike; number of three digits */

    // Constructor:
    public Bicicleta(int id) { this.id = id; }

    // Setters and Getters:
        /* id property */
    public void setId(int number) { this.id = number; }
    public int getId() { return this.id; }
}
