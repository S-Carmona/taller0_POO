class TempEj56 {
    double celsius;
    double toFahrenheit() { return (celsius * 9/5) + 32; }
}
public class Ejercicio56 {
    public static void main(String[] args) {
        TempEj56 t = new TempEj56();
        t.celsius = 30;
        System.out.println("Fahrenheit: " + t.toFahrenheit());
    }
}