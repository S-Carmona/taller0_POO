class ProductoEj15 {
    String nombre;
    int stock;

    void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada, Stock actual: " + stock);
        } else {
            System.out.println("No hay suficiente stock para vender: " + cantidad);
        }
    }

    void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Stock actualizado,Nuevo stock: " + stock);
    }
}

public class Ejercicio15_16 {
    public static void main(String[] args) {
        ProductoEj15 prod = new ProductoEj15();
        prod.nombre = "Arroz";
        prod.stock = 20;
        prod.vender(5);
        prod.reabastecer(10);
    }
}