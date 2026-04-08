class ReservaEj53 {
    String cliente;
    String fecha;
    boolean activa;

    void confirmar() { activa = true; }
    void cancelar() { activa = false; }
}
public class Ejercicio53 {
    public static void main(String[] args) {
        ReservaEj53 res = new ReservaEj53();
        res.confirmar();
        System.out.println("Reserva activa: " + res.activa);
    }
}