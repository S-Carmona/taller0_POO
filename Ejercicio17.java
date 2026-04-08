class EstudianteEj17 {
    String nombre;
    int semestre;

    void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
        System.out.println(nombre + " ahora se encuentra semestre: " + semestre);
    }
}

public class Ejercicio17 {
    public static void main(String[] args) {
        EstudianteEj17 est = new EstudianteEj17();
        est.nombre = "Sasha";
        est.semestre = 2;
        est.cambiarSemestre(3);
    }
}