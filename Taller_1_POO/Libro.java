package Taller_1_POO;
public class Libro {

    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
        titulo = "La luna";
        autor = "Marco Rivera";
        numeroPaginas = 50;
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
