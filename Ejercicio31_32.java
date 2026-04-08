class ProductoEj31 {
    String nombre;
    double precio;

    public ProductoEj31(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Ejercicio 31: Método fábrica estático
    public static ProductoEj31 crearProductoBasico(String nombre) {
        return new ProductoEj31(nombre, 1.0); // Precio base de 1.0
    }

    void info() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}

public class Ejercicio31_32 {
    public static void main(String[] args) {
        // Ejercicio 32: Crear productos usando la fábrica
        ProductoEj31 p1 = ProductoEj31.crearProductoBasico("Lápiz");
        ProductoEj31 p2 = ProductoEj31.crearProductoBasico("Borrador");

        p1.info();
        p2.info();
    }
}