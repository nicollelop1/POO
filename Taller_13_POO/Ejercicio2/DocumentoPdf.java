package Taller_13_POO.Ejercicio2;

public class DocumentoPdf extends Documento {

    public DocumentoPdf(String contenido) {
            super(contenido);
        }
    
        @Override
    public void exportar() {
        System.out.println("Exportando pdf");
    }
    
}
