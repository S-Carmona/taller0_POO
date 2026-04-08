class VentiladorEj38 {
    String marca;
    int velocidad;
    boolean encendido;

    void encender() {
        encendido = true;
        velocidad = 1;
    }

    void apagar() {
        encendido = false;
        velocidad = 0;
    }

    void subirVelocidad() {
        if (encendido && velocidad < 3) velocidad++;
    }
}

public class Ejercicio38 {
    public static void main(String[] args) {
        VentiladorEj38 v = new VentiladorEj38();
        v.marca = "Samurai";
        v.encender();
        v.subirVelocidad();
    }
}