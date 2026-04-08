class MascotaEj18 {
    String nombre;
    int edad;

    void cumplirAnios() {
        edad++;
        System.out.println("Feliz cumple " + nombre + ",Ahora tienes " + edad + " años.");
    }
}

public class Ejercicio18 {
    public static void main(String[] args) {
        MascotaEj18 miPerro = new MascotaEj18();
        miPerro.nombre = "yuquita";
        miPerro.edad = 8;
        miPerro.cumplirAnios();
    }
}