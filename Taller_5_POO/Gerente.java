package Taller_5_POO;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;

    }

    @Override
    protected void mostrarDetalles(){
        super.mostrarDetalles(); // error sin super no funciona 
        System.out.println("Departamento: " + departamento);
    }

}
