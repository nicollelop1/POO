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
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    @Override
    public String toString() {
        return "Nosmbre estudiante: " + nombre + ", edad: " + edad + ", curso: " + curso;
    }

    public void mostrarDetalles() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("curso: " + curso);

    }

}
