package Taller_16_POO.Ejercicio3;

public class ReportePdf implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en PDF: " + datos);
    }
}