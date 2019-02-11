
public class TestDni {

    public static void main(String[] args) {

        TablaAsignacion tabla = new TablaAsignacion();
        Dni dni1 = new Dni("43204761C");

        if (tabla.calcularLetra("43204761") == 'C') {
            System.out.println("Correcto");
        } else {
            System.out.println("No correcto");
        }

        if (tabla.calcularLetra("41543266") == 'E') {
            System.out.println("Correcto");
        } else {
            System.out.println("No correcto");
        }

        System.out.println(dni1.getParteNumerica()); // Funciona correctamente
    }
}

