class PeliculaEj40 {
    String nombre;
    String genero;
    int minutos;

    void mostrarFicha() {
        System.out.println("Película: " + nombre + " | Género: " + genero + " | Duración: " + minutos + " min");
    }
}

public class Ejercicio40 {
    public static void main(String[] args) {
        PeliculaEj40 p = new PeliculaEj40();
        p.nombre = "Charlie y la fabrica de chocolate";
        p.genero = "ficcion";
        p.minutos = 148;
        p.mostrarFicha();
    }
}