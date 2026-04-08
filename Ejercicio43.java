class ComputadorEj43 {
    String procesador;
    int ram;
}

public class Ejercicio43 {
    public static void main(String[] args) {
        ComputadorEj43 pc = new ComputadorEj43();
        pc.procesador = "i7";
        pc.ram = 16;

        // EXPLICACIÓN:
        // El plano conceptual (la clase) es solo una definición técnica que no 
        // consume recursos físicos. La máquina concreta (el objeto) es la ejecución 
        // en la memoria RAM, con una identidad única y lista para procesar datos.
    }
}