class CelularEj20 {
    String marca;
    int bateria;
}

public class Ejercicio20 {
    public static void main(String[] args) {
        CelularEj20 c1 = new CelularEj20();
        CelularEj20 c2 = new CelularEj20();
        CelularEj20 c3 = new CelularEj20();

       
        // COMPARTEN: La estructura (todos tienen marca y batería) y los métodos.
        // SE DIFERENCIAN: En su estado (los valores específicos de cada uno).
        
        System.out.println("Tres objetos creados a partir de la clase Celular.");
    }
}