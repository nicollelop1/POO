package Taller_12_POO.Ejercicio2;

public class Prueba {

    public static void main(String[] args) {
        
        Producto producto = new Producto("Mango", 3000);

        EtiquetaService etiqueta = new EtiquetaService();
        etiqueta.generarEtiqueta(producto);

        CalculoPrecioService precio = new CalculoPrecioService();
        precio.CalculoPrecio(producto);
    }
    
}
