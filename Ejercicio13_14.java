class CuentaEj13 {
    double saldo;

    void consignar(double valor) {
        saldo += valor;
        System.out.println("Consignación exitosa. Nuevo saldo: " + saldo);
    }

    void retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar: " + valor);
        }
    }
}

public class Ejercicio13_14 {
    public static void main(String[] args) {
        CuentaEj13 miCuenta = new CuentaEj13();
        miCuenta.saldo = 100;
        miCuenta.consignar(50);
        miCuenta.retirar(30);
        miCuenta.retirar(200); 
    }
}