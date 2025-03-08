package Taller_16_POO.Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardando archivo en la nube: " + nombreArchivo);
    }

    @Override
    public String recuperar(String nombreArchivo, String contenido) {
        System.out.println("Recuperando archivo de la nube: " + nombreArchivo);
        return "Contenido de " + contenido;
    }
}