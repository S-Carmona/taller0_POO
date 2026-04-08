class EdificioEj50 {
    int pisos = 10;
}

public class Ejercicio50 {
    public static void main(String[] args) {
        // ERROR CORREGIDO: Se añadió la creación del objeto para que la clase sea útil.
        EdificioEj50 miEdificio = new EdificioEj50();
        System.out.println("Pisos: " + miEdificio.pisos);
    }
}