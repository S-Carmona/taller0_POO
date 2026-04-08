class PuertaEj36 {
    String material;
    boolean abierta;

    void abrir() {
        abierta = true;
    }

    void cerrar() {
        abierta = false;
    }

    void mostrarEstado() {
        System.out.println("Puerta de " + material + " está " + (abierta ? "abierta" : "cerrada"));
    }
}

public class Ejercicio36 {
    public static void main(String[] args) {
        PuertaEj36 p = new PuertaEj36();
        p.material = "Madera";
        p.abrir();
        p.mostrarEstado();
    }
}