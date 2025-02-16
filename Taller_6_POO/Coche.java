package Taller_6_POO;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;

    }

    static void mostrarCoches(){
        System.out.println("Numero de coches:  " + contadorCoches);

    }

}
