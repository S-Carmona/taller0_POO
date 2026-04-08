class CancionEj39 {
    String titulo;
    String artista;
    double duracion;

    void mostrarInfo() {
        System.out.println("Canción: " + titulo + " - " + artista + " (" + duracion + " min)");
    }
}

public class Ejercicio39 {
    public static void main(String[] args) {
        CancionEj39 c = new CancionEj39();
        c.titulo = "Die for You";
        c.artista = "joji";
        c.duracion = 3.32;
        c.mostrarInfo();
    }
}