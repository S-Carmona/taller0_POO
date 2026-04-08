class Motor {
    int potencia = 100;
}

class Carro {
    Motor mot = new Motor();
}

public class Ejercicio49 {
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        // correcion: Para llegar a potencia, debo pasar por la referencia 'mot'.
        System.out.println("Potencia: " + miCarro.mot.potencia);
    }
}