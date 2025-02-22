package Taller_5_POO.Ejercicio1;

public class Prueba1_Ejercicio1 {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Lucas Torres", 1000);
        Gerente gerente1 = new Gerente("Marco Perez", 2000, "inventario");

        empleado1.mostrarDetalles();
        gerente1.mostrarDetalles();

    }
    
}
