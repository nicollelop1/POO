package Taller_1_POO;
public class Estudiante {

    public String nombre;
    public int edad;
    public String curso;

    public Estudiante() {
        nombre = "lucas";
        edad = 12;
        curso = "A1";
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
