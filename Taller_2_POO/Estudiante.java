package Taller_2_POO;

public class Estudiante {

    public String nombre;
    public int edad;

    public Estudiante() {
        this("desconocido", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }
    
    
    public void mostrarEstudiante() {
        System.out.println("El nombre del estudiante es " + nombre + " y su edad es " + edad);
 
     }
 
}
