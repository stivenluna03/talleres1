
public class Producto {
 
    private String nombre;
    private double precio;

 
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

   
    public void mostrarProducto() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: $" + precio);
    }
}
