package Taller_7_POO.Ejercicio2;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("El nombre del empleado es: " + nombre + ", y su salario es: " + calcularSalario() );
    }

    
}
