class LaptopEj21 {
    String marca;
    String procesador;
}

public class Ejercicio21 {
    public static void main(String[] args) {
        LaptopEj21 lap1 = new LaptopEj21();
        lap1.marca = "Dell";
        lap1.procesador = "i5";

        LaptopEj21 lap2 = new LaptopEj21();
        lap2.marca = "HP";
        lap2.procesador = "i5"; //En este caso tienen el mimo procesador pero diferente marca

        System.out.println("Laptop 1: " + lap1.marca + " con " + lap1.procesador);
        System.out.println("Laptop 2: " + lap2.marca + " con " + lap2.procesador);
    }
}