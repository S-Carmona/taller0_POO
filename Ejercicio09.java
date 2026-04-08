class MascotaEj9 {
    String nombre;
    int edad;

    void mostrarEdad() {
        System.out.println("La edad de " + nombre + " es: " + edad + " años.");
    }
}

public class Ejercicio09 {
    public static void main(String[] args) {
        MascotaEj9 miMascota = new MascotaEj9();
        miMascota.nombre = "pepe";
        
        
        miMascota.edad = 1;
        miMascota.mostrarEdad();

        
        miMascota.edad = 2;
        miMascota.mostrarEdad();

        
        miMascota.edad = 5;
        miMascota.mostrarEdad();
    }
}