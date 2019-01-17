package com.lasencinas;

public class TarjetaUsuario {

    // Properties
    private int id; /* Identifier of the card; number of nine digits */
    private boolean activated;  /* Logical value that indicates if the card is activated or not */

    // Constructor
    public TarjetaUsuario() {}

    public TarjetaUsuario(int id) { this.id = id;}

    // Setters and Getters of all properties
            /* ID property --> Setters/Getters */
    public void setId(int number) { this.id = number;}
    public int getId() { return this.id;}

            /* Activated property --> Setters/Getters */
    public void setActivated(boolean sentence) { this.activated = sentence;}
    public boolean getActivated() { return this.activated;}


}
