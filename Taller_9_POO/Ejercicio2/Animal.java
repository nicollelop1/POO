package Taller_9_POO.Ejercicio2;

public class Animal implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El animal volo");

    }

    @Override
    public void nadar(){
        System.out.println("El animal nado");
    }

}
