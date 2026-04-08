public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarMascota() {
        System.out.println("nombre: " + nombre);
        System.out.println("especie: " + especie);
        System.out.println("edad: " + edad);
    }

        public static void main(String[] args) {
        Mascota mascota1 = new Mascota();

        mascota1.nombre = "pepe";
        mascota1.especie = "perro"; 
        mascota1.edad = 3;

        
        mascota1.mostrarMascota();
    }
}