package Taller_1_POO;
import java.util.*;

import Taller_1_POO.Ejercicio1.Libro;
import Taller_1_POO.Ejercicio2.CuentaBancaria;
import Taller_1_POO.Ejercicio3.Estudiante;

public class ProyectoIntegrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el numero de páginas:");
        int paginas = scanner.nextInt();
        scanner.nextLine(); 

        Libro libro = new Libro(titulo, autor, paginas);
        System.out.println();

        System.out.println("Ingrese el numero de cuenta bancaria:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el tipo de cuenta:");
        String tipoCuenta = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();  

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, tipoCuenta, saldo);
        System.out.println();

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        scanner.nextLine();  
        System.out.println("Ingrese el curso del estudiante:");
        String curso = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        System.out.println("DATOS LIBRO");
        System.out.println(libro);
        System.out.println("DATOS CUENTA BANCARIA");
        System.out.println(cuenta);
        System.out.println("DATOS ESTUDIANTE");
        System.out.println(estudiante);
        
        scanner.close();

        
    }
}
