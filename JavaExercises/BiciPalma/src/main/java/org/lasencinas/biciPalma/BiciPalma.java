package org.lasencinas.biciPalma;

import org.lasencinas.bicicleta.Bicicleta;
import org.lasencinas.estacion.Estacion;
import org.lasencinas.tarjetaUsuario.TarjetaUsuario;

public class BiciPalma {

    public static void main(String[] args) {

        Estacion estacion = new Estacion(1, "Manacor", 6);

        /* caso TEST visualizar estado de la estacion
         * muestra id, direccion, anclaje
         * */

        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.checkStation();

        /* caso TEST visualizar anclajes libres */

        System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        System.out.println("anclajesLibres: " + estacion.freeAnchorages());

        /* caso TEST anclar bicicleta(s) */

        System.out.println("\n **** caso TEST anclar bicicleta(s) **** \n");

        int[] bicicletas = {291, 292, 293, 294};

		/* // generar anclaje random
		for (int i: bicicletas){
			System.out.println( estacion.generarAnclaje());
		}
		*/

        for ( int id: bicicletas ){
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anchorBike(bicicleta);
        }

        System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.freeAnchorages());

        /* caso TEST consultar bicicletas ancladas */

        System.out.println("\n **** caso TEST consultar bicicletas ancladas **** \n");

        estacion.checkAnchorages();

        /* caso TEST retirar bicicleta */

        System.out.println("\n **** caso TEST retirar bicicleta **** \n");

        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);

        System.out.println("¿tarjeta de usuario activada? (true/false): " + estacion.readUserCard(tarjetaUsuario) );

        estacion.removeBike(tarjetaUsuario);

        estacion.checkAnchorages();

        System.out.println("anclajesLibres: " + estacion.freeAnchorages());
    }
}
