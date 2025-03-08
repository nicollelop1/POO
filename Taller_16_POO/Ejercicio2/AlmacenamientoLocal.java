package Taller_16_POO.Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardando archivo localmente: " + nombreArchivo);
    }

    @Override
    public String recuperar(String nombreArchivo, String contenido) {
        System.out.println("Recuperando archivo local: " + nombreArchivo);
        return "Contenido" + contenido;
    }
}