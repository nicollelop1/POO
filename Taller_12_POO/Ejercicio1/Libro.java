package Taller_12_POO.Ejercicio1;

public class Libro {

    private String nombre;
    private String autor;
    private int numeroPaginas;

    public Libro(String nombre, String autor, int numeroPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

}
