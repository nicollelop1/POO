package Taller_4_POO.Ejercicio1;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
       
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;

        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio){
        if (notaPromedio > 0) {
          this.notaPromedio = notaPromedio;
            
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", edad: " + edad + ", nota promedio: " + notaPromedio);
    
    }

}
