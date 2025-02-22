package Taller_7_POO.Ejercicio3;

public abstract class Instrumento {

    public abstract void tocar();

    public void afinar() { //metodo concreto para sobrescribir
        System.out.println("El instrumento está afinado");
    }


}
