package Taller_3_POO.Ejercicio1;

 class Producto {

    String nombre;
    double precio;
    int stock;

     Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}


