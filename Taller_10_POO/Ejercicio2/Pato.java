package Taller_10_POO.Ejercicio2;

public class Pato implements Volador, Nadador {

    @Override
    public void volar(){
        System.out.println("El pato volo");

    }

    @Override
    public void nadar(){
        System.out.println("El pato nado");
        
    }
    
}
