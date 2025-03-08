package Taller_16_POO.Ejercicio2;

public class Prueba {

    public static void main(String[] args) {

        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(almacenamientoLocal);

        gestor.guardarArchivo("archivo1", "Contenido");
        String contenido = gestor.recuperarArchivo("archivo1", "Contenido");
        System.out.println(contenido);

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        gestor = new GestorArchivos(almacenamientoNube);

        gestor.guardarArchivo("archivo2", "Contenido de la nube");
        contenido = gestor.recuperarArchivo("archivo2", "Contenido de la nube");
        System.out.println(contenido);

    }

}
