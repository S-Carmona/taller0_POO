class EstudianteEj29 {
    String nombre;
    String codigo;
    int semestre;

    // 1. Constructor vacío
    public EstudianteEj29() {
        this.nombre = "Sin nombre";
        this.codigo = "000";
    }

    // 2. Constructor con nombre y código
    public EstudianteEj29(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = 1; // Por defecto a primer semestre
    }

    // 3. Constructor completo
    public EstudianteEj29(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }
}

public class Ejercicio29_30 {
    public static void main(String[] args) {
        // Ejercicio 30: Una forma de construcción para cada objeto
        EstudianteEj29 e1 = new EstudianteEj29();
        EstudianteEj29 e2 = new EstudianteEj29("Sasha", "G444555");
        EstudianteEj29 e3 = new EstudianteEj29("Luis", "G851T5", 2);

        e1.mostrarEstudiante();
        e2.mostrarEstudiante();
        e3.mostrarEstudiante();
    }
}