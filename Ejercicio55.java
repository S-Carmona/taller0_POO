class RelojEj55 {
    int h, m, s;
    void mostrarHora() {
        System.out.printf("Hora: %02d:%02d:%02d\n", h, m, s);
    }
}
public class Ejercicio55 {
    public static void main(String[] args) {
        RelojEj55 r = new RelojEj55();
        r.h = 18; r.m = 30; r.s = 5;
        r.mostrarHora();
    }
}