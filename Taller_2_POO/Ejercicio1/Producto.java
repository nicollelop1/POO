package Taller_2_POO.Ejercicio1;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public void mostrarProducto() {
       System.out.println("El nombre del producto es " + nombre + " y su precio es " + precio);

    }


    
}
