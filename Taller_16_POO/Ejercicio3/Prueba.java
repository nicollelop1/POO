package Taller_16_POO.Ejercicio3;

public class Prueba {

    public static void main(String[] args) {

        GeneradorReporte reportePDF = new ReportePdf();
        GestorReportes gestor = new GestorReportes(reportePDF);

        gestor.generar("Lista de estudiantes");

        GeneradorReporte reporteExcel = new ReporteExcel();
        gestor = new GestorReportes(reporteExcel);

        gestor.generar("Lista de profesores");

    }

}
