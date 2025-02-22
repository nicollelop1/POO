package Taller_4_2_POO.Ejercicio2;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser valores negativos");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Tipo de Cuenta: " + tipoCuenta + ", Saldo: " + saldo + ", el numero de cuenta es: " + numeroCuenta);
    }
}
    

