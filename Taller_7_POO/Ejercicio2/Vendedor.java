package Taller_7_POO.Ejercicio2;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(double comision, String nombre) {
        super(nombre);
        this.comision = comision;
       
    }

    @Override
    public double calcularSalario() {
        return 500000 + comision;

    }
    
}
