package Taller_12_POO.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        Libro libro1 = new Libro("El principito", "Antoine de Saint", 90);

        ReporteService reporte = new ReporteService();
        reporte.generarReporte(libro1);

        PersistenciaService persistencia = new PersistenciaService();
        persistencia.guardarLibro(libro1);

    }

}
