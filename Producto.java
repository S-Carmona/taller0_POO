public class Producto {
    String nombre;
    int precio;
    int stock;

    public void mostrarProducto() {
        System.out.println("nombre: " + nombre);
        System.out.println("precio: " + precio);
        System.out.println("stock: " + stock);
    }

        public static void main(String[] args) {
        Producto producto1 = new Producto();

        producto1.nombre = "Leche";
        producto1.precio = 3500; 
        producto1.stock = 20;

        
        producto1.mostrarProducto();
    }
}