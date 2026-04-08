public class cuentaBancaria {
    int numero;
    String titular;
    int saldo;

    public void mostrarCuenta() {
        System.out.println("numero: " + numero);
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + saldo);
    }

        public static void main(String[] args) {
        cuentaBancaria cuenta1 = new cuentaBancaria();

        cuenta1.numero = 45678;
        cuenta1.titular = "jose"; 
        cuenta1.saldo = 80000;

        
        cuenta1.mostrarCuenta();
    }
}