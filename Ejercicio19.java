class EstudianteEj19 {
    String nombre;
}

public class Ejercicio19 {
    public static void main(String[] args) {
        // EstudianteEj19 es una CLASE porque es el plano, molde o plantilla 
        // que define qué datos tendrá cualquier estudiante.
        
        EstudianteEj19 est1 = new EstudianteEj19();
        est1.nombre = "Sasha";
        
        // est1 es un OBJETO porque es la instancia real, con los datos específicos, 
        // creada a partir de ese molde La clase no ocupa espacio real el objeto sí.
        
        System.out.println("Estudiante: " + est1.nombre);
    }
}