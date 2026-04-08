class CuentaEj27 {
    String numero;
    String titular;
    double saldo;

    // Ejercicio 27:
    public CuentaEj27(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void mostrarDatos() {
        System.out.println("Cuenta: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }
}

public class Ejercicio27_28 {
    public static void main(String[] args) {
        // Ejercicio 28
        CuentaEj27 c1 = new CuentaEj27("001", "Sasha", 5000);
        CuentaEj27 c2 = new CuentaEj27("002", "Juan", 300);
        CuentaEj27 c3 = new CuentaEj27("003", "Maria", 1200);

        c1.mostrarDatos();
        c2.mostrarDatos();
        c3.mostrarDatos();
    }
}