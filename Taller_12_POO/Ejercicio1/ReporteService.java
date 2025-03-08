package Taller_12_POO.Ejercicio1;

public class ReporteService {
    public void generarReporte(Libro libro) {
        System.out.println("-----------------REPORTE----------------------");
        System.out.println("Nombre del libro: " + libro.getNombre());
        System.out.println("Nombre del autor del libro: " + libro.getAutor());
        System.out.println("Numero de paginas: " + libro.getNumeroPaginas());
    }

}
