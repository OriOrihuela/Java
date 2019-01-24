package org.lasencinas.estacion;

import java.util.concurrent.ThreadLocalRandom;

import org.lasencinas.bicicleta.Bicicleta;
import org.lasencinas.tarjetaUsuario.TarjetaUsuario;

public class Estacion {

    // Properties:
    private int id = 0;                 /* Identifier of the station */
    private String direction = null;       /* Direction of the station */
    private int numberAnchorages = 0;   /* Number of anchorages in station */
    private Bicicleta[] anchorages = null; /* Array of the different bikes stored in the station */

    // Constructor:
    public Estacion(int id, String direction, int anchorages) {
        this.id = id;
        this.direction = direction;
        this.numberAnchorages = anchorages;
        this.anchorages = new Bicicleta[anchorages];
    }

    // Setters and Getters:
        /* id property */
    public int getId() { return this.id; }

        /* direction property */
    public String getDirection() { return this.direction; }

        /* numberAnchorages property */
    public  int getNumberAnchorages() { return this.numberAnchorages; }


    // Behaviours of the class:
    public void checkStation() {
        System.out.println("id: " + getId());
        System.out.println("direction: " + getDirection());
        System.out.println("numberAnchorages: " + getNumberAnchorages());
    }

    public int  freeAnchorages() {
        int freeAnchorages = 0;
        for (Bicicleta anchorage: this.anchorages) {
            if (anchorage == null) {
                freeAnchorages++;
            }
        }
        return freeAnchorages;
    }

    public void printAnchorage(Bicicleta bicicleta, int numberAnchorage) {
        System.out.println("bicicleta: " + bicicleta.getId() + " in anchorage: " + numberAnchorage);
    }

    public boolean readUserCard(TarjetaUsuario tarjetaUsuario){
        return tarjetaUsuario.getActivated();
    }

    public void printBike(Bicicleta bicicleta, int numberAnchorage) {
        System.out.println("bike: " + bicicleta.getId() + " from anchorage " + numberAnchorage);
    }

    public void anchorBike(Bicicleta bicicleta) {
        int position = 0;
        int numberAnchorage = position + 1;

        for(Bicicleta anchorage: this.anchorages) {
            if (anchorage == null) {
                this.anchorages[position] = bicicleta;
                printAnchorage(bicicleta, numberAnchorage);
                break;
            }
            else {
                position++;
                numberAnchorage++;
            }
        }
    }

    public void checkAnchorages(){

        int position = 0;
        int numberAnchorage = 0;

        for(Bicicleta bicicleta: this.anchorages){
            numberAnchorage = position + 1;
            if( bicicleta != null ){
                System.out.println("Anchorage " + numberAnchorage + " " + this.anchorages[position].getId());
            }
            else
                System.out.println("Anchorage " + numberAnchorage + " " + " libre");

            position++;
        }
    }

    public int makeAnchorage(){ // a hardware anclaje
        Integer numeroEntero = ThreadLocalRandom.current().nextInt(0, this.anchorages.length);
        return numeroEntero;
    }

    public void removeBike(TarjetaUsuario tarjetaUsuario ){

        if ( readUserCard(tarjetaUsuario) ){

            boolean removedBike = false;

            while( !removedBike ){

                int position = makeAnchorage();
                int anchorageNumber  = position + 1;

                if (this.anchorages[position] != null){
                    printBike( this.anchorages[position], anchorageNumber );
                    this.anchorages[position] = null;
                    removedBike = true;
                }
            }
        }
    }
}