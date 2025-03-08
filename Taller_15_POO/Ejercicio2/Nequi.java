package Taller_15_POO.Ejercicio2;

public class Nequi implements Transferencia, Retiros {

    @Override
    public void retirar() {
        System.out.println("Se ha retirado por nequi");
    }

    @Override
    public void Transferir() {
        System.out.println("Se ha trasnferido a nequi");
    }
    
}
