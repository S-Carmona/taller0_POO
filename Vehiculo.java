public class Vehiculo {
    String marca;
    int modelo;
    int velocidadActual;

    public void mostrarEstado() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("velocidadActual: " + velocidadActual);
    }

        public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();

        vehiculo1.marca = "Porshe";
        vehiculo1.modelo = 2004; 
        vehiculo1.velocidadActual = 20;

        
        vehiculo1.mostrarEstado();
    }
}