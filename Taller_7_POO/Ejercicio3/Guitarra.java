package Taller_7_POO.Ejercicio3;

public class Guitarra extends Instrumento {

//mala practica sobrescribir un metodo abstracto
    @Override
    public void tocar() { 
        System.out.println("Se ha tocado la guitarra");
    }

    
}
