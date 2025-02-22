package Taller_5_POO.Ejercicio3;

public class Banco {
    /* 
     protected double saldo;  Error, es mejor que sea privada para que 
     asi se podra controlar las modificaciones

     public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    */
    private double saldo; 

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDetalles(){
        System.out.println("Saldo: " + saldo);
    }
    
}
