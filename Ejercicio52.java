class FacturaEj52 {
    int numero;
    String cliente;
    double valor;

    void aplicarDescuento() {
        valor -= valor * 0.10;
        System.out.println("Nuevo valor con descuento: $" + valor);
    }
}
public class Ejercicio52 {
    public static void main(String[] args) {
        FacturaEj52 f = new FacturaEj52();
        f.valor = 100000;
        f.aplicarDescuento();
    }
}