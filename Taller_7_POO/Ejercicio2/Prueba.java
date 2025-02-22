package Taller_7_POO.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        
        Empleado vendedor1 = new Vendedor(500, "Lucas Hernandez");
        Empleado gerente1 =  new Gerente(700, "Maria Torrea");

        vendedor1.mostrarDetalles();
        System.out.println();
        gerente1.mostrarDetalles();
    }
    
}
