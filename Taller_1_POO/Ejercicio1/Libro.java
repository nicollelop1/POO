package Taller_1_POO.Ejercicio1;
public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        titulo = "Desconocido";
        autor = "Desconocido";
        numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    @Override
    public String toString() {
        return "Libro: " + titulo + ", Autor: " + autor + ", Paginas: " + numeroPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);

    }

}
