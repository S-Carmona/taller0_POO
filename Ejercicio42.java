class CursoEj42 {
    String nombreCurso;
    int creditos;
}

public class Ejercicio42 {
    public static void main(String[] args) {
        CursoEj42 c1 = new CursoEj42();
        c1.nombreCurso = "POO";
        
        CursoEj42 c2 = new CursoEj42();
        c2.nombreCurso = "Cálculo integral";

        // EXPLICACIÓN:
        // Ambos pertenecen a la misma clase porque comparten el mismo "molde" 
        // y comportamiento (atributos y métodos). La diferencia está en el "estado", 
        // que son los valores específicos que toma cada objeto en la memoria.
    }
}
