class RectanguloEj51 {
    double base;
    double altura;

    double calcularArea() { return base * altura; }
    double calcularPerimetro() { return 2 * (base + altura); }

    void mostrarResultados() {
        System.out.println("Área: " + calcularArea() + " | Perímetro: " + calcularPerimetro());
    }
}
public class Ejercicio51 {
    public static void main(String[] args) {
        RectanguloEj51 r = new RectanguloEj51();
        r.base = 5; r.altura = 3;
        r.mostrarResultados();
    }
}