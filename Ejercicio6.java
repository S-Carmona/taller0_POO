public class Ejercicio6 {
    String nombre;
    int codigo;
    int semestre;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

        public static void main(String[] args) {
        Ejercicio6 est1 = new Ejercicio6();

        est1.nombre = "keren mendoza";
        est1.codigo = 00001; 
        est1.semestre = 8;

        
        est1.mostrarInfo();
    }
}