package Taller_14_POO.Ejercicio2;

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);

}