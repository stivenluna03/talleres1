public class Pruebas {
    
    public static void main(String[] args) {
        Estudiantes user = new Estudiantes(5, 18, "Steven");
        System.out.println("Detalles = " + user.getNombre() + user.getNotasPromedios() + user.getEdad());

      
                // Crear un objeto de la clase Coche
                Coche coche = new Coche("Toyota", "Corolla", 180);
        
                System.out.println("Detalles iniciales del coche: " + coche);
        
                // Estas líneas darán errores de compilación
        // coche.marca = "Ford";
        // coche.modelo = "Mustang";
        // coche.velocidadMaxima = 200;
                coche.acelerar(20); 
                coche.acelerar(-10); 
        
               
                System.out.println("Detalles finales del coche: " + coche);
            
                Persona persona = new Persona("Juan");

                // Intento de acceso directo a la propiedad privada nombre (esto causa un error)
                // persona.nombre = "Carlos"; // Error de compilación
        
                // Mostrar el nombre usando el método de la clase Persona
                persona.mostrarNombre();
        
    }
}
