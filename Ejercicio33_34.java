class LibroEj33 {
    String titulo;
    String autor;

    public LibroEj33(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Ejercicio 33: Constructor copia
    public LibroEj33(LibroEj33 otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
    }

    void detalles() {
        System.out.println("Título: " + titulo + " | Autor: " + autor);
    }
}

public class Ejercicio33_34 {
    public static void main(String[] args) {
        // Ejercicio 34: Original y Copia
        LibroEj33 original = new LibroEj33("Rayuela", "Julio Cortázar");
        LibroEj33 copia = new LibroEj33(original);

        System.out.println("Original");
        original.detalles();
        System.out.println("Copia");
        copia.detalles();
    }
}