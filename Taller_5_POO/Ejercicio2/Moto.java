package Taller_5_POO.Ejercicio2;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada){
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Cilindrada: " + cilindrada);

    }

    
}
