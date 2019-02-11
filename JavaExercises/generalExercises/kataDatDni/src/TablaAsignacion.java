
public class TablaAsignacion {

    char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };


    public char getLetra(int indice){
        return this.tabla[indice];
    }

    public int getLongitud(){
        return this.tabla.length;
    }

    public char calcularLetra(String DNI) {
        int dni = Integer.parseInt(DNI);
        int posicion = dni % getLongitud();
        return getLetra(posicion);
    }
}


/* int posicion = calcularLetra();
   char letra = dni.getLetra();

   ----------------------

   char letra = calcularLetra(); (Si al final de Calcular letra usas get letra)
 */
