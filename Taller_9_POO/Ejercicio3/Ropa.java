package Taller_9_POO.Ejercicio3;

public class Ropa implements Instrumento{
    
    @Override
    public void tocar() {
        System.out.println("La ropa no puede tocar musica");
    }
/* Mala practica no tiene logica, la ropa no entra en la categoria de instrumento
     */
   
}
