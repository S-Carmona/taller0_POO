class ProductoEj8 {
    String nombre;
    double precio;

    void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}

public class Ejercicio08 {
    public static void main(String[] args) {
        ProductoEj8 p1 = new ProductoEj8();
        p1.nombre = "Laptop";
        p1.precio = 2500;

        ProductoEj8 p2 = new ProductoEj8();
        p2.nombre = "Mouse";
        p2.precio = 25;

        ProductoEj8 p3 = new ProductoEj8();
        p3.nombre = "Teclado";
        p3.precio = 45;

        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();
    }
}