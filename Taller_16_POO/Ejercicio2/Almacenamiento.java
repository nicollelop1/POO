package Taller_16_POO.Ejercicio2;

public interface Almacenamiento {
    void guardar(String nombreArchivo, String contenido);

    String recuperar(String nombreArchivo, String contenido);
}