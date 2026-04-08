class NotaEj57 {
    String asignatura;
    double n1, n2, n3;

    double calcularDefinitiva() { return (n1 + n2 + n3) / 3; }
}
public class Ejercicio57 {
    public static void main(String[] args) {
        NotaEj57 n = new NotaEj57();
        n.n1 = 4.5; n.n2 = 3.8; n.n3 = 5.0;
        System.out.println("Definitiva: " + n.calcularDefinitiva());
    }
}