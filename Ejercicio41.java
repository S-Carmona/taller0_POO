class EmpleadoEj41 {
    String nombre;
    String cargo;
    double salario;
}

public class Ejercicio41 {
    public static void main(String[] args) {
        EmpleadoEj41 emp = new EmpleadoEj41();
        emp.nombre = "Sasha";
        emp.cargo = "secretaria";
        emp.salario = 2000000;

        // EXPLICACIÓN:
        // Usar una clase es mejor porque agrupa datos relacionados en una sola unidad.
        // Con variables sueltas (nombre1, cargo1, salario1), el código se vuelve difícil 
        // de escalar, muy largo y propenso a errores y desordenado a medida que crecen los registros
    }
}