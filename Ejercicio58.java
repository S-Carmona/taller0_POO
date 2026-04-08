class ItemEj58 {
    String nombre;
    int cantidad;
    double precio;

    double total() { return cantidad * precio; }
}
public class Ejercicio58 {
    public static void main(String[] args) {
        ItemEj58 i = new ItemEj58();
        i.cantidad = 10; i.precio = 5.5;
        System.out.println("Total inventario: $" + i.total());
    }
}