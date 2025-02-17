
package vehiculos;


public class Moto extends Vehiculo {
    // Constructor
    public Moto(String tipo) {
        super(tipo); 
    }


    public void mostrarInfo() {
        System.out.println("Esta es una moto.");
        mostrarTipo(); 
    }
}

