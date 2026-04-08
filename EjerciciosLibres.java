// Ejercicio 66: Contexto Académico (Lo que llevas en el bulto)
class Cuaderno {
    String materia;
    int hojasUtiles;

    void usarHoja() {
        if(hojasUtiles > 0) hojasUtiles--;
    }
}

// Ejercicio 67: Vida Cotidiana (Algo simple de la casa)
class Cafetera {
    boolean tieneAgua;
    boolean encendida;

    void prepararCafe() {
        if (encendida && tieneAgua) {
            System.out.println("Saliendo café...");
        }
    }
}

// Ejercicio 68: Negocio (Una tienda de barrio o local de comida)
class PerroCaliente {
    String tipo; // Sencillo, Especial, Suizo
    double precio;
    boolean conTodo;

    void quitarCebolla() {
        System.out.println("Pedido sin cebolla.");
    }
}