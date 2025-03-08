package Taller_12_POO.Ejercicio2;

public class EtiquetaService {

    public void generarEtiqueta(Producto producto){
        System.out.println("Etiqueta del producto: " + producto.getNombre());
        System.out.println("Precio del Producto: " + producto.getPrecio());
    }
    
}
