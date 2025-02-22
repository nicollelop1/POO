package Taller_8_POO.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 3000000);
        Gerente gerente1 = new Gerente("Maria", 2000000, "Publicidad");

        empleado1.mostrarDetalles();
        System.out.println();
        gerente1.mostrarDetalles();
        
    }
    
}
