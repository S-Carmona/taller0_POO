class SemaforoEj54 {
    String color = "Rojo";

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("Semáforo en: " + color);
    }
}
public class Ejercicio54 {
    public static void main(String[] args) {
        SemaforoEj54 s = new SemaforoEj54();
        s.cambiarColor("Verde");
    }
}