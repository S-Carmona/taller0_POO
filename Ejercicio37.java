class CelularEj37 {
    String marca;
    int bateria;
    boolean prendido;

    void encender() {
        prendido = true;
    }

    void apagar() {
        prendido = false;
    }

    void cargarBateria(int cantidad) {
        bateria += cantidad;
        if (bateria > 100) bateria = 100;
    }
}

public class Ejercicio37 {
    public static void main(String[] args) {
        CelularEj37 c = new CelularEj37();
        c.marca = "Xiaomi";
        c.bateria = 20;
        c.cargarBateria(30);
        c.encender();
    }
}