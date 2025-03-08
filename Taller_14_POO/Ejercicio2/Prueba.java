package Taller_14_POO.Ejercicio2;

public class Prueba {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorros(2000.0);

        cuenta.depositar(500.0);
        System.out.println("Total saldo: " + cuenta.getSaldo());

        cuenta.retirar(200.0);
        System.out.println("Total saldo despues de retirar" + cuenta.getSaldo());

        cuenta.retirar(2000.0);
        System.out.println("Total saldo despues de retirar" + cuenta.getSaldo());
       
        cuenta.retirar(400.0);
        System.out.println("Total saldo despues de retirar" + cuenta.getSaldo());

    }
}
