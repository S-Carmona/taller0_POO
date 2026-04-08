class PerroEj47 {
    String nombre;
}

public class Ejercicio47 {
    public static void main(String[] args) {
        // correcion: Se añadió "= new PerroEj47()" para crear el objeto en memoria
        PerroEj47 miPerro = new PerroEj47(); 
        miPerro.nombre = "Lucas";
        System.out.println(miPerro.nombre);
    }
}