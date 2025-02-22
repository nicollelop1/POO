package Taller_4_2_POO.Ejercicio2;

public class Prueba2_Ejercicio2 {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("123", 4000, "Ahorro");

        //System.out.println(cuenta1.numeroCuenta); Error, numeroCuenta es private
        //System.out.println("El saldo es: " + cuenta1.Saldo()); aqui hay error por que es private
        System.out.println("El saldo es: " + cuenta1.getSaldo()); //aqui no hay error por que hace uso del get 

        cuenta1.setSaldo(20000);
        System.out.println("El nuevo saldo es: " + cuenta1.getSaldo()); //como es positivo si cambia
        cuenta1.setSaldo(-200); // no cambia el saldo por que es negativo


        cuenta1.mostrarDetalles();
        

        
    }
    
}
