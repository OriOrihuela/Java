package org.lasencinas.tarjetaUsuario;

public class TarjetaUsuario {

    // Properties:
    private String id = null;             /* Identifier of the card; number of nine digits */
    private Boolean activated = false;  /* Logical value that indicates if the card is activated or not */

    // Constructor:
    public TarjetaUsuario(String id, boolean activated) {
        this.id = id;
        this.activated = activated;
    }

    // Setters and Getters:
        /* id property */
    public void setId(String number) { this.id = number; }
    public String getId() { return this.id; }

        /* activated property */
    public void setActivated(boolean activated) { this.activated = activated; }
    public boolean getActivated() { return this.activated; }
}