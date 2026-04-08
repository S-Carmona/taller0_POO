class UsuarioEj59 {
    String user, pass;
    boolean activo;

    void activar() { activo = true; }
    void desactivar() { activo = false; }
}
public class Ejercicio59 {
    public static void main(String[] args) {
        UsuarioEj59 u = new UsuarioEj59();
        u.activar();
    }
}