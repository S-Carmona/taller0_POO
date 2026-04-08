class VehiculoEj11 {
    String marca;
    int velocidad = 0;

    void acelerar() {
        velocidad += 10;
        System.out.println("Acelerando... Velocidad actual: " + velocidad);
    }

    void frenar() {
        if (velocidad >= 10) {
            velocidad -= 10;
        } else {
            velocidad = 0;
        }
        System.out.println("Frenando... Velocidad actual: " + velocidad);
    }
}

public class Ejercicio11_12 {
    public static void main(String[] args) {
        VehiculoEj11 miCarro = new VehiculoEj11();
        miCarro.marca = "Mazda";
        miCarro.acelerar(); 
        miCarro.acelerar(); 
        miCarro.frenar();   
    }
}