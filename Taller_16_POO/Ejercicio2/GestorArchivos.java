package Taller_16_POO.Ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombreArchivo, String contenido) {
        almacenamiento.guardar(nombreArchivo, contenido);
    }

    public String recuperarArchivo(String nombreArchivo, String contenido) {
        return almacenamiento.recuperar(nombreArchivo, contenido);
    }
}