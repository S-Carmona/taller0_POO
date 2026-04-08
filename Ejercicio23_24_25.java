class LibroEj23 {
    String titulo;
    String autor;

    public LibroEj23() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
    }

    public LibroEj23(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor);
    }
}

public class Ejercicio23_24_25 {
    public static void main(String[] args) {
        LibroEj23 libro1 = new LibroEj23(); 
        LibroEj23 libro2 = new LibroEj23("Cien años de soledad", "Gabo"); // Usa parámetros

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}