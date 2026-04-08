class ProductoEj26 {
    String nombre;
    double precio;

    public ProductoEj26() {}

    public ProductoEj26(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

public class Ejercicio26 {
    public static void main(String[] args) {
        ProductoEj26 p1 = new ProductoEj26();
        ProductoEj26 p2 = new ProductoEj26("Smartphone", 8000000);
        
    }
}