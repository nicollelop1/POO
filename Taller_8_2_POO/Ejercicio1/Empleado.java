package Taller_8_2_POO.Ejercicio1;

public class Empleado extends Persona{
    private String departamento;

    public Empleado(String nombre, int edad, String departamento){
        super(nombre,edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }



   

}
