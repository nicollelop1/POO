package Taller_13_POO.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        
        Documento documento1 =  new DocumentoPdf("Tarea");
        Documento documento2 =  new DocumentoWord("Reporte de trabajo");
        Documento documento3 =  new DocumentoExcel("Lista de estudiantes");

        documento1.exportar();
        documento2.exportar();
        documento3.exportar();
    }
    
}
