class AvionEj60 {
    String aerolinea, destino;
    int pasajeros;

    void abordar(int cant) {
        pasajeros += cant;
        System.out.println("Pasajeros a bordo: " + pasajeros);
    }
}
public class Ejercicio60 {
    public static void main(String[] args) {
        AvionEj60 a = new AvionEj60();
        a.abordar(150);
    }
}
