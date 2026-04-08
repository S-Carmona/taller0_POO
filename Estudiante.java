public class Estudiante {
    String nombre;
    int codigo;
    int semestre;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

        public static void main(String[] args) {
        Estudiante sasha = new Estudiante();

        sasha.nombre = "Sasha Carmona";
        sasha.codigo = 1254; 
        sasha.semestre = 2;

        
        sasha.mostrarInfo();
    }
}