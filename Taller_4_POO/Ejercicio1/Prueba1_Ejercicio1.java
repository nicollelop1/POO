package Taller_4_POO.Ejercicio1;

public class Prueba1_Ejercicio1 {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Lucas Torres", 30, 4.5);

        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());
        
        System.out.println();
        
        estudiante1.setNombre("Maria Lopez");
        estudiante1.setEdad(-2); //como esta en negativo el valor no cambia y queda con el mismo//
        estudiante1.setNotaPromedio(3.5);

        estudiante1.mostrarDetalles();

    }

}
