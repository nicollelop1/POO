package Taller_10_POO.Ejercicio3;

public class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("La guitarra está sonando.");
    }

    /*
    Si la clase guitarra no usa el metodo tocar(); salta ERROR
     @Override
    public void tocar() {
        System.out.println("La guitarra está sonando.");
    }
     
     */


    
    
}
