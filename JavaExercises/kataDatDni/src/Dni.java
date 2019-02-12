
public class Dni {
    private String dni = null;
    private TablaAsignacion tabla = new TablaAsignacion();

    /* Constructors */

    public Dni() {}

    public Dni(String dni) {
        this.dni = dni;
    }

    /* Getters */

    public void setDni(String cadena){ this.dni = cadena; }
    public String getDni() {
        return this.dni;
    }

    public char getParteAlfabetica(String dni) {
        return dni.charAt(dni.length() - 1);
    }
        /* Functions

        private char calcularLetra() {

        }
        public Boolean verificarLetra(){

        } */

    public String getParteNumerica(){
        return this.dni.substring(0,this.dni.length()-1);
    }
    /* tabla **/

}
/* for(int i=0;i< array.lenght;i++){
       if ( !funcion(srray[i])){
       }
}*/


