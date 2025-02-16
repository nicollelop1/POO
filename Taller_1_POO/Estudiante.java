package Taller_1_POO;
public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        curso = "Desconocido";
    }

    public Estudiante(String curso) {
        this.curso = curso;

    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public Estudiante(String nombre, int edad, String curso) {
        this(curso);
        this.nombre = nombre;
        this.edad = edad;

    }
    
    @Override
    public String toString() {
        return "Nombre estudiante: " + nombre + ", edad: " + edad + ", curso: " + curso;
    }

}
