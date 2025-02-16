package Taller_1_POO;
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
       saldo = 0.0;
       numeroCuenta = "Desconocido";
       tipoCuenta = "Desconocido";

    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;

    }
  
    @Override
    public String toString() {
        return "numero Cuenta: " + numeroCuenta + ", saldo: " + saldo + ", tipo: " + tipoCuenta;
    }

}
