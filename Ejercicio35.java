class LamparaEj35 {
    String marca;
    boolean encendida;

    void encender() {
        encendida = true;
    }

    void apagar() {
        encendida = false;
    }

    void mostrarEstado() {
        System.out.println("Lámpara " + marca + " está " + (encendida ? "encendida" : "apagada"));
    }
}

public class Ejercicio35 {
    public static void main(String[] args) {
        LamparaEj35 l = new LamparaEj35();
        l.marca = "Philips";
        l.encender();
        l.mostrarEstado();
    }
}