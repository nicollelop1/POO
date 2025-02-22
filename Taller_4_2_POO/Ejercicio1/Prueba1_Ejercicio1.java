package Taller_4_2_POO.Ejercicio1;

public class Prueba1_Ejercicio1 {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Marco Salas", 1000000);

        System.out.println("El nombre del empleado es: " + empleado1.nombre);
        System.out.println("El salario del empleado es: " + empleado1.getSalario());

        empleado1.setSalario(5000000);
        System.out.println("Nuevo salario es: " + empleado1.getSalario());

        empleado1.setSalario(-5000000); //es negativo no admite negativos

    }

}
