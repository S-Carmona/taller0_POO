class CuentaEj10 {
    String titular;
    double saldo;

    void mostrarCuenta() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        CuentaEj10 cuenta1 = new CuentaEj10();
        cuenta1.titular = "Sasha";
        cuenta1.saldo = 1000.0;

        CuentaEj10 cuenta2 = new CuentaEj10();
        cuenta2.titular = "Pepe";
        cuenta2.saldo = 50.0;

        System.out.println("Recibo");
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}