package Taller_7_POO.Ejercicio2;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(double bono, String nombre) {
        super(nombre);
        this.bono = bono;
       
    }
    @Override
    public double calcularSalario() {
        return 1000000 + bono;

    }

}
