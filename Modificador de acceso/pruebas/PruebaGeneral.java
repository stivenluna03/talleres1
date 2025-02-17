package pruebas;
import personas.Persona;
import personas.Producto;
import vehiculos.Moto;

public class PruebaGeneral {
    public static void main(String[] args) {
        // Intentar crear un objeto de la clase Moto
        Moto moto = new Moto("Deportiva");

        // Acceder al método de la clase Moto
        moto.mostrarInfo();

        // Intentar acceder a la propiedad tipo de Vehiculo (esto causará un error)
        // System.out.println(moto.tipo); // Error de compilación

        // Intentar crear un objeto de la clase Vehiculo (esto causará un error)
        // Vehiculo vehiculo = new Vehiculo("Sedán"); // Error de compilación

        Persona persona = new Persona();

     
        persona.edad = 30; // Acceso permitido
        System.out.println("Edad: " + persona.edad);

        // Acceder al atributo privado `nombre` a través de los métodos set y get
        persona.setNombre("Juan"); // Modificación permitida a través del método set
        System.out.println("Nombre: " + persona.getNombre()); // Acceso permitido a través del método get

        // Intentar acceder directamente al atributo privado (esto causará un error)
        // System.out.println("Nombre directo: " + persona.nombre); // Error de compilación

        
        Producto producto = new Producto("Laptop", 850, 10);
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
        System.out.println("Stock: " + producto.stock);

        
        producto.mostrarInfo();
    }
}

