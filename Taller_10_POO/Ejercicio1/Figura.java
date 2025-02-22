package Taller_10_POO.Ejercicio1;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.println("El area es: " + calcularArea());

    }
    
}
