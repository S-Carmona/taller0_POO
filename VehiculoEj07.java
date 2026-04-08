class VehiculoEj7 {
    String marca;
    String color;

    void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " Color: " + color);
    }
}

public class VehiculoEj07 {
    public static void main(String[] args) {
        VehiculoEj7 v1 = new VehiculoEj7();
        v1.marca = "Toyota";
        v1.color = "Blanco";

        VehiculoEj7 v2 = new VehiculoEj7();
        v2.marca = "Mazda";
        v2.color = "Rojo";

        v1.mostrarEstado();
        v2.mostrarEstado();
    }
}