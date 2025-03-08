package Taller_14_POO.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("la cantidad a retirar no puede ser mayor a el dinero depositado");
        }
    }
}