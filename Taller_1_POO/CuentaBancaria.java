package Taller_1_POO;
public class CuentaBancaria {

    public String numeroCuenta;
    public double saldo;
    public String tipoCuenta;

    public CuentaBancaria() {
       saldo = 2000;
       numeroCuenta = "1234";
       tipoCuenta = "Ahorro";

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
