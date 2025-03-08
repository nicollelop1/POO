package Taller_13_POO.Ejercicio2;

public abstract class Documento {
    protected String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public abstract void exportar();
}
