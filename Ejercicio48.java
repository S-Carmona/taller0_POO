class PersonaEj48 {
    String nombre; 

    void asignarNombre(String nombre) {
        // correcion: Se usa "this" para diferenciar el atributo del parámetro local.
        this.nombre = nombre; 
    }
}

public class Ejercicio48 {
    public static void main(String[] args) {
        PersonaEj48 p = new PersonaEj48();
        p.asignarNombre("Sasha");
        System.out.println(p.nombre);
    }
}